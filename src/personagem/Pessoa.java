/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personagem;

import ocorrencia.Date;

/**
 *
 * @author User
 */
public class Pessoa {
    
    protected String bI;
    protected String nome;
    protected String sobrenome;
    protected int idContacto;
    protected int idLocalidade;
    protected Date dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String bI, String nome, String sobrenome, int idContacto) {
        this.bI = bI;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idContacto = idContacto;
    }
    
    

    public String getbI() {
        return bI;
    }

    public void setbI(String bI) {
        this.bI = bI;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public int getIdLocalidade() {
        return idLocalidade;
    }

    public void setIdLocalidade(int idLocalidade) {
        this.idLocalidade = idLocalidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
    
    
}
