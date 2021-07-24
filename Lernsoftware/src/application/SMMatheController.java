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

public class SMMatheController {

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
    
  //Beitrag 2

    @FXML
    private HBox beitrag2;

    @FXML
    private ImageView imgAddieren;

    @FXML
    private Button btnBeitrag2;

    @FXML
    private Rating ratingB2;

    @FXML
    private Polygon shapeFilled2;

    @FXML
    private Polygon shapeOutline2;
    
    
    

    
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
			m.changeScene("SMDeutsch.fxml");
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
    void viewV(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("BSueVMathe.fxml");
    }
    
    @FXML
    void viewT(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("BSueVMathe.fxml");
    }

}
