package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Polygon;

import java.io.IOException;

import org.controlsfx.control.Rating;

public class SMVWLController {

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
    
    //Breadcrumbs
    
    @FXML
    private Hyperlink breadcrumbM;
    
    @FXML
    private Hyperlink breadcrumbSM;
    
    //Suche

    @FXML
    private TextField search;

    @FXML
	private Label wrongSearch;
    
    //Beitrag 4

    @FXML
    private HBox beitrag4;

    @FXML
    private ImageView imgVWL;

    @FXML
    private Button btnBeitrag4;

    @FXML
    private Rating ratingB4;

    @FXML
    private Polygon shapeFilled4;

    @FXML
    private Polygon shapeOutline4;

    
    
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
			m.changeScene("SMVWL.fxml");
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
    void searchFor(ActionEvent event) throws IOException {
    	Main m = new Main();
    	if(search.getText().toString().equals("BWL")) {
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
    	else {
    		wrongSearch.setText("Keinen Beitrag gefunden.");
    	}
    }

    @FXML
    void fillShape4(MouseEvent event) {
    	shapeOutline4.setVisible(false);
    	shapeFilled4.setVisible(true);
    }

    @FXML
    void unfillShape4(MouseEvent event) {
    	shapeFilled4.setVisible(false);
    	shapeOutline4.setVisible(true);
    }

    @FXML
    void viewT(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("BStVVWL.fxml");
    }
}