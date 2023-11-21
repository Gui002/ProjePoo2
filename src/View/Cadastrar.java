/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Carro_controller;
import javax.swing.*;
import Utilitarios.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 *
 * @author Gui
 */
public class Cadastrar extends JFrame implements ActionListener {

    //JFrame pnMae;
    JPanel pnMae;
    JPanel pnCadastro, pnFoto;
    public static JTextField marca, modelo, preco, chassi, cor, km;
    public static JComboBox transmissao, tipoCombustivel;
    JButton btnAdicionar, btnSalvar, btnCancelar;
    JLabel iconeDescricao, fotoCarro;
    JFileChooser fc;
    static String url;

    Cadastrar() {
        //pnMae = new JFrame();
        url = "";
        fc = new JFileChooser();
        pnMae = new JPanel();
        pnCadastro = new JPanel();
        pnFoto = new JPanel();
        marca = new JTextField();
        modelo = new JTextField();
        preco = new JTextField();
        chassi = new JTextField();
        cor = new JTextField();
        km = new JTextField();
        fotoCarro = new JLabel();
        btnAdicionar = new JButton("Adicionar Foto");
        btnSalvar = new JButton("Salvar");
        btnCancelar = new JButton("Cancelar");
        String[] transm = {"Manual", "Automatico"};
        transmissao = new JComboBox(transm);
        String[] combus = {"Diesel", "Gasolina"};
        tipoCombustivel = new JComboBox(combus);
        iconeDescricao = new JLabel("", new ImageIcon("icones/descricao.png"), JLabel.CENTER);

        //SETS
        pnMae.setSize(1051, 1024);
        pnMae.setLayout(null);
        pnCadastro.setLayout(null);
        pnFoto.setLayout(null);
        // pnMae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnCadastro.setBorder(BorderFactory.createTitledBorder("CADASTRAR"));
        //pnCadastro.setBackground(new Color(163, 163, 163));
        // pnFoto.setBackground(new Color(163, 163, 163));
        pnFoto.setBorder(BorderFactory.createTitledBorder("FOTO"));
        marca.setBorder(BorderFactory.createTitledBorder("Marca"));
        modelo.setBorder(BorderFactory.createTitledBorder("Modelo"));
        preco.setBorder(BorderFactory.createTitledBorder("Preço"));
        chassi.setBorder(BorderFactory.createTitledBorder("Chassi"));
        cor.setBorder(BorderFactory.createTitledBorder("Cor"));
        km.setBorder(BorderFactory.createTitledBorder("Km"));
        transmissao.setBorder(BorderFactory.createTitledBorder("Transmissão"));
        tipoCombustivel.setBorder(BorderFactory.createTitledBorder("Tipo de Combustivel"));

        //TAMANHOS
        Dimensionador.tamanho(pnMae, pnCadastro, .5f, 1f);
        Dimensionador.tamanho(pnMae, pnFoto, .5f, 1f);
        Dimensionador.tamanho(pnFoto, fotoCarro, .98f, .97f);
        iconeDescricao.setSize(80, 80);
        marca.setSize(477, 61);
        modelo.setSize(477, 61);
        chassi.setSize(477, 61);
        preco.setSize(477, 61);
        km.setSize(477, 61);
        cor.setSize(477, 61);
        btnSalvar.setSize(150, 50);
        btnCancelar.setSize(150, 50);
        btnAdicionar.setSize(477, 61);
        transmissao.setSize(477, 61);
        tipoCombustivel.setSize(477, 61);

        //EVENTOS
        btnAdicionar.addActionListener(this);
        btnSalvar.addActionListener(this);

        //POSICOES
        Posicionar.colocaDireita(pnMae, pnCadastro, pnFoto);
        Posicionar.cantoSuperiorEsquerdo(pnMae, pnCadastro);
        Posicionar.centralizaTopo(pnCadastro, iconeDescricao);
        Posicionar.moverCimaBaixo(iconeDescricao, 45);
        Posicionar.cantoInferiorDireito(pnFoto, btnSalvar);
        Posicionar.moverCimaBaixo(btnSalvar, -45);
        Posicionar.moverEsquerdaDireita(btnSalvar, -20);
        Posicionar.colocaEsquerda(pnFoto, btnSalvar, btnCancelar);
        Posicionar.moverEsquerdaDireita(btnCancelar, -5);
        Posicionar.centralizaTopo(pnCadastro, marca);
        Posicionar.centralizaTopo(pnFoto, fotoCarro);
        Posicionar.centralizar(fotoCarro, btnAdicionar);
        Posicionar.moverCimaBaixo(btnAdicionar, -15);
        Posicionar.moverCimaBaixo(marca, 150);
        Posicionar.colocaBaixo(pnCadastro, marca, modelo);
        Posicionar.moverCimaBaixo(modelo, 10);
        Posicionar.colocaBaixo(pnCadastro, modelo, preco);
        Posicionar.moverCimaBaixo(preco, 10);
        Posicionar.colocaBaixo(pnCadastro, preco, chassi);
        Posicionar.moverCimaBaixo(chassi, 10);
        Posicionar.colocaBaixo(pnCadastro, chassi, cor);
        Posicionar.moverCimaBaixo(cor, 10);
        Posicionar.colocaBaixo(pnCadastro, cor, km);
        Posicionar.moverCimaBaixo(km, 10);
        Posicionar.colocaBaixo(pnCadastro, km, transmissao);
        Posicionar.moverCimaBaixo(transmissao, 10);
        Posicionar.colocaBaixo(pnCadastro, transmissao, tipoCombustivel);
        Posicionar.moverCimaBaixo(tipoCombustivel, 10);

        pnMae.setVisible(true);
    }

    public JPanel getPnMae() {
        return pnMae;
    }

    public static String getUrl() {
        return url;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // btnAdicionar.setVisible(false);
        if (ae.getSource() == btnAdicionar) {
            int returnVal = fc.showOpenDialog(Cadastrar.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                System.out.println(file.getPath());
                fotoCarro.setIcon(new ImageIcon(file.getPath()));
                String caminho = file.getPath();
                url = caminho;
            }
        }

        if (ae.getSource() == btnSalvar) {
            Carro_controller.adicionarCarro();
            Carro_controller.preencherMain();
        }
    }

}
