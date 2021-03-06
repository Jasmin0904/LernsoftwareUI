package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import java.io.IOException;

public class SMKlasse3Controller {

	//Men?
	
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
    
    //Breadcrumbs

    @FXML
    private Hyperlink breadcrumbM;
    
    @FXML
    private Hyperlink breadcrumbSM;
    
    //Seitenmen?
    
    @FXML
    private Hyperlink sidemenuFavorites;
    
    @FXML
    private VBox sidemenu;

    @FXML
    private Hyperlink sidemenuMathe;

    @FXML
    private Hyperlink sidemenuDeutsch;

    @FXML
    private Hyperlink sidemenuEnglisch;
    
    //Suche
    
    @FXML
    private TextField search;

    @FXML
	private Label wrongSearch;
    
    //Dropdown Klasse

    @FXML
    private SplitMenuButton klasse;

    @FXML
    private MenuItem klasse1;

    @FXML
    private MenuItem klasse2;

    @FXML
    private MenuItem klasse3;
    
    @FXML
    private MenuItem klasse4;

    @FXML
    private MenuItem klasse5;

    @FXML
    private MenuItem klasse6;
    
    

    
    @FXML
    void goTo(ActionEvent event) throws IOException {
    	Main m = new Main();
		if(menuKleinkinder.isVisited()) {
			m.changeScene("Kleinkinder.fxml");
		}
		else if(menuSchueler.isVisited()) {
			m.changeScene("Schueler.fxml");
		}
		else if(menuStudenten.isVisited()) {
			m.changeScene("Studenten.fxml");
		}
		else if(menuErwachsene.isVisited()) {
			m.changeScene("Erwachsene.fxml");
		}
		else if(breadcrumbM.isVisited()) {
			m.changeScene("Schueler.fxml");
		}
		else if(breadcrumbSM.isVisited()) {
			m.changeScene("SMMathe.fxml");
		}
		else if(sidemenuFavorites.isVisited()) {
			m.changeScene("Favorites.fxml");
		}
		else if(sidemenuMathe.isVisited()) {
			m.changeScene("SMMathe.fxml");
		}
		else if(sidemenuDeutsch.isVisited()) {
			m.changeScene("SMDeutsch.fxml");
		}
		else if(sidemenuEnglisch.isVisited()) {
			m.changeScene("SMEnglisch.fxml");
		}
    }
    
    @FXML
    void dropdownFavorites(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("Favorites.fxml");
    }
    
    @FXML
    void dropdownSetups(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("Setups.fxml");
    }

    @FXML
    void dropdownLogout(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("Logout.fxml");
    }
    
    @FXML
    void searchFor(ActionEvent event) throws IOException {
    	Main m = new Main();
    	if(search.getText().toString().equals("Gedichte")) {
    		m.changeScene("SMDeutsch.fxml");
    	}
    	else if(search.getText().toString().equals("Essay")) {
    		m.changeScene("SMEnglisch.fxml");
    	}
    	else if(search.getText().toString().equals("Addieren")) {
    		m.changeScene("SMMathe.fxml");
    	}
    	else {
    		wrongSearch.setText("Keinen Beitrag gefunden.");
    	}
    }

    @FXML
    void dropdownKlasse1(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("SMKlasse1.fxml");
    }

    @FXML
    void dropdownKlasse2(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("SMKlasse2.fxml");
    }

    @FXML
    void dropdownKlasse3(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("SMKlasse3.fxml");
    }
    
    @FXML
    void dropdownKlasse4(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("SMKlasse4.fxml");
    }

    @FXML
    void dropdownKlasse5(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("SMKlasse5.fxml");
    }

    @FXML
    void dropdownKlasse6(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("SMKlasse6.fxml");
    }
}
