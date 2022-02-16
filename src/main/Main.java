package main;

import control.VentanaA;
import control.VentanaB;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Carro;

public class Main extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/VentanaA.fxml"));		
		loader.setController(new VentanaA());
		Parent parent = (Parent) loader.load();
		
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		
		stage.show();
		
		correrVentanaB();
	}
	
	public static void correrVentanaB() throws Exception{
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/VentanaB.fxml"));		
		loader.setController(new VentanaB());
		Parent parent = (Parent) loader.load();
		
		Stage stage = new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		
		stage.show();
	}

}
