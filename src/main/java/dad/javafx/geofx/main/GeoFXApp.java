package dad.javafx.geofx.main;

import dad.javafx.geofx.root.RootController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GeoFXApp extends Application {
	private RootController controller;
	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new RootController();
		
		Scene scene = new Scene(controller.getView(), 500, 400);
		primaryStage.setTitle("Calculadora FXML");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
