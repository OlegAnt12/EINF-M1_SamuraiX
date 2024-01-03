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
public class Condutor extends Funcionario{
    
    protected boolean conduzir;
    protected String habilitacao;

    public Condutor() {
    }

    public Condutor(boolean conduzir, String habilitacao) {
        this.conduzir = conduzir;
        this.habilitacao = habilitacao;
    }

    public Condutor(String habilitacao, String bI, String nome, String sobrenome, int idContacto) {
        super(bI, nome, sobrenome, idContacto);
        this.habilitacao = habilitacao;
    }

    
    public boolean isConduzir() {
        return conduzir;
    }

    public void setConduzir(boolean conduzir) {
        this.conduzir = conduzir;
    }

    @Override
    public String getFuncao() {
        return funcao;
    }

    @Override
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    @Override
    public String getbI() {
        return bI;
    }

    @Override
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

    
    @Override
    public int getIdContacto() {
        return idContacto;
    }

    @Override
    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    @Override
    public int getIdLocalidade() {
        return idLocalidade;
    }

    @Override
    public void setIdLocalidade(int idLocalidade) {
        this.idLocalidade = idLocalidade;
    }

    @Override
    public Date getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
}
