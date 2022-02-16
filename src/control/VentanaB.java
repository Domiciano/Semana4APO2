package control;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import model.Carro;
import model.EmailsData;

public class VentanaB implements Initializable{

    @FXML
    private TextArea outputTA;
    
    
    //Recibo los datos de la otra ventana
    public VentanaB() {
    
    }
    
    @FXML
    void refresh(ActionEvent event) {
    	outputTA.setText("Numero de carros:" + Carro.numeroCarros +" \n");
		for(String email : EmailsData.getData()) {
			outputTA.appendText(email+"\n\n");
		}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		outputTA.setText("Numero de carros:" + Carro.numeroCarros +" \n");
		for(String email : EmailsData.getData()) {
			outputTA.appendText(email+"\n\n");
		}
	}

}
