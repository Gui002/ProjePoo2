/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.VO;

/**
 *
 * @author Gui
 */
public class Carro_VO {

    public String marca, modelo, cor, urlFoto, tipoCombustivel, transm,  numeroChassim;
    public int km, preco;

    public Carro_VO(String marca, String modelo, String cor, String urlFoto, String tipoCombustivel, String transm, String numeroChassim, int km, int preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.urlFoto = urlFoto;
        this.tipoCombustivel = tipoCombustivel;
        this.transm = transm;
        this.numeroChassim = numeroChassim;
        this.km = km;
        this.preco = preco;
    }



    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTransm() {
        return transm;
    }

    public void setTransm(String transm) {
        this.transm = transm;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

   
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumeroChassim() {
        return numeroChassim;
    }

    public void setNumeroChassim(String numeroChassim) {
        this.numeroChassim = numeroChassim;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

}
