package dad.javafx.geofx.connection;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class ConnectionController implements Initializable {
	
	private final String PATH = "./src/main/resources/Icons";
	
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
	
	private ConnectionModel model = new ConnectionModel();

	public ConnectionController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ConnectionView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Image
		globalImageView.imageProperty().bind(model.globalImageViewProperty());
		model.setGlobalImageView(new Image(new File(PATH + "/Global-Position-icon.png").toURI().toString()));
		//label
		registeredValorLabel.textProperty().bind(model.registeredValorLabelProperty());
		typeValorLabel.textProperty().bind(model.typeValorLabelProperty());
		hostNameValorLabel.textProperty().bind(model.hostNameValorLabelProperty());
		asnValorLabel.textProperty().bind(model.asnValorLabelProperty());
		ipAddressValorLabel.textProperty().bind(model.ipAddressValorLabelProperty());

	}

	public GridPane getView() {
		return connectionGrid;
	}
}
