package dad.javafx.geofx.security;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class SecurityController implements Initializable {

	@FXML
	private GridPane securityGrid;

	@FXML
	private ImageView escudoImageView;

	@FXML
	private Label escudoValorLabel;

	@FXML
	private Label potentialValorLabel;

	@FXML
	private CheckBox proxyCheckbox;

	@FXML
	private CheckBox crawlerValorLabel;

	@FXML
	private CheckBox torCheckbox;

	@FXML
	private Label threatValorLabel;

	public SecurityController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("SecurityView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public GridPane getView() {
		return securityGrid;
	}
}
