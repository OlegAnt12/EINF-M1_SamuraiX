/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentesveiculo;

/**
 *
 * @author User
 */
public class Motor extends Componente {
    
    private String tipoMotor;
    private double cilindragem;
    private String tipoCombustivel;
    private int potencia;

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public double getCilindragem() {
        return cilindragem;
    }

    public void setCilindragem(double cilindragem) {
        this.cilindragem = cilindragem;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
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
