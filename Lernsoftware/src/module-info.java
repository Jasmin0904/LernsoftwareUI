module Lernsoftware {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.media;
	requires org.controlsfx.controls;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
