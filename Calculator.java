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
    
        //Data field
	double a = 0;
	int n;
	int m;
        
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
        
        //Let the buttons can be used
	one.setOnAction (e -> {
		if (textfield.getText().length() == 1 && textfield.getText().charAt(0) == 48) {
			textfield.setText("1");
                }
                else {
			textfield.setText(textfield.getText() + "1");
                }
	});
        
	two.setOnAction (e -> {
		if (textfield.getText().length() == 1 && textfield.getText().charAt(0) == 48) {
			textfield.setText("2");
                }
                else {
			textfield.setText(textfield.getText() + "2");
                }
	});
        
	three.setOnAction (e -> {
		if (textfield.getText().length() == 1 && textfield.getText().charAt(0) == 48) {
			textfield.setText("3");
                }
                else {
			textfield.setText(textfield.getText() + "3");
                }
	});
        
	four.setOnAction (e -> {
		if (textfield.getText().length() == 1 && textfield.getText().charAt(0) == 48) {
			textfield.setText("4");
                }
                else {
			textfield.setText(textfield.getText() + "4");
                }
	});
        
	five.setOnAction (e -> {
		if (textfield.getText().length() == 1 && textfield.getText().charAt(0) == 48) {
			textfield.setText("5");
                }
                else {
			textfield.setText(textfield.getText() + "5");
                }
	});
        
	six.setOnAction (e -> {
		if (textfield.getText().length() == 1 && textfield.getText().charAt(0) == 48) {
			textfield.setText("6");
                }
                else {
			textfield.setText(textfield.getText() + "6");
                }
	});
        
	seven.setOnAction (e -> {
		if (textfield.getText().length() == 1 && textfield.getText().charAt(0) == 48) {
			textfield.setText("7");
                }
                else {
			textfield.setText(textfield.getText() + "7");
                }
	});
        
	eight.setOnAction (e -> {
		if (textfield.getText().length() == 1 && textfield.getText().charAt(0) == 48) {
			textfield.setText("8");
                }
                else {
			textfield.setText(textfield.getText() + "8");
                }
	});
        
	nine.setOnAction (e -> {
		if (textfield.getText().length() == 1 && textfield.getText().charAt(0) == 48) {
			textfield.setText("9");
                }
                else {
			textfield.setText(textfield.getText() + "9");
                }
	});
        
	zero.setOnAction (e -> {
		if (textfield.getText().length() == 1 && textfield.getText().charAt(0) == 48) {
			textfield.setText("0");
                }
                else {
			textfield.setText(textfield.getText() + "0");
                }
	});
        
	CE.setOnAction (e -> {
		textfield.setText("0");
		a = 0;
		n = 0;
	});
        
	C.setOnAction (e -> {
		textfield.setText("0");
		a = 0;
		n =0;
	});
	
	plus.setOnAction (e -> {
		a = Double.parseDouble(textfield.getText());
		textfield.setText(Integer.toString(0));
		m = 1;
		
	});
        
	subtract.setOnAction (e -> {
		a = Double.parseDouble(textfield.getText());
		textfield.setText(Integer.toString(0));
		m = 2;
		
	});
        
	multiply.setOnAction (e -> {
		a = Double.parseDouble(textfield.getText());
		textfield.setText(Integer.toString(0));
                m = 3;
	});
        
	divide.setOnAction (e -> {
		a = Double.parseDouble(textfield.getText());
		textfield.setText(Integer.toString(0));
                m = 4;
	});
        
	percent.setOnAction (e -> {
		a = Double.parseDouble(textfield.getText()) / 100;
		textfield.setText(String.valueOf(a));
	});
        
	change.setOnAction (e -> {
		a = -Double.parseDouble(textfield.getText());
		textfield.setText(String.valueOf(a));
	});
        
	sqrt.setOnAction (e -> {
		a = Math.sqrt(Double.parseDouble(textfield.getText()));
		textfield.setText(String.valueOf(a));
	});
        
	DEL.setOnAction (e -> {
		textfield.setText(textfield.getText().substring(0,textfield.getText().length() - 1));
		if (textfield.getText().length() == 0) {
			textfield.setText(Integer.toString(0));
		}
	});
        
	dot.setOnAction (e -> {
		if (textfield.getText().indexOf(".") < 0) {
			textfield.setText(new String(textfield.getText() + "."));
                }
	});
        
	end.setOnAction (e -> {
		n = Integer.parseInt(textfield.getText());
                
		switch(m) {
                    case 1:
			a += n;
			break;
                        
                    case 2:
			a -= n;
			break;
                        
                    case 3:
			a *=n;
			break;
                        
                    case 4:
			a /=n;
			break;
                        
                    default :
			break;
		}
		
		textfield.setText(String.valueOf(a));
	});

	//Add the pane in the scene
	Scene scene = new Scene(pane);

	//Make the title of the stage
	primaryStage.setTitle(" U10416043   廖崑智 ");

	//Add scene in the stage
	primaryStage.setScene(scene);

	//Show the stage
	primaryStage.show();
	}
}
