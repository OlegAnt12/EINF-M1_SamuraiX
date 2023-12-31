/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui.menu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MenuGestorController implements Initializable {

    private Scene cena;
    private Stage estagio;
    
    private double x = 0;
    private double y = 0;
    
    @FXML
    private AnchorPane controlo;

    @FXML
    private Pane painelArrastavel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void arrastarBorda (MouseEvent event)
    {
        Stage estagio = (Stage)controlo.getScene().getWindow();
        estagio.setY(event.getScreenY() - y);
        estagio.setX(event.getScreenX() - x);
        
    }
    
     @FXML
    private void panePressed(MouseEvent event)
    {
        x=event.getSceneX();
        y=event.getSceneY();
    }
    
    @FXML
    private void getFrameFrota(MouseEvent evento) throws IOException
    {
        estagio = new Stage();
        
        try
        {
            Parent menu = FXMLLoader.load(getClass().getResource("../gest/frota/FrameFrota.fxml"));
            cena = new Scene(menu);
            estagio = (Stage)((Node)evento.getSource()).getScene().getWindow();
            estagio.setScene(cena);
            estagio.centerOnScreen();
            estagio.show();
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
    }
    
    @FXML
    private void getFrameLogist(MouseEvent evento) throws IOException
    {
        estagio = new Stage();
        
        try
        {
            Parent menu = FXMLLoader.load(getClass().getResource("../gest/frota/FrameLoistica.fxml"));
            cena = new Scene(menu);
            estagio = (Stage)((Node)evento.getSource()).getScene().getWindow();
            estagio.setScene(cena);
            estagio.centerOnScreen();
            estagio.show();
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
    }
    
    @FXML
    private void getFrameFuncionario(MouseEvent evento) throws IOException
    {
        estagio = new Stage();
        
        try
        {
            Parent menu = FXMLLoader.load(getClass().getResource("../gest/funcinario/GestFuncionario.fxml"));
            cena = new Scene(menu);
            estagio = (Stage)((Node)evento.getSource()).getScene().getWindow();
            estagio.setScene(cena);
            estagio.centerOnScreen();
            estagio.show();
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
    }
    
}
