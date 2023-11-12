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
    public String marca, modelo, preco, chassi, cor;
    public int numeroChassim, km;

    public Carro_VO(String marca, String modelo, String preco, String chassi, String cor, int numeroChassim, int km) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.chassi = chassi;
        this.cor = cor;
        this.numeroChassim = numeroChassim;
        this.km = km;
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

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroChassim() {
        return numeroChassim;
    }

    public void setNumeroChassim(int numeroChassim) {
        this.numeroChassim = numeroChassim;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    
}
