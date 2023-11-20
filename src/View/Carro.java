/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Utilitarios.Dimensionador;
import Utilitarios.Posicionar;
import static View.Princinpal.principal;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Gui
 */
public class Carro implements ActionListener {

    JPanel pnMae, pnDescCarro, pnFotoCarro;
    public static JButton btnVender, btnEditar, btnRemover;
    public static JLabel lblmarca, lblmodelo, lblpreco, lblchassi, lblcor, lblkm, lbltransmissao, lbltipoCombustivel, fotoCarro;     
    Cliente client;

    Carro() {
        client = new Cliente();
        pnMae = new JPanel();
        pnDescCarro = new JPanel();
        pnFotoCarro = new JPanel();
        fotoCarro = new JLabel();
        btnRemover = new JButton("REMOVER");
        btnVender = new JButton("VENDER");
        btnEditar = new JButton("EDITAR");
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
        pnMae.setSize(1051, 1024);
        pnMae.setLayout(null);
        pnFotoCarro.setLayout(null);
       // fotoCarro.setLayout(null);
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
        

        //EVENTOS
        btnVender.addActionListener(this);

        //TAMANHOS
        Dimensionador.tamanho(pnMae, pnDescCarro, .5f, 1f);
        Dimensionador.tamanho(pnMae, pnFotoCarro, .5f, 1f);
        Dimensionador.tamanho(pnFotoCarro, fotoCarro, .98f, .97f);
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
        Posicionar.centralizar(pnFotoCarro, fotoCarro);
        Posicionar.cantoInferiorDireito(fotoCarro, btnVender);
        Posicionar.moverCimaBaixo(btnVender, -45);
        Posicionar.moverEsquerdaDireita(btnVender, -20);
        Posicionar.colocaEsquerda(fotoCarro, btnVender, btnEditar);
        Posicionar.moverEsquerdaDireita(btnEditar, -5);
        Posicionar.colocaEsquerda(fotoCarro, btnEditar, btnRemover);
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

    @Override
    public void actionPerformed(ActionEvent ae) {
        JPanel aux = new JPanel();
        if (ae.getSource() == btnVender) {
            aux = client.getPnMae();
            aux.setVisible(true);
            if (Princinpal.painelActivo != aux) {
                Princinpal.painelActivo.setVisible(false);
                Posicionar.colocaDireita(Princinpal.principal, Princinpal.pnEsquerdo, aux);
                Princinpal.painelActivo = aux;
            }
        }

    }
    
}
