/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
    
    
    @FXML Label titulo_inicio;
    
    @FXML
    private void ingresarJuego(ActionEvent event) throws IOException, Exception{
        nuevaVentana();
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void nuevaVentana() throws Exception {
        Stage stage1 = new Stage();
        Parent root1 = FXMLLoader.load(getClass().getResource("Sistemadigestivo.fxml"));
        Scene scene = new Scene(root1);
        stage1.setScene(scene);
        //La ventana no se puede aumentar ni reducir 
        stage1.setResizable(false);
        //Le ofrecemos un nombre a la ventana
        stage1.setTitle("SISTEMA DIGESTIVO");
        stage1.show();
    }
    
}
