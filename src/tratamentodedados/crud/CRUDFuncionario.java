/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentodedados.crud;

import com.mysql.cj.jdbc.result.ResultSetImpl;
import java.sql.Statement;
import java.sql.Connection;
import personagem.Funcionario;
import personagem.Pessoa;

/**
 *
 * @author User
 */
public class CRUDFuncionario implements ICRUD{
    
    Statement testamento;
    ResultSetImpl res;
    Funcionario funcionario = new Funcionario ();
    Pessoa pessoa = new Pessoa();

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
