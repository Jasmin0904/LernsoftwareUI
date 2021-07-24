package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ForgotPasswordController {

    @FXML
    private Text txtLogin;
    
    @FXML
    private Label wrongEmail;

    @FXML
    private Label lblEmail;

    @FXML
    private TextField email;

    @FXML
    private Button btnResetPW;

    @FXML
    private Hyperlink again;

    @FXML
    private Button btnGoToHomepage;

    
    
    
    @FXML
    void goToHomepage(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("Login.fxml");
    }

    public void checkEmail() throws Exception{
    	if(email.getText().isEmpty()) {
    		wrongEmail.setText("Bitte geben Sie ihre Email ein.");
    	}
    	else {
    		wrongEmail.setText("");
    	}
    }
}