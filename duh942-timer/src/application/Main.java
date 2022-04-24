package application;

import application.model.Timer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	/*
	 * Reem Salem duh942
	 */

	/*
	 * A static object that is used between different views an is created on the
	 * start of the program
	 */
	public static Timer t;

	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root = new AnchorPane();
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/Timer.fxml"));
		root = (AnchorPane) loader.load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		t = new Timer();
		launch(args);

	}
}