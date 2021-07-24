package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

	public LoginController() {
		
	}
	
	@FXML
	private Label wrongLogin;
	@FXML
	private Label lblUsername;
	@FXML
	private TextField username;
	@FXML
	private Label lblPassword;
	@FXML
	private PasswordField password;
	@FXML
	private Hyperlink register;
	@FXML
	private Hyperlink forgotPassword;
	@FXML
	private Button btnLogin;
	
	public void userLogin() throws Exception{
		checkLogin();
	}

	private void checkLogin() throws Exception{
		if(username.getText().toString().contentEquals("user") && password.getText().toString().equals("123")) {
			wrongLogin.setText("Anmeldung erfolgreich!");
			Main m = new Main();
			m.changeScene("LandingPage.fxml");
		}
		else if(username.getText().isEmpty() && password.getText().isEmpty()) {
			wrongLogin.setText("Bitte geben Sie ihre Daten ein.");
		}
		else {
			wrongLogin.setText("Benutzername oder Passwort falsch.");
		}
		
	}
	
	public void goTo() throws IOException {
		Main m = new Main();
		if(register.isVisited()) {
			m.changeScene("Register.fxml");
		}
		else if(forgotPassword.isVisited()) {
			m.changeScene("ForgotPassword.fxml");
		}
	}
	
	
}
