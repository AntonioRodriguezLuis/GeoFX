package dad.javafx.geofx.root;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.connection.ConnectionController;
import dad.javafx.geofx.location.LocationController;
import dad.javafx.geofx.security.SecurityController;
import dad.javafx.geofx.utils.Utils;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class RootController implements Initializable {

	private final String PATH = "./src/main/resources/Icons";
	  
	 	@FXML
	    private BorderPane view;

	    @FXML
	    private ImageView wifiImageView;

	    @FXML
	    private TextField ipText;

	    @FXML
	    private Button checkIpButton;

	    @FXML
	    private TabPane geofxTabPane;

	    @FXML
	    private Tab locationTab;

	    @FXML
	    private Tab connectionTab;

	    @FXML
	    private Tab securityTab;
	    
	    ConnectionController connectionController;
		LocationController locationController;
		SecurityController securityController;
		
		RootModel model = new RootModel();
    
    public RootController() throws IOException {  
    	connectionController = new ConnectionController();
    	locationController = new LocationController();
    	securityController = new SecurityController();

    	FXMLLoader loader = new FXMLLoader(getClass().getResource("RootView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//imagen
		wifiImageView.imageProperty().bind(model.wifiImageViewProperty());
		model.setWifiImageView(new Image(new File(PATH + "/wifi-icon.png").toURI().toString()));
		//textfield
		ipText.textProperty().bind(model.ipTextProperty());
		model.setIpText(Utils.getUserIP());
		
		geofxTabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

		locationTab.setContent(locationController.getView());
		connectionTab.setContent(connectionController.getView());
		securityTab.setContent(securityController.getView());

		geofxTabPane.getSelectionModel().select(locationTab);
	}

	public BorderPane getView() {
		return this.view;
	}

}
