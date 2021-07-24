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

public class BStTBWLController {
	
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
    private Hyperlink sidemenuBWL;

    @FXML
    private Hyperlink sidemenuVWL;

    @FXML
    private Hyperlink sidemenuLA;

    @FXML
    private Hyperlink sidemenuRW;
    
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
			m.changeScene("Studenten.fxml");
		}
		else if(breadcrumbSM.isVisited()) {
			m.changeScene("SMBWL.fxml");
		}
		else if(breadcrumbB.isVisited()) {
			m.changeScene("BStTBWL.fxml");
		}
		else if(sidemenuFavorites.isVisited()) {
			m.changeScene("Favorites.fxml");
		}
		else if(sidemenuBWL.isVisited()) {
			m.changeScene("SMBWL.fxml");
		}
		else if(sidemenuVWL.isVisited()) {
			m.changeScene("SMVWL.fxml");
		}
		else if(sidemenuLA.isVisited()) {
			m.changeScene("SMLA.fxml");
		}
		else if(sidemenuRW.isVisited()) {
			m.changeScene("SMRW.fxml");
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
    	m.changeScene("Studenten.fxml");
    }

}
