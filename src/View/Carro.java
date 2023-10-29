/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Utilitarios.Dimensionador;
import Utilitarios.Posicionar;
import javax.swing.*;
import java.awt.Color;

/**
 *
 * @author Gui
 */
public class Carro {

    //JFrame pnMae;
    JPanel pnMae;
    JPanel pnDescCarro, pnFotoCarro, pnFoto;
    JButton btnVender, btnEditar, btnRemover;
    JLabel lblmarca, lblmodelo, lblpreco, lblchassi, lblcor, lblkm, lbltransmissao, lbltipoCombustivel;
    JLabel fotoCarro;

    Carro() {
        //pnMae = new JFrame();
        pnMae = new JPanel();
        pnDescCarro = new JPanel();
        pnFotoCarro = new JPanel();
        pnFoto = new JPanel();
        btnRemover = new JButton("REMOVER");
        btnVender = new JButton("VENDER");
        btnEditar = new JButton("EDITAR");
        fotoCarro = new JLabel();
        lblchassi = new JLabel();
        lblcor = new JLabel();
        lblpreco = new JLabel();
        lblkm = new JLabel();
        lblmarca = new JLabel("Guilherme Jacob Panguana");
        lblmodelo = new JLabel();
        lblmodelo = new JLabel();
        lbltransmissao = new JLabel();
        lbltipoCombustivel = new JLabel();

        //SETS
        // pnMae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnMae.setSize(1051, 1024);
        pnMae.setLayout(null);
        pnFotoCarro.setLayout(null);
        pnFoto.setLayout(null);
        pnDescCarro.setLayout(null);
        pnFotoCarro.setBorder(BorderFactory.createTitledBorder("Foto"));
        pnDescCarro.setBorder(BorderFactory.createTitledBorder("Descrição"));
        lblmarca.setBorder(BorderFactory.createTitledBorder("Marca"));
        lblmodelo.setBorder(BorderFactory.createTitledBorder("Modelo"));
        lblpreco.setBorder(BorderFactory.createTitledBorder("Preço"));
        lblchassi.setBorder(BorderFactory.createTitledBorder("Chassi"));
        lblcor.setBorder(BorderFactory.createTitledBorder("Cor"));
        lblkm.setBorder(BorderFactory.createTitledBorder("Km"));
        lbltransmissao.setBorder(BorderFactory.createTitledBorder("Transmissão"));
        lbltipoCombustivel.setBorder(BorderFactory.createTitledBorder("Combustivel"));
        pnFoto.setBackground(Color.yellow);

        //TAMANHOS
        Dimensionador.tamanho(pnMae, pnDescCarro, .5f, 1f);
        Dimensionador.tamanho(pnMae, pnFotoCarro, .5f, 1f);
        Dimensionador.tamanho(pnFotoCarro, pnFoto, .98f, .97f);
        btnVender.setSize(150, 50);
        btnRemover.setSize(150, 50);
        btnEditar.setSize(150, 50);
        lblmarca.setSize(477, 61);
        lblmodelo.setSize(477, 61);
        lblpreco.setSize(477, 61);
        lblchassi.setSize(477, 61);
        lblcor.setSize(477, 61);
        lblkm.setSize(477, 61);
        lbltransmissao.setSize(477, 61);
        lbltipoCombustivel.setSize(477, 61);

        //POSICOES
        Posicionar.cantoSuperiorEsquerdo(pnMae, pnDescCarro);
        Posicionar.colocaDireita(pnMae, pnDescCarro, pnFotoCarro);
        Posicionar.centralizar(pnFotoCarro, pnFoto);
        Posicionar.cantoInferiorDireito(pnFoto, btnVender);
        Posicionar.moverCimaBaixo(btnVender, -45);
        Posicionar.moverEsquerdaDireita(btnVender, -20);
        Posicionar.colocaEsquerda(pnFoto, btnVender, btnEditar);
        Posicionar.moverEsquerdaDireita(btnEditar, -5);
        Posicionar.colocaEsquerda(pnFoto, btnEditar, btnRemover);
        Posicionar.moverEsquerdaDireita(btnRemover, -5);
        Posicionar.centralizaTopo(pnDescCarro, lblmarca);
        Posicionar.moverCimaBaixo(lblmarca, 150);
        Posicionar.colocaBaixo(pnDescCarro, lblmarca, lblmodelo);
        Posicionar.moverCimaBaixo(lblmodelo, 10);
        Posicionar.colocaBaixo(pnDescCarro, lblmodelo, lblpreco);
        Posicionar.moverCimaBaixo(lblpreco, 10);
        Posicionar.colocaBaixo(pnDescCarro, lblpreco, lblchassi);
        Posicionar.moverCimaBaixo(lblchassi, 10);
        Posicionar.colocaBaixo(pnDescCarro, lblchassi, lblcor);
        Posicionar.moverCimaBaixo(lblcor, 10);
        Posicionar.colocaBaixo(pnDescCarro, lblcor, lblkm);
        Posicionar.moverCimaBaixo(lblkm, 10);
        Posicionar.colocaBaixo(pnDescCarro, lblkm, lbltransmissao);
        Posicionar.moverCimaBaixo(lbltransmissao, 10);
        Posicionar.colocaBaixo(pnDescCarro, lbltransmissao, lbltipoCombustivel);
        Posicionar.moverCimaBaixo(lbltipoCombustivel, 10);

        pnMae.setVisible(true);

    }

    public JPanel getPnMae() {
        return pnMae;
    }

    public static void main(String[] args) {
        new Carro();
    }
}
