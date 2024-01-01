/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentodedados.crud;

import com.mysql.cj.jdbc.result.ResultSetImpl;
import gestadefrota.FrotaVeicular;
import gui.gest.veiculo.GestVeiculoController;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import ocorrencia.Cor;
import tratamentodedados.ConexaoBD;
import veiculos.Modelo;
import veiculos.Veiculo;

/**
 *
 * @author User
 */
public class CRUDVeiculo implements ICRUD{
    
    Statement testamento;
    ResultSetImpl res;
    Modelo modelo = new Modelo();
    Cor cor = new Cor ();
    FrotaVeicular frota = new FrotaVeicular();
    Veiculo veiculo = new Veiculo();
    Connection conexao;
    GestVeiculoController controlo = new GestVeiculoController();
    int reg;
    
    @Override
    public int inserir() {
        
        /*nome = txtNome.getText().trim();
        idade = Integer.parseInt(txtIdade.getText().toString().trim());
        sobrenome = txtSobrenome.getText().trim();
        bi = txtBI.getText().trim();
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/teste","root","");
            testamento = conexao.createStatement();
            reg=testamento.executeUpdate("Insert into tb_veiculo(id, nome, sobrenome, idade) values('"+bi+"','"+nome+"','"+sobrenome+"',"+idade+")");
            System.out.println(reg+" registros afectados");
             Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Inserção a base de dados");
            alerta.setHeaderText("Registro de Pessoa");
            alerta.setContentText(reg+" registros afectados. Uma pessoa foi a dicionada!");
            alerta.show();
            conexao.close();
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }*/
        
        return reg;
    }

    @Override
    public int modificar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ResultSetImpl selecionar() {
        
        return res;
    }
}
