/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tratamentodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class ConexaoBD {

    Connection conexao;

    public ConexaoBD() throws SQLException {
        this.conexao = DriverManager.getConnection("jdbc:mysql://localhost/frotadeveiculos","root","");
    }
    
    public Connection getConexao() {
        return conexao;
    }
}
