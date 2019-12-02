package dad.javafx.geofx.location;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class LocationController implements Initializable {
	@FXML
	private GridPane locationGrid;

	@FXML
	private Label ipLocationValorLabel;

	@FXML
	private ImageView banderaImageView;

	@FXML
	private Label latitudeValorLabel;

	@FXML
	private Label cityValorLabel;

	@FXML
	private Label languageValorLabel;

	@FXML
	private Label callingValorLabel;

	@FXML
	private Label longitudeValorLabel;

	@FXML
	private Label zipCodeValorLabel;

	@FXML
	private Label timeZoneValorLabel;

	@FXML
	private Label currencyValorLabel;

	public LocationController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("LocationView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	public GridPane getView() {
		return locationGrid;
	}

}
