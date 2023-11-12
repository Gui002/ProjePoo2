/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Utilitarios.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Gui
 */
public class Princinpal implements ActionListener, MouseListener {

    public static JPanel pnEsquerdo, pnDireito, pn2, pn3, pn4, pnPrice, painelActivo;
    JButton btnHome, btnCadastrar, btnHistorico, btnLogout, btnPesquisar, btnVendas;
    public static JFrame principal;
    JLabel iconeUsuario, nomeUsuario, fotoCarro, marca, preco;
    ImageIcon bimas;
    JTextField campoPesquisa;
    Cadastrar c;
    Carro car;

    public Princinpal() {
        c = new Cadastrar();
        car = new Carro();
        painelActivo = new JPanel();
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
        Font fonte = new Font("Arial", 10, 15);
        principal = new JFrame();
        iconeUsuario = new JLabel("", new ImageIcon("icones/User.png"), JLabel.CENTER);
        nomeUsuario = new JLabel("GUILHERME");
        btnHome = new JButton("H O M E");
        btnCadastrar = new JButton("C A D A S T R A R");
        btnHistorico = new JButton("H I S T O R I C O");
        btnLogout = new JButton("L O G O U T");
        btnVendas = new JButton("V E N D A S");
        bimas = new ImageIcon("Bimas.jpg");
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
        pnPrice.setLayout(null);
        this.setPainelActivo(pnDireito);
        pnEsquerdo.setBackground(new Color(57, 57, 57));
        pnDireito.setBackground(new Color(163, 163, 163));
        btnHome.setBackground(new Color(57, 57, 57));
        btnHome.setBorder(BorderFactory.createEmptyBorder());
        btnHome.setForeground(Color.white);
        btnHome.setFocusable(false);
        btnCadastrar.setBorder(BorderFactory.createEmptyBorder());
        btnCadastrar.setBackground(new Color(57, 57, 57));
        btnCadastrar.setForeground(Color.white);
        btnHistorico.setBorder(BorderFactory.createEmptyBorder());
        btnHistorico.setBackground(new Color(57, 57, 57));
        btnHistorico.setForeground(Color.white);
        btnVendas.setBorder(BorderFactory.createEmptyBorder());
        btnVendas.setBackground(new Color(57, 57, 57));
        btnVendas.setForeground(Color.white);
        btnLogout.setBorder(BorderFactory.createEmptyBorder());
        btnLogout.setBackground(new Color(57, 57, 57));
        btnLogout.setForeground(Color.white);
        pnPrice.setBackground(new Color(217, 217, 217, 150));
        preco.setHorizontalAlignment(JLabel.CENTER);
        nomeUsuario.setForeground(new Color(0, 201, 201));
        btnHome.setFocusable(false);
        btnCadastrar.setFocusable(false);
        btnHistorico.setFocusable(false);
        btnLogout.setFocusable(false);
        btnVendas.setFocusable(false);

        //TAMANHOS
        Dimensionador.tamanho(principal, pnEsquerdo, .27f, 1f);
        Dimensionador.tamanho(principal, pnDireito, .73f, 1f);
        Dimensionador.tamanho(pnEsquerdo, btnHome, 1f, .08f);
        Dimensionador.tamanho(pnEsquerdo, btnHistorico, 1f, .08f);
        Dimensionador.tamanho(pnEsquerdo, btnVendas, 1f, .08f);
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

        //Icones
        btnHome.add(icon_home);
        btnCadastrar.add(icon_cadastrar);
        btnHistorico.add(icon_historico);
        btnLogout.add(icon_sair);
        btnVendas.add(icon_venda);
        btnHome.setFont(fonte);
        btnVendas.setFont(fonte);
        btnCadastrar.setFont(fonte);
        btnHistorico.setFont(fonte);
        btnLogout.setFont(fonte);

        //EVENTOS
        btnHome.addActionListener(this);
        btnHome.addMouseListener(this);
        btnCadastrar.addActionListener(this);
        btnCadastrar.addMouseListener(this);
        btnHistorico.addActionListener(this);
        btnHistorico.addMouseListener(this);
        btnVendas.addActionListener(this);
        btnVendas.addMouseListener(this);
        btnLogout.addActionListener(this);
        btnLogout.addMouseListener(this);
        pn3.addMouseListener(this);
        fotoCarro.addMouseListener(this);
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
        Posicionar.colocaBaixo(pnEsquerdo, btnCadastrar, btnVendas);
        Posicionar.moverCimaBaixo(btnVendas, 2);
        Posicionar.colocaBaixo(pnEsquerdo, btnVendas, btnHistorico);
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

//        if(ae.getSource() == car.btnVender){
//            System.out.println("Olaaa");
//        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        JPanel aux = new JPanel();
        if (me.getSource() == fotoCarro) {
            aux = car.getPnMae();
            aux.setVisible(true);
            if (painelActivo != aux) {
                painelActivo.setVisible(false);
                Posicionar.colocaDireita(principal, pnEsquerdo, aux);
                setPainelActivo(aux);
            }
        }

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
