/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentesveiculo;

/**
 *
 * @author User
 */
public class Pneu extends Componente {
    
    private char tracao;
    private String tamanho;

    public char getTracao() {
        return tracao;
    }

    public void setTracao(char tracao) {
        this.tracao = tracao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getTipoComponente() {
        return tipoComponente;
    }

    @Override
    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    @Override
    public int getIdVeiculo() {
        return idVeiculo;
    }

    @Override
    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }
    
    
}
