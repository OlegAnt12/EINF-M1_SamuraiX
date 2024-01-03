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
public class Funcionario extends Pessoa{
    
    protected String funcao;

    public Funcionario() {
    }

    public Funcionario(String funcao) {
        this.funcao = funcao;
    }

    public Funcionario(String bI, String nome, String sobrenome, int idContacto) {
        super(bI, nome, sobrenome, idContacto);
    }
    

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
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
