/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manutencao;

import ocorrencia.Date;

/**
 *
 * @author User
 */
public class Manutencao {
    
    private int id;
    private String listaComponentes;
    private Date data;
    private int idMecanico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getListaComponentes() {
        return listaComponentes;
    }

    public void setListaComponentes(String listaComponentes) {
        this.listaComponentes = listaComponentes;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdMecanico() {
        return idMecanico;
    }

    public void setIdMecanico(int idMecanico) {
        this.idMecanico = idMecanico;
    }
    
    
}
