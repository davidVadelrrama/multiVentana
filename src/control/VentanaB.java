package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import model.EmailsData;

public class VentanaB implements Initializable {

	@FXML
	private TextArea emailBoxTA;

	private String email;

	public VentanaB() {

	}

	@FXML
	private Button refreshBTN;

	@FXML
	void refreshData(ActionEvent event) {
		emailBoxTA.setText("");
		for (String email : EmailsData.emails) {
			emailBoxTA.appendText(email + "\n\n");
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		emailBoxTA.setText("");
		for (String email : EmailsData.emails) {
			emailBoxTA.appendText(email + "\n\n");
		}
	}
}
