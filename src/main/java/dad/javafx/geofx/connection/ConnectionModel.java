package dad.javafx.geofx.connection;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;


public class ConnectionModel {
	private StringProperty registeredValorLabel = new SimpleStringProperty();
	private StringProperty typeValorLabel = new SimpleStringProperty();
	private StringProperty hostNameValorLabel = new SimpleStringProperty();
	private StringProperty asnValorLabel = new SimpleStringProperty();
	private StringProperty ipAddressValorLabel = new SimpleStringProperty();
	
	private ObjectProperty<Image> globalImageView = new SimpleObjectProperty<>();
	
	public final StringProperty registeredValorLabelProperty() {
		return this.registeredValorLabel;
	}
	
	public final String getRegisteredValorLabel() {
		return this.registeredValorLabelProperty().get();
	}
	
	public final void setRegisteredValorLabel(final String registeredValorLabel) {
		this.registeredValorLabelProperty().set(registeredValorLabel);
	}
	
	public final StringProperty typeValorLabelProperty() {
		return this.typeValorLabel;
	}
	
	public final String getTypeValorLabel() {
		return this.typeValorLabelProperty().get();
	}
	
	public final void setTypeValorLabel(final String typeValorLabel) {
		this.typeValorLabelProperty().set(typeValorLabel);
	}
	
	public final StringProperty hostNameValorLabelProperty() {
		return this.hostNameValorLabel;
	}
	
	public final String getHostNameValorLabel() {
		return this.hostNameValorLabelProperty().get();
	}
	
	public final void setHostNameValorLabel(final String hostNameValorLabel) {
		this.hostNameValorLabelProperty().set(hostNameValorLabel);
	}
	
	public final StringProperty asnValorLabelProperty() {
		return this.asnValorLabel;
	}
	
	public final String getAsnValorLabel() {
		return this.asnValorLabelProperty().get();
	}
	
	public final void setAsnValorLabel(final String asnValorLabel) {
		this.asnValorLabelProperty().set(asnValorLabel);
	}
	
	public final StringProperty ipAddressValorLabelProperty() {
		return this.ipAddressValorLabel;
	}
	
	public final String getIpAddressValorLabel() {
		return this.ipAddressValorLabelProperty().get();
	}
	
	public final void setIpAddressValorLabel(final String ipAddressValorLabel) {
		this.ipAddressValorLabelProperty().set(ipAddressValorLabel);
	}
	
	public final ObjectProperty<Image> globalImageViewProperty() {
		return this.globalImageView;
	}
	
	public final Image getGlobalImageView() {
		return this.globalImageViewProperty().get();
	}
	
	public final void setGlobalImageView(final Image globalImageView) {
		this.globalImageViewProperty().set(globalImageView);
	}
}
