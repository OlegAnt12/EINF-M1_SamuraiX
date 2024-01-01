/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui.gest.veiculo;

import com.mysql.cj.jdbc.result.ResultSetImpl;
import java.io.IOException;
import java.net.URL;
import java.sql.DriverManager;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import veiculos.Carro;
import veiculos.Marca;
import veiculos.Moto;
import veiculos.Veiculo;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CadastroVeiculoController implements Initializable {

    Connection conexao;
    Statement testamento;
    ResultSetImpl res;
    ResultSetImpl resCor;
    ResultSetImpl resFrota;
    ResultSetImpl resultTipo;
    ResultSetImpl resultCombustivel;
    
    ResultSetImpl resSel;
    
    ObservableList<String> lista = FXCollections.observableArrayList();
    ObservableList<String> listaCor = FXCollections.observableArrayList();
    ObservableList<String> listaFrota = FXCollections.observableArrayList();
    ObservableList<String> listaModelo = FXCollections.observableArrayList();
    ObservableList<String> listaTipoVeiculo = FXCollections.observableArrayList();
    ObservableList<String> listaTipoCombustivel = FXCollections.observableArrayList();
    
    Scene cena;
    Stage estagio;
    
    Veiculo veiculo = new Veiculo();
    Marca marca = new Marca();
    Carro carro = new Carro();
    Moto moto = new Moto();
    
    double x = 0;
    double y = 0;
    
    int reg;
    
    @FXML
    private AnchorPane controlo;
    
    @FXML
    private Button btnCarregarImg;
    
    @FXML
    private ComboBox<String> cboxCombustivel;
    
    
    @FXML
    private ComboBox<String> cboxCor;

    @FXML
    private ComboBox<String> cboxFrota;
    
    @FXML
    private ComboBox<String> cboxMarca;
    
    @FXML
    private ComboBox<String> cboxModelo;
    
    @FXML
    private ComboBox<String> cboxTipoVeiculo;
    
    @FXML
    private ImageView imgVeiculo;
  
    @FXML
    private TextField txtKm;

    @FXML
    private TextField txtMatricula;
    
    
    @FXML
    private TextField txtNumPortas;

    @FXML
    private TextField txtPassag;

    @FXML
    private TextField txtTanque;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        try
        {
            lista.clear();
            cboxMarca.setItems(lista);
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/frotadeveiculos","root","");
            testamento = conexao.createStatement();
            res = (ResultSetImpl) testamento.executeQuery("select marca from tb_marca");
            testamento = conexao.createStatement();
            resultTipo = (ResultSetImpl) testamento.executeQuery("select tipo from tb_tipoveiculo");
            testamento = conexao.createStatement();
            resultCombustivel = (ResultSetImpl) testamento.executeQuery("select combustivel from tb_tipocombustivel");
            
            while(res.next())
            {
                lista.add(res.getString("marca"));
            }
            
            while(resultTipo.next())
            {
                listaTipoVeiculo.add(resultTipo.getString("tipo"));
            }
            
            while(resultCombustivel.next())
            {
                listaTipoCombustivel.add(resultCombustivel.getString("combustivel"));
            }
            testamento = conexao.createStatement();
            resCor = (ResultSetImpl) testamento.executeQuery("select cor from tb_cor");
            testamento = conexao.createStatement();
            resFrota = (ResultSetImpl) testamento.executeQuery("select frota from tb_frotaveicular");
            while(resCor.next())
            {
                listaCor.add(resCor.getString("cor"));
            }
            while(resFrota.next())
            {
                listaFrota.add(resFrota.getString("frota"));
            }
            
            
            conexao.close();
            cboxMarca.setItems(lista);
            cboxTipoVeiculo.setItems(listaTipoVeiculo);
            cboxCombustivel.setItems(listaTipoCombustivel);
            cboxCor.setItems(listaCor);
            cboxFrota.setItems(listaFrota);
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }    
        
    }    
    
    @FXML
    private void textoAlteradoMarca(ActionEvent evento)
    {
        marca.setMarca(cboxMarca.getValue());
        System.out.println(""+marca.getMarca());
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/frotadeveiculos","root","");
            testamento = conexao.createStatement();
            res = (ResultSetImpl) testamento.executeQuery("select id from tb_marca where marca = '"+marca.getMarca()+"'");
            res.next();
            marca.setId(Integer.parseInt(res.getString("id")));
            conexao.close();
            
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
        System.out.println(""+marca.getId());
        
        try
        {
            listaModelo.clear();
            cboxModelo.setItems(listaModelo);
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/frotadeveiculos","root","");
            testamento = conexao.createStatement();
            res = (ResultSetImpl) testamento.executeQuery("select modelo from tb_modelo where fk_marca = "+marca.getId());
            
            while(res.next())
            {
                listaModelo.add(res.getString("modelo"));
            }
            conexao.close();
            cboxModelo.setItems(listaModelo);
            
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
        cboxModelo.setDisable(false); 
    }
    
    @FXML
    private void textoAlteradoTipo(ActionEvent evento)
    {
        veiculo.setIdTipo(cboxTipoVeiculo.getValue());
        System.out.println(veiculo.getIdTipo());
        if(!veiculo.getIdTipo().toLowerCase().equals("bicicleta"))
        {
            txtKm.clear();
            txtKm.setDisable(false);
            cboxCombustivel.setDisable(false);
            txtTanque.setDisable(false);
            
            if(veiculo.getIdTipo().toLowerCase().equals("carro"))
            {
                txtNumPortas.setDisable(false);
                txtPassag.setDisable(false);
            }
            else
            {
                txtNumPortas.setDisable(true);
                txtPassag.setDisable(true);
            }
        }
        else
        {
            txtKm.clear();
            txtKm.setDisable(true);
            cboxCombustivel.setDisable(true);
            txtTanque.setDisable(true);
        }
             
     
       
    }
    
    @FXML
    private void save(ActionEvent evento) throws IOException
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/frotadeveiculos","root","");
            testamento = conexao.createStatement();
            res = (ResultSetImpl) testamento.executeQuery("select id from tb_tipoveiculo where tipo = '"+cboxTipoVeiculo.getValue()+"'");
            res.next();
            
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
    
        try
        {
            veiculo.setMatricula(txtMatricula.getText());
            veiculo.setIdTipo(res.getString("id"));
            veiculo.setModelo(cboxModelo.getValue());
            veiculo.setCor(cboxCor.getValue());
            veiculo.setFrota(cboxFrota.getValue());
            if(veiculo.getIdTipo().toLowerCase().equals("carro"))
            {
                carro.setNumeroDePortas(Integer.parseInt(txtNumPortas.getText()));
                carro.setQuilometragem(Double.parseDouble(txtKm.getText()));
                carro.setTipoDeCombustivel(cboxCombustivel.getValue());
                carro.setCapacidadePassageiros(Integer.parseInt(txtPassag.getText()));
                carro.setCapacidadeDoTanque(Integer.parseInt(txtTanque.getText()));
            }
            
            if(veiculo.getIdTipo().toLowerCase().equals("moto"))
            {
                moto.setQuilometragem(Double.parseDouble(txtKm.getText()));
                moto.setTipoDeCombustivel(cboxCombustivel.getValue());
                moto.setCapacidadeDoTanque(Integer.parseInt(txtTanque.getText()));
            }
            
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/frotadeveiculos","root","");
            testamento = conexao.createStatement();
            resSel=(ResultSetImpl) testamento.executeQuery("Select id from tb_modelo where modelo = '"+veiculo.getModelo()+"'");
            resSel.next();
            
            testamento = conexao.createStatement();
            resCor=(ResultSetImpl) testamento.executeQuery("Select id from tb_cor where cor = '"+veiculo.getCor()+"'");
            resCor.next();
            
            testamento = conexao.createStatement();
            resFrota=(ResultSetImpl) testamento.executeQuery("Select id from tb_frotaveicular where frota = '"+veiculo.getFrota()+"'");
            resFrota.next();
            
            veiculo.setModelo(resSel.getString("id"));
            veiculo.setCor(resCor.getString("id"));
            veiculo.setFrota(resFrota.getString("id"));
            
            testamento = conexao.createStatement();
            reg=testamento.executeUpdate("Insert into tb_veiculo"
                    + "(fk_modelo, ano_fabrico, matricula, fk_cor, img_foto, estado,fk_frota, fk_tipo, caminho) values("
                    +Integer.parseInt(veiculo.getModelo())+","+23+",'"+veiculo.getMatricula()+"',"+Integer.parseInt(veiculo.getCor())+",'imgkkkk',"+1+","
                    +Integer.parseInt(veiculo.getFrota())+","+Integer.parseInt(veiculo.getIdTipo())+",'andromeda')");
            System.out.println(reg+" registros afectados");
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Inserção a base de dados");
            alerta.setHeaderText("Registro de Pessoa");
            alerta.setContentText(reg+" registros afectados. Uma pessoa foi a dicionada!");
            alerta.show();
            
            conexao.close();
        }
        catch (Exception e)
        {
            System.out.println(""+e);
        }
        
        Parent form = FXMLLoader.load(getClass().getResource("GestVeiculo.fxml"));
        cena = new Scene(form);
        estagio = (Stage)((Node)evento.getSource()).getScene().getWindow();

        estagio.setScene(cena);
        estagio.centerOnScreen();
        estagio.show();
        
    }
    
    @FXML
    private void prev(ActionEvent evento) throws IOException
    {
        Parent form = FXMLLoader.load(getClass().getResource("GestVeiculo.fxml"));
        cena = new Scene(form);
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
}
