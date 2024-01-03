/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluguer;

import ocorrencia.Date;

/**
 *
 * @author User
 */
public class Contracto {
    
    private int id;
    private String dataInicio;
    private String dataFim;
    private int idTaxa;
    private int idArquivo;
    private String idCliente;
    private String modeloAluguer;

    public Contracto() {
    }

    public Contracto(int id, String dataInicio, String dataFim, String idCliente, String modeloAluguer) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.idCliente = idCliente;
        this.modeloAluguer = modeloAluguer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public int getIdTaxa() {
        return idTaxa;
    }

    public void setIdTaxa(int idTaxa) {
        this.idTaxa = idTaxa;
    }

    public int getIdArquivo() {
        return idArquivo;
    }

    public void setIdArquivo(int idArquivo) {
        this.idArquivo = idArquivo;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getModeloAluguer() {
        return modeloAluguer;
    }

    public void setModeloAluguer(String modeloAluguer) {
        this.modeloAluguer = modeloAluguer;
    }
    
    
}
