/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentodedados.crud;

import com.mysql.cj.jdbc.result.ResultSetImpl;
import java.sql.Statement;
import java.sql.Connection;
import manutencao.Manutencao;
import ocorrencia.Date;
import personagem.Mecanico;
import veiculos.Veiculo;

/**
 *
 * @author User
 */
public class CRUDManutencao implements ICRUD{
    
    Statement testamento;
    ResultSetImpl res;
    Manutencao manutencao = new Manutencao();
    Veiculo veiculo = new Veiculo();
    Mecanico mecanico = new Mecanico ();
    Date data = new Date();

    @Override
    public int inserir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
