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
public class Admin extends Funcionario{

    @Override
    public String getFuncao() {
        return funcao;
    }

    @Override
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

    @Override
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
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
