package dad.javafx.geofx.security;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class SecurityController implements Initializable {
	
	private final String PATH = "./src/main/resources/Icons";

	@FXML
	private GridPane securityGrid;

	@FXML
	private ImageView escudoImageView;

	@FXML
	private Label escudoValorLabel;

	@FXML
	private Label potentialValorLabel;
	
	@FXML
	private Label threatValorLabel;

	@FXML
	private CheckBox proxyCheckbox;

	@FXML
	private CheckBox crawlerValorLabel;

	@FXML
	private CheckBox torCheckbox;

	SecurityModel model = new SecurityModel();

	public SecurityController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SecurityView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		escudoImageView.imageProperty().bind(model.escudoImageViewProperty());
		model.setEscudoImageView(new Image(new File(PATH + "/Network-Shield-icon.png").toURI().toString()));
		
		escudoValorLabel.textProperty().bind(model.escudoValorLabelProperty());
		potentialValorLabel.textProperty().bind(model.potentialValorLabelProperty());
		threatValorLabel.textProperty().bind(model.threatValorLabelProperty());
		
		model.proxyCheckboxProperty().bind(proxyCheckbox.selectedProperty());
		model.crawlerValorLabelProperty().bind(crawlerValorLabel.selectedProperty());
		model.torCheckboxProperty().bind(torCheckbox.selectedProperty());
	}

	public GridPane getView() {
		return securityGrid;
	}
}
