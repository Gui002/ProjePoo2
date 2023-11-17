/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*;
import Utilitarios.Dimensionador;
import Utilitarios.Posicionar;
import java.awt.Color;

/**
 *
 * @author Gui
 */
public class Transacao {

    //JFrame pnMae;
    JPanel pnMae;
    JPanel pnTransacao, pnParcela;
    JLabel nomeCliente, marca, preco, status, data, nrParcelas, precoParcela, iconeTransacao, iconeDinheiro;
    JTextField numParcelas;
    JButton btnConfirmar, btnCancelar;
    JComboBox formaPagamento, metodoPagamento;
    
    public Transacao() {
       // pnMae = new JFrame();
        pnMae = new JPanel();
        pnTransacao = new JPanel();
        nomeCliente = new JLabel();
        marca = new JLabel();
        preco = new JLabel();
        status = new JLabel();
        data = new JLabel();
        precoParcela = new JLabel();
        nrParcelas = new JLabel();
        numParcelas = new JTextField();
        pnParcela = new JPanel();
        btnCancelar = new JButton("CANCELAR");
        btnConfirmar = new JButton("CONFIRMAR");
        iconeTransacao = new JLabel("", new ImageIcon("icones/transacao.png"), JLabel.CENTER);
        iconeDinheiro = new JLabel("", new ImageIcon("icones/dinheiro.png"), JLabel.CENTER);
        String[] metods = {"Cartão de credito", "Cash", "Carteira movel"};
        metodoPagamento = new JComboBox(metods);
        String[] formas = {"--Selecionar--", "Completo", "Parcelado"};
        formaPagamento = new JComboBox(formas);

        //SETS
        pnMae.setSize(1051, 1024);
        pnMae.setLayout(null);
        pnTransacao.setLayout(null);
        pnParcela.setLayout(null);
        pnTransacao.setBorder(BorderFactory.createTitledBorder("Transação"));
        pnParcela.setBorder(BorderFactory.createTitledBorder("Pacelado"));
        formaPagamento.setBorder(BorderFactory.createTitledBorder("Forma de Pagamento"));
        marca.setBorder(BorderFactory.createTitledBorder("Marca"));
        nomeCliente.setBorder(BorderFactory.createTitledBorder("Nome do Cliente"));
        preco.setBorder(BorderFactory.createTitledBorder("Valor a pagar"));
        status.setBorder(BorderFactory.createTitledBorder("Estado"));
        data.setBorder(BorderFactory.createTitledBorder("Data"));
        metodoPagamento.setBorder(BorderFactory.createTitledBorder("Metodo de pagamento"));
        nrParcelas.setBorder(BorderFactory.createTitledBorder("Numde de parcelas"));
        precoParcela.setBorder(BorderFactory.createTitledBorder("Preço da parcelas"));
        numParcelas.setBorder(BorderFactory.createTitledBorder("Pacelas a pagar"));
      //  pnMae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //TAMANHOS 
        Dimensionador.tamanho(pnMae, pnTransacao, .5f, 1f);
        Dimensionador.tamanho(pnMae, pnParcela, .5f, 1f);
        metodoPagamento.setSize(477, 61);
        formaPagamento.setSize(477, 61);
        precoParcela.setSize(477, 61);
        numParcelas.setSize(477, 61);
        nomeCliente.setSize(477, 61);
        nrParcelas.setSize(477, 61);
        status.setSize(477, 61);
        marca.setSize(477, 61);
        preco.setSize(477, 61);
        data.setSize(477, 61);
        iconeTransacao.setSize(80, 80);
        iconeDinheiro.setSize(80, 80);
        btnConfirmar.setSize(150, 50);
        btnCancelar.setSize(150, 50);

        //POSICOES
        Posicionar.centralizar(pnTransacao, formaPagamento);
        Posicionar.centralizaTopo(pnTransacao, iconeTransacao);
        Posicionar.moverCimaBaixo(iconeTransacao, 45);
        Posicionar.colocaDireita(pnMae, pnTransacao, pnParcela);
        Posicionar.centralizaTopo(pnParcela, iconeDinheiro);
        Posicionar.moverCimaBaixo(iconeDinheiro, 45);
        Posicionar.centralizar(pnParcela, metodoPagamento);
        Posicionar.centralizaTopo(pnParcela, nrParcelas);
        Posicionar.moverCimaBaixo(nrParcelas, 150);
        Posicionar.colocaBaixo(pnParcela, nrParcelas, precoParcela);
        Posicionar.colocaBaixo(pnParcela, precoParcela, numParcelas);
        Posicionar.cantoInferiorDireito(pnParcela, btnConfirmar);
        Posicionar.moverCimaBaixo(btnConfirmar, -45);
        Posicionar.moverEsquerdaDireita(btnConfirmar, -20);
        Posicionar.colocaEsquerda(pnParcela, btnConfirmar, btnCancelar);
        Posicionar.moverEsquerdaDireita(btnCancelar, -5);
        Posicionar.centralizaTopo(pnTransacao, nomeCliente);
        Posicionar.moverCimaBaixo(nomeCliente, 150);
        Posicionar.colocaBaixo(pnTransacao, nomeCliente, marca);
        Posicionar.colocaBaixo(pnTransacao, marca, preco);
        Posicionar.colocaBaixo(pnTransacao, preco, status);
        Posicionar.cantoSuperiorEsquerdo(pnMae, pnTransacao);
        pnMae.setVisible(true);
   //     pnMae.setLocationRelativeTo(null);
    }

    public JPanel getPnMae() {
        return pnMae;
    }
        

    public static void main(String[] args) {
        new Transacao();
    }

}
