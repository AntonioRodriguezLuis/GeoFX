package dad.javafx.geofx.security;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class SecurityModel {

	private ObjectProperty<Image> escudoImageView = new SimpleObjectProperty<>();

	private StringProperty escudoValorLabel = new SimpleStringProperty();
	private StringProperty potentialValorLabel = new SimpleStringProperty();
	private StringProperty threatValorLabel = new SimpleStringProperty();

	private BooleanProperty proxyCheckbox = new SimpleBooleanProperty();
	private BooleanProperty crawlerValorLabel = new SimpleBooleanProperty();
	private BooleanProperty torCheckbox = new SimpleBooleanProperty();

	public final ObjectProperty<Image> escudoImageViewProperty() {
		return this.escudoImageView;
	}

	public final Image getEscudoImageView() {
		return this.escudoImageViewProperty().get();
	}

	public final void setEscudoImageView(final Image escudoImageView) {
		this.escudoImageViewProperty().set(escudoImageView);
	}

	public final StringProperty escudoValorLabelProperty() {
		return this.escudoValorLabel;
	}

	public final String getEscudoValorLabel() {
		return this.escudoValorLabelProperty().get();
	}

	public final void setEscudoValorLabel(final String escudoValorLabel) {
		this.escudoValorLabelProperty().set(escudoValorLabel);
	}

	public final StringProperty potentialValorLabelProperty() {
		return this.potentialValorLabel;
	}

	public final String getPotentialValorLabel() {
		return this.potentialValorLabelProperty().get();
	}

	public final void setPotentialValorLabel(final String potentialValorLabel) {
		this.potentialValorLabelProperty().set(potentialValorLabel);
	}

	public final StringProperty threatValorLabelProperty() {
		return this.threatValorLabel;
	}

	public final String getThreatValorLabel() {
		return this.threatValorLabelProperty().get();
	}

	public final void setThreatValorLabel(final String threatValorLabel) {
		this.threatValorLabelProperty().set(threatValorLabel);
	}

	public final BooleanProperty proxyCheckboxProperty() {
		return this.proxyCheckbox;
	}

	public final boolean isProxyCheckbox() {
		return this.proxyCheckboxProperty().get();
	}

	public final void setProxyCheckbox(final boolean proxyCheckbox) {
		this.proxyCheckboxProperty().set(proxyCheckbox);
	}

	public final BooleanProperty crawlerValorLabelProperty() {
		return this.crawlerValorLabel;
	}

	public final boolean isCrawlerValorLabel() {
		return this.crawlerValorLabelProperty().get();
	}

	public final void setCrawlerValorLabel(final boolean crawlerValorLabel) {
		this.crawlerValorLabelProperty().set(crawlerValorLabel);
	}

	public final BooleanProperty torCheckboxProperty() {
		return this.torCheckbox;
	}

	public final boolean isTorCheckbox() {
		return this.torCheckboxProperty().get();
	}

	public final void setTorCheckbox(final boolean torCheckbox) {
		this.torCheckboxProperty().set(torCheckbox);
	}
}
