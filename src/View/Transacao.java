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
    JFrame pnMae;
    JPanel pnTransacao;
    JLabel nomeCliente, marca, preco, status;
    JComboBox formaPagamento;
    public Transacao() {
        pnMae = new JFrame();
        pnTransacao = new JPanel();
        nomeCliente = new JLabel();
        marca = new JLabel();
        preco = new JLabel();
        status = new JLabel();
        String[] formas = {"--Selecionar--","A vista","Cash"};
        formaPagamento = new JComboBox(formas);
        
        //SETS
         pnMae.setSize(1051, 1024);
         pnMae.setLayout(null);
         pnTransacao.setLayout(null);
         pnTransacao.setBackground(Color.yellow);
         pnTransacao.setBorder(BorderFactory.createTitledBorder("Transação"));
         pnMae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         //TAMANHOS 
         Dimensionador.tamanho(pnMae, pnTransacao, .5f, 1f);
         
         //POSICOES
         Posicionar.cantoSuperiorEsquerdo(pnMae, pnTransacao);
        pnMae.add(formaPagamento);
        pnMae.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Transacao();
    }
    
}
