/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui.gest.aluguer;

import aluguer.Arquivo;
import aluguer.Contracto;
import aluguer.Taxa;
import com.mysql.cj.jdbc.result.ResultSetImpl;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import personagem.Cliente;
import veiculos.Veiculo;

/**
 * FXML Controller class
 *
 * @author User
 */
public class VizualizarContractosController implements Initializable {

    Connection conexao; 
    Statement testamento;
    ResultSetImpl res;
    ObservableList<Contracto> lista = FXCollections.observableArrayList();
    ObservableList<Cliente> listaCli = FXCollections.observableArrayList();
    ObservableList<Taxa> listaTaxa = FXCollections.observableArrayList();
    ObservableList<Arquivo> listaArq = FXCollections.observableArrayList();
    //ObservableList<Veiculo> listaV;
    
     @FXML
    private Button btnAddVeiculo;

    @FXML
    private TableColumn<Contracto, String> colCliente;

    @FXML
    private TableColumn<Contracto, String> colDetalhes;

    @FXML
    private TableColumn<Contracto, String> colFim;

    @FXML
    private TableColumn<Contracto, String> colID;

    @FXML
    private TableColumn<Contracto, String> colIni;

    @FXML
    private TableColumn<Contracto, String> colModelo;
    
    @FXML
    private TableColumn<Taxa, String> colCliente1;

    @FXML
    private TableColumn<Taxa, String> colDetalhes1;

    @FXML
    private TableColumn<Taxa, String> colID1;


    @FXML
    private TableColumn<Taxa, String> colIni1;


    @FXML
    private TableColumn<Taxa, String> colModelo1;

    @FXML
    private TableColumn<Arquivo, String> colCliente2;

    @FXML
    private TableColumn<Arquivo, String> colDetalhes2;

    @FXML
    private TableColumn<Arquivo, String> colFim2;

    @FXML
    private TableColumn<Arquivo, String> colID2;

    @FXML
    private TableColumn<Arquivo, String> colIni2;

    @FXML
    private TableColumn<Arquivo, String> colModelo2;


    @FXML
    private TableView<Arquivo> tabelaArq;

    @FXML
    private TableView<Contracto> tabela;
    
    @FXML
    private TableView<Taxa> tabelaTaxa;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try
        {
            lista.clear();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/frotadeveiculos","root","");
            testamento = conexao.createStatement();
            res = (ResultSetImpl) testamento.executeQuery("select * from tb_contracto");
            
            colID.setCellValueFactory(new PropertyValueFactory<>("id"));
            colCliente.setCellValueFactory(new PropertyValueFactory<>("idCliente"));
            colModelo.setCellValueFactory(new PropertyValueFactory<>("modeloAluguer"));
            colIni.setCellValueFactory(new PropertyValueFactory<>("dataInicio"));
            colFim.setCellValueFactory(new PropertyValueFactory<>("dataFim"));
            
            while(res.next())
            {
                lista.add(new Contracto(
                res.getInt("id"),
                        res.getString("data_inicio"),
                        res.getString("data_fim"),
                        res.getString("fk_cliente"),
                        res.getString("modelo_aluguer")
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
    private void selectTaxa(ActionEvent evento)
    {
        try
        {
            listaTaxa.clear();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/frotadeveiculos","root","");
            testamento = conexao.createStatement();
            res = (ResultSetImpl) testamento.executeQuery("select * from tb_Taxa");
            
            colID1.setCellValueFactory(new PropertyValueFactory<>("id"));
            colCliente1.setCellValueFactory(new PropertyValueFactory<>("valor"));
            colModelo1.setCellValueFactory(new PropertyValueFactory<>("valorAcrescimo"));
            colIni1.setCellValueFactory(new PropertyValueFactory<>("caucao"));
            
            while(res.next())
            {
                listaTaxa.add(new Taxa(
                res.getInt("id"),
                        res.getDouble("valor"),
                        res.getDouble("valor_acrescimo"),
                        res.getDouble("caucao")
                ));
            }
            
            conexao.close();
            tabelaTaxa.setItems(listaTaxa);
            tabela.setVisible(false);
            tabelaArq.setVisible(false);
            tabelaTaxa.setVisible(true);
        }
        catch(Exception e)
        {  
            System.out.println(""+e);
        }
    }
    
    @FXML
    private void selectContracto(ActionEvent evento)
    {
        try
        {
            lista.clear();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/frotadeveiculos","root","");
            testamento = conexao.createStatement();
            res = (ResultSetImpl) testamento.executeQuery("select * from tb_contracto");
            
            colID2.setCellValueFactory(new PropertyValueFactory<>("id"));
            colCliente2.setCellValueFactory(new PropertyValueFactory<>("idCliente"));
            colModelo2.setCellValueFactory(new PropertyValueFactory<>("modeloAluguer"));
            colIni2.setCellValueFactory(new PropertyValueFactory<>("dataInicio"));
            colFim2.setCellValueFactory(new PropertyValueFactory<>("dataFim"));
            
            while(res.next())
            {
                lista.add(new Contracto(
                res.getInt("id"),
                        res.getString("data_inicio"),
                        res.getString("data_fim"),
                        res.getString("fk_cliente"),
                        res.getString("modelo_aluguer")
                ));
            }
            
            conexao.close();
            tabela.setItems(lista);
            tabela.setVisible(true);
            tabelaTaxa.setVisible(false);
            tabelaArq.setVisible(false);
            
        }
        catch(Exception e)
        {  
            System.out.println(""+e);
        }
    }
    
    @FXML
    private void selectArquivo(ActionEvent evento)
    {
        try
        {
            listaArq.clear();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/frotadeveiculos","root","");
            testamento = conexao.createStatement();
            res = (ResultSetImpl) testamento.executeQuery("select * from tb_arquivo");
            
            colID2.setCellValueFactory(new PropertyValueFactory<>("id"));
            colCliente2.setCellValueFactory(new PropertyValueFactory<>("copiaBI"));
            colModelo2.setCellValueFactory(new PropertyValueFactory<>("copiaHabilitacao"));
            colIni2.setCellValueFactory(new PropertyValueFactory<>("fotografia"));
            
            while(res.next())
            {
                listaArq.add(new Arquivo(
                 res.getInt("id"),
                    res.getString("bi_copia"),
                    res.getString("habilitacao_copia"),
                    res.getString("img_foto")
                ));
            }
            
            conexao.close();
            tabelaArq.setItems(listaArq);
            tabelaArq.setVisible(true);
            tabela.setVisible(false);
            tabelaTaxa.setVisible(false);
            
            
            
        }
        catch(Exception e)
        {  
            System.out.println(""+e);
        }
    }
    
    
    @FXML
    private void selectCliente(ActionEvent evento)
    {
        try
        {
            lista.clear();
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/frotadeveiculos","root","");
            testamento = conexao.createStatement();
            res = (ResultSetImpl) testamento.executeQuery("select * from tb_contracto");
            
            colID.setCellValueFactory(new PropertyValueFactory<>("id"));
            colCliente.setCellValueFactory(new PropertyValueFactory<>("idCliente"));
            colModelo.setCellValueFactory(new PropertyValueFactory<>("modeloAluguer"));
            colIni.setCellValueFactory(new PropertyValueFactory<>("dataInicio"));
            colFim.setCellValueFactory(new PropertyValueFactory<>("dataFim"));
            
            while(res.next())
            {
                lista.add(new Contracto(
                res.getInt("id"),
                        res.getString("data_inicio"),
                        res.getString("data_fim"),
                        res.getString("fk_cliente"),
                        res.getString("modelo_aluguer")
                ));
            }
            
            conexao.close();
            tabela.setItems(lista);
            tabela.setVisible(true);
            tabelaTaxa.setVisible(false);
            
        }
        catch(Exception e)
        {  
            System.out.println(""+e);
        }
    }
}
