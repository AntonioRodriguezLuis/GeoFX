package dad.javafx.geofx.root;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dad.javafx.geofx.connection.ConnectionController;
import dad.javafx.geofx.location.LocationController;
import dad.javafx.geofx.security.SecurityController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class RootController implements Initializable {
	  
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
