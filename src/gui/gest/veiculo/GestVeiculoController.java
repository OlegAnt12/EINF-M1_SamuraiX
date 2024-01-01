/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui.gest.veiculo;

import com.mysql.cj.jdbc.result.ResultSetImpl;
import java.io.IOException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.sql.Connection;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import veiculos.Veiculo;

/**
 * FXML Controller class
 *
 * @author User
 */
public class GestVeiculoController implements Initializable {

    Connection conexao; 
    Statement testamento;
    ResultSetImpl res;
    ObservableList<Veiculo> lista = FXCollections.observableArrayList();
    //ObservableList<Veiculo> listaV;
    String caminho = "";
    Stage estagio;
    Scene cena;
    
    double x = 0;
    double y = 0;
    
    Veiculo veiculoSel = new Veiculo();
    
    @FXML
    private AnchorPane controlo;
    
    @FXML
    private Button btnAddVeiculo;

    @FXML
    private TableColumn<Veiculo, String> colCor;

    @FXML
    private TableColumn<Veiculo, String> colDetalhes;

    @FXML
    private TableColumn<Veiculo, Integer> colID;

    @FXML
    private TableColumn<Veiculo, String> colMatricula;

    @FXML
    private TableColumn<Veiculo, String> colModelo;

    @FXML
    private TableColumn<Veiculo, String> colTipo;

    @FXML
    private TableView<Veiculo> tabela;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/frotadeveiculos","root","");
            testamento = conexao.createStatement();
            res = (ResultSetImpl) testamento.executeQuery("select * from tb_veiculo");
            
            colID.setCellValueFactory(new PropertyValueFactory<>("id"));
            colTipo.setCellValueFactory(new PropertyValueFactory<>("idTipo"));
            colModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
            colCor.setCellValueFactory(new PropertyValueFactory<>("cor"));
            colMatricula.setCellValueFactory(new PropertyValueFactory<>("matricula"));
            
            while(res.next())
            {
                lista.add(new Veiculo(
                res.getString("id"),
                        res.getString("fk_tipo"),
                        res.getString("fk_modelo"),
                        res.getString("fk_cor"),
                        res.getString("matricula")
                ));
            }
            conexao.close();
            tabela.setItems(lista);
            
        }
        catch(Exception e)
        {  
            System.out.println(""+e);
        }
      
    }    
    
    @FXML
    private void formCadastro(ActionEvent evento) throws IOException
    {
        Parent menu = FXMLLoader.load(getClass().getResource("CadastroVeiculo.fxml"));
        cena = new Scene(menu);
        estagio = (Stage)((Node)evento.getSource()).getScene().getWindow();
        
        estagio.setScene(cena);
        estagio.centerOnScreen();
        estagio.show();
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
    
    private void eliminar()
    {
        
    }
    
    @FXML
    private void detalhar(ActionEvent evento) throws IOException
    {
        Parent menu = FXMLLoader.load(getClass().getResource("CadastroVeiculo.fxml"));
        cena = new Scene(menu);
        estagio = (Stage)((Node)evento.getSource()).getScene().getWindow();
        
        estagio.setScene(cena);
        estagio.centerOnScreen();
        estagio.show();
    }
}
