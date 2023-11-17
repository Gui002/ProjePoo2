/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Utilitarios.Posicionar;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Gui
 */
public class Estrutura_Carro {
    JLabel nome, preco, lbMae;
    ImageIcon foto;
    JPanel pnPrice ;
    public Estrutura_Carro(String nom, String prec, ImageIcon foto) {
        this.nome = new JLabel(nom);
        this.preco = new JLabel(prec);
        this.foto = foto;
        lbMae = new JLabel("",foto, JLabel.CENTER);
        pnPrice = new JPanel();;
        
        //SETS
        lbMae.setSize(447, 391);
        pnPrice.setSize(317, 92);
        nome.setSize(50, 10);
        preco.setSize(300, 10);
        preco.setHorizontalAlignment(JLabel.CENTER);        
        pnPrice.setLayout(null);
        pnPrice.setBackground(new Color(217, 217, 217, 150));
        
        //Posicoeos
        Posicionar.centralizaBaixo(lbMae, pnPrice);
        Posicionar.moverCimaBaixo(pnPrice, -35);
        Posicionar.centralizar(pnPrice, nome);
        Posicionar.moverCimaBaixo(nome, -20);
        Posicionar.centralizar(pnPrice, preco);
        Posicionar.moverCimaBaixo(preco, 20);
    }

    public JLabel getLbMae() {
        return lbMae;
    }

    public JLabel getNome() {
        return nome;
    }

    public void setNome(JLabel nome) {
        this.nome = nome;
    }

    public JLabel getPreco() {
        return preco;
    }

    public void setPreco(JLabel preco) {
        this.preco = preco;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

    public JPanel getPnPrice() {
        return pnPrice;
    }

    public void setPnPrice(JPanel pnPrice) {
        this.pnPrice = pnPrice;
    }
    
    
    
    
            
}
