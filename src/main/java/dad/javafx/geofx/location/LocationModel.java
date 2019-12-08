package dad.javafx.geofx.location;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class LocationModel {
	private StringProperty ipLocationValorLabel = new SimpleStringProperty();
	private StringProperty latitudeValorLabel = new SimpleStringProperty();
	private StringProperty cityValorLabel = new SimpleStringProperty();
	private StringProperty languageValorLabel = new SimpleStringProperty();
	private StringProperty callingValorLabel = new SimpleStringProperty();
	private StringProperty longitudeValorLabel = new SimpleStringProperty();
	private StringProperty zipCodeValorLabel = new SimpleStringProperty();
	private StringProperty timeZoneValorLabel = new SimpleStringProperty();
	private StringProperty currencyValorLabel = new SimpleStringProperty();

	private ObjectProperty<Image> banderaImageView = new SimpleObjectProperty<>();

	public final StringProperty ipLocationValorLabelProperty() {
		return this.ipLocationValorLabel;
	}

	public final String getIpLocationValorLabel() {
		return this.ipLocationValorLabelProperty().get();
	}

	public final void setIpLocationValorLabel(final String ipLocationValorLabel) {
		this.ipLocationValorLabelProperty().set(ipLocationValorLabel);
	}

	public final StringProperty latitudeValorLabelProperty() {
		return this.latitudeValorLabel;
	}

	public final String getLatitudeValorLabel() {
		return this.latitudeValorLabelProperty().get();
	}

	public final void setLatitudeValorLabel(final String latitudeValorLabel) {
		this.latitudeValorLabelProperty().set(latitudeValorLabel);
	}

	public final StringProperty cityValorLabelProperty() {
		return this.cityValorLabel;
	}

	public final String getCityValorLabel() {
		return this.cityValorLabelProperty().get();
	}

	public final void setCityValorLabel(final String cityValorLabel) {
		this.cityValorLabelProperty().set(cityValorLabel);
	}

	public final StringProperty languageValorLabelProperty() {
		return this.languageValorLabel;
	}

	public final String getLanguageValorLabel() {
		return this.languageValorLabelProperty().get();
	}

	public final void setLanguageValorLabel(final String languageValorLabel) {
		this.languageValorLabelProperty().set(languageValorLabel);
	}

	public final StringProperty callingValorLabelProperty() {
		return this.callingValorLabel;
	}

	public final String getCallingValorLabel() {
		return this.callingValorLabelProperty().get();
	}

	public final void setCallingValorLabel(final String callingValorLabel) {
		this.callingValorLabelProperty().set(callingValorLabel);
	}

	public final StringProperty longitudeValorLabelProperty() {
		return this.longitudeValorLabel;
	}

	public final String getLongitudeValorLabel() {
		return this.longitudeValorLabelProperty().get();
	}

	public final void setLongitudeValorLabel(final String longitudeValorLabel) {
		this.longitudeValorLabelProperty().set(longitudeValorLabel);
	}

	public final StringProperty zipCodeValorLabelProperty() {
		return this.zipCodeValorLabel;
	}

	public final String getZipCodeValorLabel() {
		return this.zipCodeValorLabelProperty().get();
	}

	public final void setZipCodeValorLabel(final String zipCodeValorLabel) {
		this.zipCodeValorLabelProperty().set(zipCodeValorLabel);
	}

	public final StringProperty timeZoneValorLabelProperty() {
		return this.timeZoneValorLabel;
	}

	public final String getTimeZoneValorLabel() {
		return this.timeZoneValorLabelProperty().get();
	}

	public final void setTimeZoneValorLabel(final String timeZoneValorLabel) {
		this.timeZoneValorLabelProperty().set(timeZoneValorLabel);
	}

	public final StringProperty currencyValorLabelProperty() {
		return this.currencyValorLabel;
	}

	public final String getCurrencyValorLabel() {
		return this.currencyValorLabelProperty().get();
	}

	public final void setCurrencyValorLabel(final String currencyValorLabel) {
		this.currencyValorLabelProperty().set(currencyValorLabel);
	}

	public final ObjectProperty<Image> banderaImageViewProperty() {
		return this.banderaImageView;
	}
	

	public final Image getBanderaImageView() {
		return this.banderaImageViewProperty().get();
	}
	

	public final void setBanderaImageView(final Image banderaImageView) {
		this.banderaImageViewProperty().set(banderaImageView);
	}
}
