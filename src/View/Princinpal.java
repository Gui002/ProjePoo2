/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Utilitarios.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Gui
 */
public class Princinpal implements ActionListener {

    JPanel pnEsquerdo, pnDireito, pn2, pn3, pn4, pnPrice, painelActivo;
    JButton btnHome, btnCadastrar, btnHistorico, btnLogout, btnPesquisar;
    JFrame principal;
    JLabel iconeUsuario, nomeUsuario, fotoCarro, marca, preco;
    ImageIcon bimas;
    JTextField campoPesquisa;
    Cadastrar c;

    public Princinpal() {
        painelActivo = new JPanel();
        c = new Cadastrar();
        pnEsquerdo = new JPanel();
        pnDireito = new JPanel();
        fotoCarro = new JLabel(new ImageIcon("Bimas.jpg"), JLabel.CENTER);
        marca = new JLabel("BMW");
        preco = new JLabel("2 . 0 0 0 . 0 0 0  MZN");
        btnPesquisar = new JButton("PESQUISAR");
        campoPesquisa = new JTextField();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        pnPrice = new JPanel();
        principal = new JFrame();
        iconeUsuario = new JLabel("", new ImageIcon("login.png"), JLabel.CENTER);
        nomeUsuario = new JLabel("GUILHERME");
        btnHome = new JButton("H O M E");
        btnCadastrar = new JButton("CADASTRAR");
        btnHistorico = new JButton("HISTORICO");
        btnLogout = new JButton("LOGOUT");
        bimas = new ImageIcon("Bimas.jpg");

        //SETS
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setSize(1440, 1024);
        principal.setResizable(false);
        principal.setLayout(null);
        pnEsquerdo.setLayout(null);
        pnDireito.setLayout(null);
        pnPrice.setLayout(null);
        this.setPainelActivo(pnDireito);
        pnEsquerdo.setBackground(new Color(57, 57, 57));
        pnDireito.setBackground(new Color(163, 163, 163));
        fotoCarro.setBackground(Color.yellow);
        btnHome.setBackground(new Color(57, 57, 57));
        btnHome.setForeground(Color.white);
        btnCadastrar.setBackground(new Color(57, 57, 57));
        btnCadastrar.setForeground(Color.white);
        btnHistorico.setBackground(new Color(57, 57, 57));
        btnHistorico.setForeground(Color.white);
        btnLogout.setBackground(new Color(57, 57, 57));
        btnLogout.setForeground(Color.white);
        pnPrice.setBackground(new Color(217, 217, 217, 150));
        preco.setHorizontalAlignment(JLabel.CENTER);
       btnHome.setFocusable(false);
       btnCadastrar.setFocusable(false);
       btnHistorico.setFocusable(false);
       btnLogout.setFocusable(false);

        //TAMANHOS
        Dimensionador.tamanho(principal, pnEsquerdo, .27f, 1f);
        Dimensionador.tamanho(principal, pnDireito, .73f, 1f);
        Dimensionador.tamanho(pnEsquerdo, btnHome, 1f, .08f);
        Dimensionador.tamanho(pnEsquerdo, btnHistorico, 1f, .08f);
        Dimensionador.tamanho(pnEsquerdo, btnLogout, 1f, .08f);
        Dimensionador.tamanho(pnEsquerdo, btnCadastrar, 1f, .08f);
        Dimensionador.tamanho(pnDireito, fotoCarro, .3f, .3f);
        Dimensionador.tamanho(pnDireito, campoPesquisa, .7f, .04f);
        Dimensionador.tamanho(pnDireito, btnPesquisar, .1f, .04f);
        iconeUsuario.setSize(64, 64);
        nomeUsuario.setSize(100, 10);
        marca.setSize(50, 10);
        preco.setSize(300, 10);
        fotoCarro.setSize(447, 391);
        pn2.setSize(447, 391);
        pn3.setSize(447, 391);
        pn4.setSize(447, 391);
        pnPrice.setSize(317, 92);

        //EVENTOS
        btnCadastrar.addActionListener(this);
        btnHome.addActionListener(this);
         //Teste de icone
       // btnHome.add()

        //POSICOES
        Posicionar.cantoSuperiorEsquerdo(principal, pnEsquerdo);
        Posicionar.centralizaTopo(pnEsquerdo, iconeUsuario);
        Posicionar.moverCimaBaixo(iconeUsuario, 30);
        Posicionar.colocaBaixo(pnEsquerdo, iconeUsuario, nomeUsuario);
        Posicionar.colocaDireita(principal, pnEsquerdo, pnDireito);
        Posicionar.cantoSuperiorEsquerdo(pnDireito, fotoCarro);
        Posicionar.moverCimaBaixo(fotoCarro, 150);
        Posicionar.moverEsquerdaDireita(fotoCarro, 50);
        Posicionar.centralizar(pnEsquerdo, btnHome);
        Posicionar.moverCimaBaixo(btnHome, -200);
        Posicionar.cantoInferiorEsquerdo(pnEsquerdo, btnLogout);
        Posicionar.moverCimaBaixo(btnLogout, -30);
        Posicionar.colocaBaixo(pnEsquerdo, btnHome, btnCadastrar);
        Posicionar.moverCimaBaixo(btnCadastrar, 1);
        Posicionar.colocaBaixo(pnEsquerdo, btnCadastrar, btnHistorico);
        Posicionar.moverCimaBaixo(btnHistorico, 2);
        Posicionar.colocaDireita(pnDireito, fotoCarro, pn2);
        Posicionar.moverEsquerdaDireita(pn2, 50);
        Posicionar.colocaBaixo(pnDireito, fotoCarro, pn3);
        Posicionar.moverCimaBaixo(pn3, 50);
        Posicionar.colocaBaixo(pnDireito, pn2, pn4);
        Posicionar.moverCimaBaixo(pn4, 50);
        Posicionar.centralizaBaixo(fotoCarro, pnPrice);
        Posicionar.moverCimaBaixo(pnPrice, -35);
        Posicionar.centralizar(pnPrice, marca);
        Posicionar.moverCimaBaixo(marca, -20);
        Posicionar.centralizar(pnPrice, preco);
        Posicionar.moverCimaBaixo(preco, 20);
        Posicionar.colocaCima(pnDireito, fotoCarro, campoPesquisa);
        Posicionar.moverCimaBaixo(campoPesquisa, -90);
        Posicionar.colocaDireita(pnDireito, campoPesquisa, btnPesquisar);
        Posicionar.moverEsquerdaDireita(btnPesquisar, 10);
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);

    }

    public JPanel getPainelActivo() {
        return painelActivo;
    }

    public void setPainelActivo(JPanel painelActivo) {
        this.painelActivo = painelActivo;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JPanel aux = new JPanel();
        if (ae.getSource() == btnCadastrar) {
            aux = c.getPnMae();
            aux.setVisible(true);
            if (painelActivo != aux) {
                painelActivo.setVisible(false);
                Posicionar.colocaDireita(principal, pnEsquerdo, aux);
                setPainelActivo(aux);
            }
        }
        if (ae.getSource() == btnHome) {
            aux = pnDireito;
            aux.setVisible(true);
            if (painelActivo != aux) {
                painelActivo.setVisible(false);
                Posicionar.colocaDireita(principal, pnEsquerdo, aux);
                setPainelActivo(aux);
            }
        }
    }
}
