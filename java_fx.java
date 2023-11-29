package JAVA_FX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class java_fx extends Application{
    @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
  // Create a scene and place a button in the scene
 Button btOK = new Button("OK");
 Scene scene = new Scene(btOK, 200, 250);
 primaryStage.setTitle("MyJavaFX"); // Set the stage title
 primaryStage.setScene(scene); // Place the scene in the stage
 primaryStage.show(); // Display the stage
 }

/**
18 * The main method is only needed for the IDE with limited 
19 * JavaFX support. Not needed for running from the command line.
20 */
 public static void main(String[] args) { 
 Application.launch(args); 
 }
 }

