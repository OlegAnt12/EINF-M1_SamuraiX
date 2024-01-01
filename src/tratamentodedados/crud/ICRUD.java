/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tratamentodedados.crud;

import com.mysql.cj.jdbc.result.ResultSetImpl;

/**
 *
 * @author User
 */
public interface ICRUD {
    
    public int inserir();
    public int modificar();
    public int eliminar();
    public ResultSetImpl selecionar();
    
}
