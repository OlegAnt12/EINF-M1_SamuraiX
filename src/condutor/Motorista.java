/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condutor;

import ocorrencia.Date;
import personagem.Condutor;


/**
 *
 * @author User
 */
public class Motorista extends Condutor{

    public Motorista() {
    }

    public Motorista(String habilitacao, String bI, String nome, String sobrenome, int idContacto) {
        super(habilitacao, bI, nome, sobrenome, idContacto);
    }
    
    
    public boolean isConduzir() {
        return conduzir;
    }

    public void setConduzir(boolean conduzir) {
        this.conduzir = conduzir;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getbI() {
        return bI;
    }

    public void setbI(String bI) {
        this.bI = bI;
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
    
    
}
