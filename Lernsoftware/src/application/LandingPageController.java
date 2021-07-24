package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

public class LandingPageController {

	public LandingPageController() {
		
	}
	
	//Menü
	
	@FXML
	private Hyperlink menuKleinkinder;
	
	@FXML
	private Hyperlink menuSchueler;
	
	@FXML
	private Hyperlink menuStudenten;
	
	@FXML
	private Hyperlink menuErwachsene;
	
	//Dropdown Profil
	
	@FXML
	private SplitMenuButton profile;
	
	@FXML
	private MenuItem favorites;
	
	@FXML
	private MenuItem setups;
	
	@FXML
	private MenuItem logout;
	
	//Suche
	
	@FXML
	private TextField search;
	
    @FXML
	private Label wrongSearch;
    
    //Übersicht Bereiche
    
	@FXML
	private Hyperlink linkKleinkinder;
	
	@FXML
	private Hyperlink linkSchueler;
	
	@FXML
	private Hyperlink linkStudenten;
	
	@FXML
	private Hyperlink linkErwachsene;
	
	
	
	public void goTo() throws IOException {
		Main m = new Main();
		if(menuKleinkinder.isVisited() || linkKleinkinder.isVisited()) {
			m.changeScene("Kleinkinder.fxml");
		}
		else if(menuSchueler.isVisited() || linkSchueler.isVisited()) {
			m.changeScene("Schueler.fxml");
		}
		else if(menuStudenten.isVisited() || linkStudenten.isVisited()) {
			m.changeScene("Studenten.fxml");
		}
		else if(menuErwachsene.isVisited() || linkErwachsene.isVisited()) {
			m.changeScene("Erwachsene.fxml");
		}
	}
	
	public void dropdownFavorites() throws IOException {
		Main m = new Main();
		m.changeScene("Favorites.fxml");
	}
	
	public void dropdownSetups() throws IOException {
		Main m = new Main();
		m.changeScene("Setups.fxml");
	}
	
	public void dropdownLogout() throws IOException {
		Main m = new Main();
		m.changeScene("Logout.fxml");
	}
	
	public void searchFor() throws IOException {
		Main m = new Main();
    	if(search.getText().toString().equals("Zahlen")) {
    		m.changeScene("SMZahlen.fxml");
    	}
    	else if(search.getText().toString().equals("Farben")) {
    		m.changeScene("SMFarben.fxml");
    	}
    	else if(search.getText().toString().equals("Buchstaben") || search.getText().toString().equals("Alphabet")) {
    		m.changeScene("SMBuchstaben.fxml");
    	}
    	else if(search.getText().toString().equals("Gedichte")) {
    		m.changeScene("SMDeutsch.fxml");
    	}
    	else if(search.getText().toString().equals("Essay")) {
    		m.changeScene("SMEnglisch.fxml");
    	}
    	else if(search.getText().toString().equals("Addieren")) {
    		m.changeScene("SMMathe.fxml");
    	}
    	else if(search.getText().toString().equals("BWL")) {
    		m.changeScene("SMBWL.fxml");
    	}
    	else if(search.getText().toString().equals("Vektoren")) {
    		m.changeScene("SMLA.fxml");
    	}
    	else if(search.getText().toString().equals("Bilanzierung")) {
    		m.changeScene("SMRW.fxml");
    	}
    	else if(search.getText().toString().equals("VWL")) {
    		m.changeScene("SMVWL.fxml");
    	}
    	else if(search.getText().toString().equals("Französisch")) {
    		m.changeScene("SMSprachen.fxml");
    	}
    	else if(search.getText().toString().equals("Trompete")) {
    		m.changeScene("SMInstrumente.fxml");
    	}
    	else if(search.getText().toString().equals("Blumen")) {
    		m.changeScene("SMPflanzen.fxml");
    	}
    	else {
    		wrongSearch.setText("Keinen Beitrag gefunden.");
    	}
	}
}
