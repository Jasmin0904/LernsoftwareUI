package application;

import java.io.IOException;

import org.controlsfx.control.Rating;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Polygon;

public class FavoritesController {

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
    
    //Breadcrumbs
    
    @FXML
    private Hyperlink breadcrumbM;
    
    //Beitrag 1
    
    @FXML
    private HBox beitrag1;

    @FXML
    private ImageView imgAlphabet;

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
    private ImageView imgEssay;

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
    private ImageView imgVektoren;

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
    private ImageView imgBilanz;

    @FXML
    private Button btnBeitrag4;

    @FXML
    private Rating ratingB4;

    @FXML
    private Polygon shapeFilled4;

    @FXML
    private Polygon shapeOutline4;    
	    
	//Beitrag 5
    
    @FXML
    private HBox beitrag5;

    @FXML
    private ImageView imgTrompete;

    @FXML
    private Button btnBeitrag5;

    @FXML
    private Rating ratingB5;

    @FXML
    private Polygon shapeFilled5;

    @FXML
    private Polygon shapeOutline5;


    
    
    
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
			m.changeScene("Favorites.fxml");
		}
		else if(sidemenuFavorites.isVisited()) {
			m.changeScene("Favorites.fxml");
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
    void fillShape1(MouseEvent event) {

    }
    
    @FXML
    void unfillShape1(MouseEvent event) {

    }

    @FXML
    void fillShape2(MouseEvent event) {

    }
    
    @FXML
    void unfillShape2(MouseEvent event) {

    }

    @FXML
    void fillShape3(MouseEvent event) {

    }
    
    @FXML
    void unfillShape3(MouseEvent event) {

    }

    @FXML
    void fillShape4(MouseEvent event) {

    }
    
    @FXML
    void unfillShape4(MouseEvent event) {

    }

    @FXML
    void fillShape5(MouseEvent event) {

    }
    
    @FXML
    void unfillShape5(MouseEvent event) {

    }

    @FXML
    void viewK(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("BKVBuchstaben.fxml");
    }
    
    @FXML
    void viewSue(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("BSueTEnglisch.fxml");
    } 
    
    @FXML
    void viewStV(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("BStVLA.fxml");
    }
    
    @FXML
    void viewStT(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("BStTRW.fxml");
    }
       
    @FXML
    void viewE(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("BEVInstrumente.fxml");
    }
	
}
