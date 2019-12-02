package dad.javafx.geofx.connection;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class ConnectionController implements Initializable {
	@FXML
	private GridPane connectionGrid;

	@FXML
	private ImageView globalImageView;

	@FXML
	private Label registeredValorLabel;

	@FXML
	private Label typeValorLabel;

	@FXML
	private Label hostNameValorLabel;

	@FXML
	private Label asnValorLabel;

	@FXML
	private Label ipAddressValorLabel;

	public ConnectionController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ConnectionView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	public GridPane getView() {
		return connectionGrid;
	}
}
