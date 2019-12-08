package dad.javafx.geofx.location;

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

public class LocationController implements Initializable {
	
	private final String PATH = "./src/main/resources/Icons";
	
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
	
	private LocationModel model = new LocationModel();

	public LocationController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("LocationView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
			// Image
			banderaImageView.imageProperty().bind(model.banderaImageViewProperty());
			// TODO provisional LA BANDERA DE ESPAÑA
			model.setBanderaImageView(new Image(new File(PATH + "/ES.png").toURI().toString()));
			//label
			ipLocationValorLabel.textProperty().bind(model.ipLocationValorLabelProperty());
			latitudeValorLabel.textProperty().bind(model.latitudeValorLabelProperty());
			cityValorLabel.textProperty().bind(model.cityValorLabelProperty());
			languageValorLabel.textProperty().bind(model.languageValorLabelProperty());
			callingValorLabel.textProperty().bind(model.callingValorLabelProperty());
			longitudeValorLabel.textProperty().bind(model.longitudeValorLabelProperty());
			zipCodeValorLabel.textProperty().bind(model.zipCodeValorLabelProperty());
			timeZoneValorLabel.textProperty().bind(model.timeZoneValorLabelProperty());
			currencyValorLabel.textProperty().bind(model.currencyValorLabelProperty());

	}

	public GridPane getView() {
		return locationGrid;
	}

}
