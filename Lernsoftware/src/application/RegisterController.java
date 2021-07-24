package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {

	public RegisterController() {
		
	}
	
	@FXML
    private Label lblVorname;

    @FXML
    private Label lblNachname;

    @FXML
    private Label lblBirthday;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblUsername;

    @FXML
    private Label lblPassword;

    @FXML
    private TextField vorname;

    @FXML
    private TextField nachname;

    @FXML
    private TextField email;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private DatePicker birthday;

    @FXML
    private Button save;

    @FXML
    private Button back;

    @FXML
    private Label wrongInfos;

	
	public void goToHomepage() throws IOException {
		Main m =new Main();
		m.changeScene("Login.fxml");
	}
	
	public void checkInfos() throws Exception{
    	if(vorname.getText().isEmpty() || nachname.getText().isEmpty() ||email.getText().isEmpty() || username.getText().isEmpty() || password.getText().isEmpty()) {
    		wrongInfos.setText("Bitte geben Sie alle Daten ein.");
    	}
    	else {
    		wrongInfos.setText("");
    	}
    }
}
