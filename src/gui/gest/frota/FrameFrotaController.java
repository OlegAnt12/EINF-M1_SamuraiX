/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui.gest.frota;

import aluguer.Contracto;
import com.mysql.cj.jdbc.result.ResultSetImpl;
import condutor.Motorista;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import personagem.Pessoa;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FrameFrotaController implements Initializable {

    private double x = 0;
    private double y = 0;
    
    Connection conexao; 
    Statement testamento;
    ResultSetImpl res;

    ObservableList<Motorista> listaMotorista = FXCollections.observableArrayList();
    ObservableList<Pessoa> listaPessoa = FXCollections.observableArrayList();
    
    @FXML
    private TableColumn<Pessoa, String> colBI;

    @FXML
    private TableColumn<Pessoa, String> colContacto;
    
    @FXML
    private TableColumn<Pessoa, String> colDetalhesMotorista;

    @FXML
    private TableColumn<Pessoa, String> colHabil;

    
     @FXML
    private TableColumn<Pessoa, String> colNome;

    @FXML
    private TableColumn<Pessoa, String> colSobrenome;
    
    @FXML
    private AnchorPane controlo;

    @FXML
    private TableView<?> tabelaFrota;

    @FXML
    private TableView<Pessoa> tabelaMotorista;

    @FXML
    private TableView<?> tabelaVeiculo;
    
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
    private void selectMotorista(ActionEvent evnto)
    {
         try
        {
            listaMotorista.clear();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/frotadeveiculos","root","");
            testamento = conexao.createStatement();
            res = (ResultSetImpl) testamento.executeQuery("select * from tb_contracto");
            
            colBI.setCellValueFactory(new PropertyValueFactory<>("id"));
            colNome.setCellValueFactory(new PropertyValueFactory<>("idCliente"));
            colSobrenome.setCellValueFactory(new PropertyValueFactory<>("modeloAluguer"));
            colHabil.setCellValueFactory(new PropertyValueFactory<>("dataInicio"));
            colContacto.setCellValueFactory(new PropertyValueFactory<>("dataFim"));
            
            while(res.next())
            {
                listaPessoa.add(new Pessoa(
                res.getString("bi"),
                        res.getString("nome"),
                        res.getString("sobre_nome"),
                        res.getInt("fk_contacto")
                ));
            }
            
            conexao.close();
            tabelaMotorista.setItems(listaPessoa);
            
        }
        catch(Exception e)
        {  
            System.out.println(""+e);
        }
    }
}
