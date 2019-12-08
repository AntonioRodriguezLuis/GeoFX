package dad.javafx.geofx.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Mensaje {
	public static void sendConnectionError(String title, String header, String msg) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Unirest");
		alert.setHeaderText("Error de conexión");
		alert.setContentText(msg);
		alert.showAndWait();
	}
}
