package it.polito.tdp.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ContaController {       //UTENTE INSERISCE UNA PAROLA E IL PROGRAMMA DEVE RESTITUIRE LA LUNGHEZZA NELLA TEXTaREA
	
	private Model model;
	
	public void setModel(Model m){
		this.model=m;
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtField;

    @FXML
    private Button btnConta;

    @FXML
    private TextArea txtResult;

    @FXML
    void doConta(ActionEvent event) {
    	txtResult.clear();
    	String s = txtField.getText();
    	if(s.isEmpty()){
    		txtResult.appendText("Inserisci parola ! \n" );
    		return;	
    	}
    	for(int i=0; i<s.length();i++){                                 //deve essere una lettera    
    		if(!Character.isLetter(s.charAt(i))){  
    			txtResult.appendText("Il formato non è valido ! \n ");
    			return;
    		}
    	}
    	int numero = model.conta(s);
    	String  messaggio = "La lunghezza della parola è: "+numero+ "\n";
    	txtResult.setText(messaggio);
    	//txtResult.appendText("la lunghezza della parola è " +numero+ " \n ");

    }

    @FXML
    void initialize() {
        assert txtField != null : "fx:id=\"txtField\" was not injected: check your FXML file 'ContaSample.fxml'.";
        assert btnConta != null : "fx:id=\"btnConta\" was not injected: check your FXML file 'ContaSample.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'ContaSample.fxml'.";

    }
}
