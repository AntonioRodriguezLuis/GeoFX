package dad.javafx.geofx.root;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;


public class RootModel {
	private StringProperty ipText = new SimpleStringProperty();
	private ObjectProperty<Image> wifiImageView = new SimpleObjectProperty<>();
	public final StringProperty ipTextProperty() {
		return this.ipText;
	}
	
	public final String getIpText() {
		return this.ipTextProperty().get();
	}
	
	public final void setIpText(final String ipText) {
		this.ipTextProperty().set(ipText);
	}
	
	public final ObjectProperty<Image> wifiImageViewProperty() {
		return this.wifiImageView;
	}
	
	public final Image getWifiImageView() {
		return this.wifiImageViewProperty().get();
	}
	
	public final void setWifiImageView(final Image wifiImageView) {
		this.wifiImageViewProperty().set(wifiImageView);
	}
}
