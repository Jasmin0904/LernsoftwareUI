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

public class StudentenController {

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
    
    //Suche

    @FXML
    private TextField search;

    @FXML
	private Label wrongSearch;
    
    //Beitrag 1
    
    @FXML
    private HBox beitrag1;
    
    @FXML
    private Button btnBeitrag1;
    
    @FXML
    private ImageView imgBWL;

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
    private ImageView imgVektoren;

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
    private HBox beitrag3;

    @FXML
    private ImageView imgBilanz;

    @FXML
    private Button btnBeitrag3;

    @FXML
    private Rating ratingB3;

    @FXML
    private Polygon shapeFilled3;

    @FXML
    private Polygon shapeOutline3;
    
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
    void viewBWL(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("BStTBwl.fxml");
    }
    
    @FXML
    void viewLA(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("BStVLA.fxml");
    }
    
    @FXML
    void viewRW(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("BStTRW.fxml");
    }

    @FXML
    void viewVWL(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("BStVVWL.fxml");
    }

}