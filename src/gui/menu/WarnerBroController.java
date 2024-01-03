/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui.menu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class WarnerBroController implements Initializable {
        
    String caminho="../login/login.fxml";
    Scene cena;
    Stage estagio = new Stage();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void getLoginForm(ActionEvent evento) throws IOException
    {
        Parent menu = FXMLLoader.load(getClass().getResource(caminho));
        cena = new Scene(menu);
        estagio = (Stage)((Node)evento.getSource()).getScene().getWindow();
        estagio.setScene(cena);
        estagio.centerOnScreen();
        estagio.show();   
    }
}
