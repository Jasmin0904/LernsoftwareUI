package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LogoutController {

	public LogoutController() {
		
	}
	
	@FXML
	private Button goToLogin;
	
	public void goTo() throws IOException {
		Main m = new Main();
		m.changeScene("Login.fxml");
	}
}
