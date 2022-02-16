package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
//AWT - Peligro
import javafx.stage.Stage;
import main.Main;
import model.EmailsData;

public class VentanaA implements Initializable{

    @FXML
    private TextField emailTF;

    @FXML
    private Button submitBtn;
    
    private String email;
    
    public VentanaA() {
    	email = "alfa@a.com";
    	
    }
    
    static String a="alfa";

    @FXML
    void submit(ActionEvent event) throws Exception{
    	//Agregar el email al registro
    	String email = emailTF.getText();
    	EmailsData.addEmail(email);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		emailTF.setText(email);
	}
	
	//Constructor -> Initialize (UI)

}
