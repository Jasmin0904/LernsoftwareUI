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

public class ErwachseneController {

	//Men�
	
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

    //Seitenmen�

    @FXML
    private Hyperlink sidemenuFavorites;

    @FXML
    private VBox sidemenu;

    @FXML
    private Hyperlink sidemenuSprachen;

    @FXML
    private Hyperlink sidemenuInstrumente;

    @FXML
    private Hyperlink sidemenuPflanzen;
    
    //Breadcrumbs
    
    @FXML
    private Hyperlink breadcrumbM;
    
    //Suche

    @FXML
    private TextField search;

    @FXML
	private Label wrongSearch;
    
    //Beitrag 1
    
    @FXML
    private HBox beitrag1;

    @FXML
    private ImageView imgFranzoesisch;

    @FXML
    private Button btnBeitrag1;

    @FXML
    private Rating ratingB1;

    @FXML
    private Polygon shapeFilled1;

    @FXML
    private Polygon shapeOutline1;

    
    //Beitrag 2
    
    @FXML
    private HBox beitrag2;
    
    @FXML
    private ImageView imgTrompete;
    
    @FXML
    private Button btnBeitrag2;

    @FXML
    private Rating ratingB2;

    @FXML
    private Polygon shapeFilled2;

    @FXML
    private Polygon shapeOutline2;
    
    //Beitrag 3

    @FXML
    private Button btnBeitrag3;
    
    @FXML
    private ImageView imgBlumen;

    @FXML
    private Rating ratingB3;

    @FXML
    private Polygon shapeFilled3;

    @FXML
    private Polygon shapeOutline3;

    @FXML
    private HBox beitrag3;
    
    

    
   
    
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
			m.changeScene("Erwachsene.fxml");
		}
		else if(sidemenuFavorites.isVisited()) {
			m.changeScene("Favorites.fxml");
		}
		else if(sidemenuSprachen.isVisited()) {
			m.changeScene("SMSprachen.fxml");
		}
		else if(sidemenuInstrumente.isVisited()) {
			m.changeScene("SMInstrumente.fxml");
		}
		else if(sidemenuPflanzen.isVisited()) {
			m.changeScene("SMPflanzen.fxml");
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
    	if(search.getText().toString().equals("Franz�sisch")) {
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

    @FXML
    void fillShape1(MouseEvent event) {
    	shapeOutline1.setVisible(false);
    	shapeFilled1.setVisible(true);
    }

    @FXML
    void unfillShape1(MouseEvent event) {
    	shapeFilled1.setVisible(false);
    	shapeOutline1.setVisible(true);
    }
    
    @FXML
    void fillShape2(MouseEvent event) {
    	shapeOutline2.setVisible(false);
    	shapeFilled2.setVisible(true);
    }

    @FXML
    void unfillShape2(MouseEvent event) {
    	shapeFilled2.setVisible(false);
    	shapeOutline2.setVisible(true);
    }
    
    @FXML
    void fillShape3(MouseEvent event) {
    	shapeOutline3.setVisible(false);
    	shapeFilled3.setVisible(true);
    }

    @FXML
    void unfillShape3(MouseEvent event) {
    	shapeFilled3.setVisible(false);
    	shapeOutline3.setVisible(true);
    }

    @FXML
    void viewSprachen(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("BEVSprachen.fxml");
    }

    @FXML
    void viewInstrumente(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("BEVInstrumente.fxml");
    }
    @FXML
    void viewPflanzen(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("BEVPflanzen.fxml");
    }
}