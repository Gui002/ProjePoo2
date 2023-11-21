/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Carro_controller;
import Utilitarios.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Gui
 */
public class Princinpal implements ActionListener, MouseListener {

    public static JPanel pnEsquerdo, pnDireito, painelActivo;
    JButton btnHome, btnCadastrar, btnTransacao, btnLogout, btnPesquisar, btnVendas, btnFrente, btnTra;
    public static JFrame principal;
    JLabel iconeUsuario, nomeUsuario;
    ImageIcon bimas, bim, toyo, lb;
    JTextField campoPesquisa;
    Cadastrar cadastro;
    Carro car;
    Venda venda;
    TabelaTransacao tabT;
    int posCarro;
    JButton[] carros;

    //Tetando 
    ArrayList<Estrutura_Carro> es;
    //

    public Princinpal() {
        cadastro = new Cadastrar();
        car = new Carro();
        venda = new Venda();
        tabT = new TabelaTransacao();
        posCarro = 0;
        es = Carro_controller.preencherMain();
        painelActivo = new JPanel();
        pnEsquerdo = new JPanel();
        pnDireito = new JPanel();
        btnPesquisar = new JButton("PESQUISAR");
        campoPesquisa = new JTextField();
        carros = new JButton[4];
        Font fonte = new Font("Arial", 10, 15);
        principal = new JFrame();
        iconeUsuario = new JLabel("", new ImageIcon("icones/User.png"), JLabel.CENTER);
        nomeUsuario = new JLabel("GUILHERME");
        btnHome = new JButton("H O M E");
        btnCadastrar = new JButton("C A D A S T R A R");
        btnTransacao = new JButton("T R A N S A Ç Ã O");
        btnLogout = new JButton("L O G O U T");
        btnVendas = new JButton("V E N D A S");
        btnFrente = new JButton(">>");
        btnTra = new JButton("<<");
        JLabel icon_home = new JLabel(new ImageIcon("icones/home_2.png"));
        JLabel icon_cadastrar = new JLabel(new ImageIcon("icones/cadastrar.png"));
        JLabel icon_historico = new JLabel(new ImageIcon("icones/historico.png"));
        JLabel icon_sair = new JLabel(new ImageIcon("icones/sair.png"));
        JLabel icon_venda = new JLabel(new ImageIcon("icones/venda.png"));

        //SETS
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setSize(1440, 1024);
        principal.setResizable(false);
        principal.setLayout(null);
        pnEsquerdo.setLayout(null);
        pnDireito.setLayout(null);
        this.setPainelActivo(pnDireito);
        pnEsquerdo.setBackground(new Color(57, 57, 57));
        //pnDireito.setBackground(new Color(163, 163, 163));
        btnHome.setBackground(new Color(57, 57, 57));
        btnHome.setBorder(BorderFactory.createEmptyBorder());
        btnHome.setForeground(Color.white);
        btnHome.setFocusable(false);
        btnCadastrar.setBorder(BorderFactory.createEmptyBorder());
        btnCadastrar.setBackground(new Color(57, 57, 57));
        btnCadastrar.setForeground(Color.white);
        btnTransacao.setBorder(BorderFactory.createEmptyBorder());
        btnTransacao.setBackground(new Color(57, 57, 57));
        btnTransacao.setForeground(Color.white);
        btnVendas.setBorder(BorderFactory.createEmptyBorder());
        btnVendas.setBackground(new Color(57, 57, 57));
        btnVendas.setForeground(Color.white);
        btnLogout.setBorder(BorderFactory.createEmptyBorder());
        btnLogout.setBackground(new Color(57, 57, 57));
        btnLogout.setForeground(Color.white);
        nomeUsuario.setForeground(new Color(0, 201, 201));
        btnHome.setFocusable(false);
        btnCadastrar.setFocusable(false);
        btnTransacao.setFocusable(false);
        btnLogout.setFocusable(false);
        btnVendas.setFocusable(false);

        //TAMANHOS
        Dimensionador.tamanho(principal, pnEsquerdo, .27f, 1f);
        Dimensionador.tamanho(principal, pnDireito, .73f, 1f);
        Dimensionador.tamanho(pnEsquerdo, btnHome, 1f, .08f);
        Dimensionador.tamanho(pnEsquerdo, btnTransacao, 1f, .08f);
        Dimensionador.tamanho(pnEsquerdo, btnVendas, 1f, .08f);
        Dimensionador.tamanho(pnEsquerdo, btnLogout, 1f, .08f);
        Dimensionador.tamanho(pnEsquerdo, btnCadastrar, 1f, .08f);
        Dimensionador.tamanho(pnDireito, campoPesquisa, .7f, .04f);
        Dimensionador.tamanho(pnDireito, btnPesquisar, .1f, .04f);
        iconeUsuario.setSize(64, 64);
        nomeUsuario.setSize(100, 10);
        btnFrente.setSize(150, 50);
        btnTra.setSize(150, 50);
        for (int i = 0; i < carros.length; i++) {
            carros[i] = new JButton();
            carros[i].setSize(447, 391);
            carros[i].setBorder(BorderFactory.createEmptyBorder());
        }

        //Icones
        btnHome.add(icon_home);
        btnCadastrar.add(icon_cadastrar);
        btnTransacao.add(icon_historico);
        btnLogout.add(icon_sair);
        btnVendas.add(icon_venda);
        btnHome.setFont(fonte);
        btnVendas.setFont(fonte);
        btnCadastrar.setFont(fonte);
        btnTransacao.setFont(fonte);
        btnLogout.setFont(fonte);

        //EVENTOS
        btnHome.addActionListener(this);
        btnHome.addMouseListener(this);
        btnCadastrar.addActionListener(this);
        btnCadastrar.addMouseListener(this);
        btnTransacao.addActionListener(this);
        btnTransacao.addMouseListener(this);
        btnVendas.addActionListener(this);
        btnVendas.addMouseListener(this);
        btnLogout.addActionListener(this);
        btnLogout.addMouseListener(this);
        carros[0].addActionListener(this);
        carros[1].addActionListener(this);
        carros[2].addActionListener(this);
        carros[3].addActionListener(this);
        btnFrente.addActionListener(this);
        btnTra.addActionListener(this);
        for (int i = 0; i < carros.length; i++) {
            try {
                carros[i].add(es.get(posCarro + i).getLbMae());
            }catch(IndexOutOfBoundsException e){
                carros[i].add(new JLabel("SEM CARRO", JLabel.CENTER));
            }
        }

        //POSICOES
        Posicionar.cantoSuperiorEsquerdo(principal, pnEsquerdo);
        Posicionar.centralizaTopo(pnEsquerdo, iconeUsuario);
        Posicionar.moverCimaBaixo(iconeUsuario, 30);
        Posicionar.colocaBaixo(pnEsquerdo, iconeUsuario, nomeUsuario);
        Posicionar.colocaDireita(principal, pnEsquerdo, pnDireito);
        Posicionar.centralizar(pnEsquerdo, btnHome);
        Posicionar.moverCimaBaixo(btnHome, -200);
        Posicionar.cantoInferiorEsquerdo(pnEsquerdo, btnLogout);
        Posicionar.moverCimaBaixo(btnLogout, -30);
        Posicionar.colocaBaixo(pnEsquerdo, btnHome, btnCadastrar);
        Posicionar.moverCimaBaixo(btnCadastrar, 1);
        Posicionar.colocaBaixo(pnEsquerdo, btnCadastrar, btnVendas);
        Posicionar.moverCimaBaixo(btnVendas, 2);
        Posicionar.colocaBaixo(pnEsquerdo, btnVendas, btnTransacao);
        Posicionar.moverCimaBaixo(btnTransacao, 2);
        Posicionar.cantoSuperiorEsquerdo(pnDireito, carros[0]);
        Posicionar.moverCimaBaixo(carros[0], 100);
        Posicionar.moverEsquerdaDireita(carros[0], 50);
        Posicionar.colocaDireita(pnDireito, carros[0], carros[1]);
        Posicionar.moverEsquerdaDireita(carros[1], 50);
        Posicionar.colocaBaixo(pnDireito, carros[0], carros[2]);
        Posicionar.moverCimaBaixo(carros[2], 50);
        Posicionar.colocaBaixo(pnDireito, carros[1], carros[3]);
        Posicionar.moverCimaBaixo(carros[3], 50);
        Posicionar.cantoInferiorDireito(pnDireito, btnFrente);
        Posicionar.moverCimaBaixo(btnFrente, -35);
        Posicionar.moverEsquerdaDireita(btnFrente, -55);
        Posicionar.colocaEsquerda(pnDireito, btnFrente, btnTra);
        //Posicionar.moverEsquerdaDireita(btnTra, -648);
        Posicionar.moverEsquerdaDireita(btnTra, -15);
        Posicionar.colocaCima(pnDireito, carros[0], campoPesquisa);
        Posicionar.moverCimaBaixo(campoPesquisa, -40);
        Posicionar.colocaDireita(pnDireito, campoPesquisa, btnPesquisar);
        Posicionar.moverEsquerdaDireita(btnPesquisar, 10);
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);

    }

    //Gambiara 2 Test
    //
    public JPanel getPainelActivo() {
        return painelActivo;
    }

    public void setPainelActivo(JPanel painelActivo) {
        this.painelActivo = painelActivo;
    }

    //TRATAMENTO DE EVENTOS
    @Override
    public void actionPerformed(ActionEvent ae) {
        JPanel aux = new JPanel();
        if (ae.getSource() == btnCadastrar) {
            aux = cadastro.getPnMae();
            this.trocaTela(aux);
        }
        if (ae.getSource() == btnHome) {
            aux = pnDireito;
            this.trocaTela(aux);
        }
        if (ae.getSource() == carros[0]) {
            Carro_controller.preencherDescricao(posCarro);
            aux = car.getPnMae();
            this.trocaTela(aux);
        }
        if (ae.getSource() == carros[1]) {
            Carro_controller.preencherDescricao(posCarro + 1);
            aux = car.getPnMae();
            this.trocaTela(aux);
        }
        if (ae.getSource() == carros[2]) {
            Carro_controller.preencherDescricao(posCarro + 2);
            aux = car.getPnMae();
            this.trocaTela(aux);
        }
        if (ae.getSource() == carros[3]) {
            Carro_controller.preencherDescricao(posCarro + 3);
            aux = car.getPnMae();
            this.trocaTela(aux);
        }

        if (ae.getSource() == btnVendas) {
            Carro_controller.preencherDescricao(posCarro + 3);
            aux = venda.getPnMae();
            this.trocaTela(aux);
        }

        if (ae.getSource() == btnTransacao) {
            aux = tabT.getPnMae();
            this.trocaTela(aux);
        }

//
        if (ae.getSource() == btnTra) {
            for (int i = 0; i < carros.length; i++) {
                carros[i].remove(es.get(posCarro + i).getLbMae());
            }
            posCarro -= 4;
            for (int i = 0; i < carros.length; i++) {
                carros[i].add(es.get(posCarro + i).getLbMae());
                carros[i].revalidate();
                carros[i].repaint();
            }

        }
        
        if (ae.getSource() == btnFrente) {

            for (int i = 0; i < carros.length; i++) {
                carros[i].remove(es.get(posCarro + i).getLbMae());
            }
            posCarro += 4;
            for (int i = 0; i < carros.length; i++) {
                carros[i].add(es.get(posCarro + i).getLbMae());
                carros[i].revalidate();
                carros[i].repaint();
            }
        }

    }

    public void trocaTela(JPanel aux) {
        aux.setVisible(true);
        if (painelActivo != aux) {
            painelActivo.setVisible(false);
            Posicionar.colocaDireita(principal, pnEsquerdo, aux);
            setPainelActivo(aux);
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if ((me.getSource()) instanceof JButton) {
            ((JButton) me.getSource()).setForeground(new Color(0, 201, 201));
            ((JButton) me.getSource()).setBackground(Color.gray);
        }
    }

    @Override
    public void mouseExited(MouseEvent me) {
        if ((me.getSource()) instanceof JButton) {
            ((JButton) me.getSource()).setForeground(Color.white);
            ((JButton) me.getSource()).setBackground(new Color(57, 57, 57));
        }
    }
}
