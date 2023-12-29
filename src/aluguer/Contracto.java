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
    private Date dataInicio;
    private Date dataFim;
    private int idTaxa;
    private int idArquivo;
    private int idCliente;
    private String modeloAluguer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getModeloAluguer() {
        return modeloAluguer;
    }

    public void setModeloAluguer(String modeloAluguer) {
        this.modeloAluguer = modeloAluguer;
    }
    
    
}
