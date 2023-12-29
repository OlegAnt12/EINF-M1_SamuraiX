/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

/**
 *
 * @author User
 */
public class Bicicleta extends Veiculo{
    
    private int tamanhoQuadro;

    public int getTamanhoQuadro() {
        return tamanhoQuadro;
    }

    public void setTamanhoQuadro(int tamanhoQuadro) {
        this.tamanhoQuadro = tamanhoQuadro;
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
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int getAnoFabrico() {
        return anoFabrico;
    }

    @Override
    public void setAnoFabrico(int anoFabrico) {
        this.anoFabrico = anoFabrico;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String getEstado() {
        return estado;
    }

    @Override
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String getImgFoto() {
        return imgFoto;
    }

    @Override
    public void setImgFoto(String imgFoto) {
        this.imgFoto = imgFoto;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
