/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*;
import Utilitarios.*;
import java.awt.Color;

/**
 *
 * @author Gui
 */
public class Cadastrar extends JFrame {

    JFrame pnMae;
    JPanel pnCadastro, pnFoto;

    Cadastrar() {
        pnMae = new JFrame();
        pnCadastro = new JPanel();
        pnFoto = new JPanel();

        pnMae.setSize(1051, 1024);
        pnMae.setLayout(null);
        pnCadastro.setBackground(Color.yellow);

        //TAMANHOS
        Dimensionador.tamanho(pnMae, pnCadastro, .5f, 1f);

        //POSICOES
        Posicionar.cantoSuperiorEsquerdo(pnMae, pnCadastro);
        
        pnMae.setVisible(true);
    }

    public static void main(String[] args) {
        new Cadastrar();
    }
}
