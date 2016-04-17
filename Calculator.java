//U10416043   廖崑智

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

//Class
public class Calculator extends Application {
        
  //Method
	public void start (Stage primaryStage) {
            
	  //Create a new pane
  	Pane pane = new Pane();
        
	  //Make a new TextField
  	TextField textfield = new TextField();
  	textfield.setEditable(false);
    textfield.setMinSize(240, 30);
    textfield.setText(" ");
  	textfield.setLayoutX(0);
  	textfield.setLayoutY(30);
    pane.getChildren().add(textfield);
	
  	//Make some Menus and MenuItems
  	final MenuBar menubar = new MenuBar();
  	final Menu menuA = new Menu("檢視");
  	final Menu menuB = new Menu("編輯");
	  final Menu menuC = new Menu("說明");
  	menuA.getItems().add(new MenuItem("檢視"));
  	menuB.getItems().add(new MenuItem("編輯"));
  	menuC.getItems().add(new MenuItem("說明"));
  	menubar.getMenus().add(menuA);
  	menubar.getMenus().add(menuB);
  	menubar.getMenus().add(menuC);
  	pane.getChildren().add(menubar);
	}
}
