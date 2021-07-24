package application;

import java.io.IOException;

import org.controlsfx.control.Rating;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.layout.VBox;

public class BSueTKlasse5Controller {
	
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
    
    //Breadcrumbs
    
    @FXML
    private Hyperlink breadcrumbM;

    @FXML
    private Hyperlink breadcrumbSM;

    @FXML
    private Hyperlink breadcrumbB;
    
    //Seitenmenü
    
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
    
    //Beitrag 1

    @FXML
    private Rating ratingText1;

    @FXML
    private Button btnBeitrag;

    

	    
    
	    
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
			m.changeScene("SMKlasse5.fxml");
		}
		else if(breadcrumbB.isVisited()) {
			m.changeScene("BSueTKlasse5.fxml");
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
    void view(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("Schueler.fxml");
    }

}
