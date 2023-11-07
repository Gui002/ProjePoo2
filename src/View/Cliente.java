/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Utilitarios.Dimensionador;
import Utilitarios.Posicionar;
import javax.swing.BorderFactory;
import javax.swing.*;
import javax.swing.JPanel;

/**
 *
 * @author Gui
 */
public class Cliente {

    //JFrame pnMae;
    JPanel pnMae;
    JPanel pnFormCliente;
    JTextField nomeCliente, apelidoCliente, contactoCliente, dataNascimento, endereco;
    JButton btnSalvar;

    Cliente() {
      //  pnMae = new JFrame();
       pnMae = new JPanel();
        pnFormCliente = new JPanel();
        nomeCliente = new JTextField();
        apelidoCliente = new JTextField();
        contactoCliente = new JTextField();
        dataNascimento = new JTextField();
        endereco = new JTextField();
        btnSalvar = new JButton("SALVAR");

        //SETS
      //  pnMae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnMae.setSize(1051, 1024);
        pnMae.setLayout(null);
        pnFormCliente.setLayout(null);
        pnFormCliente.setBorder(BorderFactory.createTitledBorder("Dados do Cliente"));
        nomeCliente.setBorder(BorderFactory.createTitledBorder("Nome"));
        apelidoCliente.setBorder(BorderFactory.createTitledBorder("Apelido"));
        contactoCliente.setBorder(BorderFactory.createTitledBorder("Contacto"));
        dataNascimento.setBorder(BorderFactory.createTitledBorder("Data de Nascimento"));

        //TAMANHOS 
        Dimensionador.tamanho(pnMae, pnFormCliente, .5f, 1f);
        nomeCliente.setSize(477, 61);
        apelidoCliente.setSize(477, 61);
        contactoCliente.setSize(477, 61);
        dataNascimento.setSize(477, 61);
        btnSalvar.setSize(150, 50);

        //POSICOES
        Posicionar.centralizar(pnMae, pnFormCliente);
        Posicionar.centralizaTopo(pnFormCliente, nomeCliente);
        Posicionar.moverCimaBaixo(nomeCliente, 150);
        Posicionar.colocaBaixo(pnFormCliente, nomeCliente, apelidoCliente);
        Posicionar.moverCimaBaixo(apelidoCliente, 10);
        Posicionar.colocaBaixo(pnFormCliente, apelidoCliente, contactoCliente);
        Posicionar.moverCimaBaixo(contactoCliente, 10);
        Posicionar.colocaBaixo(pnFormCliente, contactoCliente, dataNascimento);
        Posicionar.moverCimaBaixo(dataNascimento, 10);
        Posicionar.cantoInferiorDireito(pnFormCliente, btnSalvar);
        Posicionar.moverCimaBaixo(btnSalvar, -45);
        Posicionar.moverEsquerdaDireita(btnSalvar, -20);
        pnMae.setVisible(true);
    }

    public JPanel getPnMae() {
        return pnMae;
    }
    
    public static void main(String[] args) {
      //  new Cliente();
    }
}
