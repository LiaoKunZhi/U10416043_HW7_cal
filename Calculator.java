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

	//Create the buttons
        Button C = new Button("C");
        C.setLayoutX(0);
        C.setLayoutY(60);
        C.setPrefSize(60,60);
        
        Button CE = new Button("CE");
        CE.setLayoutX(60);
        CE.setLayoutY(60);
        CE.setPrefSize(60,60);
        
        Button change = new Button("+/-");
        change.setLayoutX(120);
        change.setLayoutY(60);
        change.setPrefSize(60,60);
        
        Button end = new Button("=");
        end.setLayoutX(180);
        end.setLayoutY(60);
        end.setPrefSize(60,60);
        
        Button DEL = new Button("DEL");
        DEL.setLayoutX(0);
        DEL.setLayoutY(120);
        DEL.setPrefSize(90,60);
        
        Button sqrt = new Button("sqrt");
        sqrt.setLayoutX(90);
        sqrt.setLayoutY(120);
        sqrt.setPrefSize(90,60);
        
        Button divide = new Button("/");
        divide.setLayoutX(180);
        divide.setLayoutY(120);
        divide.setPrefSize(60,60);
        
        Button seven = new Button("7");
        seven.setLayoutX(0);
        seven.setLayoutY(180);
        seven.setPrefSize(60,60);
        
	Button eight = new Button("8");
        eight.setLayoutX(60);
        eight.setLayoutY(180);
        eight.setPrefSize(60,60);
        
	Button nine = new Button("9");
        nine.setLayoutX(120);
        nine.setLayoutY(180);
        nine.setPrefSize(60,60);
        
        Button multiply = new Button("*");
        multiply.setLayoutX(180);
        multiply.setLayoutY(180);
        multiply.setPrefSize(60,60);
        
        Button four = new Button("4");
        four.setLayoutX(0);
        four.setLayoutY(240);
        four.setPrefSize(60,60);
        
	Button five = new Button("5");
        five.setLayoutX(60);
        five.setLayoutY(240);
        five.setPrefSize(60,60);
        
	Button six = new Button("6");
        six.setLayoutX(120);
        six.setLayoutY(240);
        six.setPrefSize(60,60);
        
        Button subtract = new Button("-");
        subtract.setLayoutX(180);
        subtract.setLayoutY(240);
        subtract.setPrefSize(60,60);
        
	Button one = new Button("1");
        one.setLayoutX(0);
        one.setLayoutY(300);
        one.setPrefSize(60,60);
        
	Button two = new Button("2");
        two.setLayoutX(60);
        two.setLayoutY(300);
        two.setPrefSize(60,60);
        
	Button three = new Button("3");
        three.setLayoutX(120);
        three.setLayoutY(300);
        three.setPrefSize(60,60);
	
	Button percent = new Button("%");
        percent.setLayoutX(0);
        percent.setLayoutY(360);
        percent.setPrefSize(60,60);
        
	Button zero = new Button("0");
        zero.setLayoutX(60);
        zero.setLayoutY(360);
        zero.setPrefSize(60,60);
        
        Button dot = new Button(".");
        dot.setLayoutX(120);
        dot.setLayoutY(360);
        dot.setPrefSize(60,60);
        
	Button plus = new Button("+");
        plus.setLayoutX(180);
        plus.setLayoutY(300);
        plus.setPrefSize(60,120);
        
        //Add buttons on the pane
        pane.getChildren().addAll(one, two, three, four, five, six, seven, eight, nine, zero);
        pane.getChildren().addAll(plus, subtract, multiply, divide, end);
        pane.getChildren().addAll(dot, sqrt, percent, change);
        pane.getChildren().addAll(C, CE, DEL);
	}
}
