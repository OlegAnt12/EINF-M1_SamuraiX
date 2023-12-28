/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestaodefrotasveicular;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author User
 */
public class GestaoDeFrotasVeicular extends Application {
    
    @Override
    public void start(Stage estagioPrimario) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("../gui/login/Login.fxml"));
        Scene cena = new Scene(root);
        cena.getStylesheets().add(getClass().getResource("../gui/login/login.css").toExternalForm());
        estagioPrimario.initStyle(StageStyle.UNDECORATED);
        estagioPrimario.setScene(cena);
        estagioPrimario.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch();
        System.out.println("Olá Mundo!");
    }
    
}
