/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aluguer;

/**
 *
 * @author User
 */
public class Arquivo {
    
    private int id;
    private String copiaBI;
    private String copiaHabilitacao;
    private String fotografia;

    public Arquivo() {
    }

    public Arquivo(int id, String copiaBI, String copiaHabilitacao, String fotografia) {
        this.id = id;
        this.copiaBI = copiaBI;
        this.copiaHabilitacao = copiaHabilitacao;
        this.fotografia = fotografia;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCopiaBI() {
        return copiaBI;
    }

    public void setCopiaBI(String copiaBI) {
        this.copiaBI = copiaBI;
    }

    public String getCopiaHabilitacao() {
        return copiaHabilitacao;
    }

    public void setCopiaHabilitacao(String copiaHabilitacao) {
        this.copiaHabilitacao = copiaHabilitacao;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }
    
    
}
