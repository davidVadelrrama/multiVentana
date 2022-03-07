package main;

import control.VentanaA;
import control.VentanaB;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		// Cargador del FXML
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/VentanaA.fxml"));

		// Contenido ventana
		loader.setController(new VentanaA());

		Parent parent = (Parent) loader.load();

		Stage stage = new Stage();

		Scene scene = new Scene(parent);

		stage.setScene(scene);

		stage.show();

		// Cargador del FXML
		FXMLLoader loader1 = new FXMLLoader(Main.class.getResource("../ui/VentanaB.fxml"));

		// Contenido ventana
		loader1.setController(new VentanaB());

		Parent parent2 = (Parent) loader1.load();

		Stage stage2 = new Stage();

		Scene scene2 = new Scene(parent2);

		stage2.setScene(scene2);

		stage2.show();

	}

}
