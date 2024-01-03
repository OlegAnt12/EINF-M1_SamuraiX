/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluguer;

/**
 *
 * @author User
 */
public class Taxa {
    
    private int id;
    private double valor;
    private double valorAcrescimo;
    private double caucao;

    public Taxa(int id, double valor, double valorAcrescimo, double caucao) {
        this.id = id;
        this.valor = valor;
        this.valorAcrescimo = valorAcrescimo;
        this.caucao = caucao;
    }

    public Taxa() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(double valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public double getCaucao() {
        return caucao;
    }

    public void setCaucao(double caucao) {
        this.caucao = caucao;
    }
    
    
    
}
