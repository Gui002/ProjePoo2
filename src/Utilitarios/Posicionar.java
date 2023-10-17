/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.awt.Component;
import java.awt.Container;
import javax.swing.*;

/**
 *
 * @author Gui
 */
public class Posicionar {

    static int X_frame, Y_frame, x_painel, y_painel, x_painel2, y_painel2;

    public Posicionar() {
    }

    static void inicializa(Container fr, Component pn) {
        X_frame = fr.getWidth();
        Y_frame = fr.getHeight();
        x_painel = pn.getWidth();
        y_painel = pn.getHeight();

    }

    static void inicializa(Container fr, Component pn, Component pn2) {
        inicializa(fr, pn);
        x_painel2 = pn2.getWidth();
        y_painel2 = pn2.getHeight();

    }

    //CENTROS
    public static void centralizar(Container fr, Component pn) {
        inicializa(fr, pn);
        X_frame = (int) ((X_frame / 2) - (x_painel / 2));
        Y_frame = (int) ((Y_frame / 2) - (y_painel / 2));
        pn.setBounds(X_frame, Y_frame, x_painel, y_painel);
        fr.add(pn);
    }

    public static void centralizaTopo(Container fr, Component pn) {
        inicializa(fr, pn);
        X_frame = (int) ((X_frame / 2) - (x_painel / 2));
        Y_frame = 0;
        pn.setBounds(X_frame, Y_frame, x_painel, y_painel);
        fr.add(pn);

    }

    public static void centralizaBaixo(Container fr, Component pn) {
        inicializa(fr, pn);
        X_frame = (int) ((X_frame / 2) - (x_painel / 2));
        Y_frame = (Y_frame) - (y_painel);
        pn.setBounds(X_frame, Y_frame, x_painel, y_painel);
        fr.add(pn);
    }

    public static void centralizaEsquerda(Container fr, Component pn) {
        inicializa(fr, pn);
        X_frame = 0;
        Y_frame = (int) (Y_frame / 2) - (y_painel / 2);
        pn.setBounds(X_frame, Y_frame, x_painel, y_painel);
        fr.add(pn);

    }

    public static void centralizaDireita(Container fr, Component pn) {
        inicializa(fr, pn);
        X_frame = (X_frame - x_painel);
        Y_frame = (int) (Y_frame / 2) - (y_painel / 2);
        pn.setBounds(X_frame, Y_frame, x_painel, y_painel);
        fr.add(pn);
    }

    //CANTOS
    public static void cantoSuperiorEsquerdo(Container fr, Component pn) {
        inicializa(fr, pn);
        X_frame = 0;
        Y_frame = 0;
        pn.setBounds(X_frame, Y_frame, x_painel, y_painel);
        fr.add(pn);
    }

    public static void cantoSuperiorDireito(Container fr, Component pn) {
        inicializa(fr, pn);
        X_frame = (X_frame - x_painel);
        Y_frame = 0;
        pn.setBounds(X_frame, Y_frame, x_painel, y_painel);
        fr.add(pn);

    }

    public static void cantoInferiorDireito(Container fr, Component pn) {
        inicializa(fr, pn);
        X_frame = X_frame - x_painel;
        Y_frame = Y_frame - y_painel;
        pn.setBounds(X_frame, Y_frame, x_painel, y_painel);
        fr.add(pn);
    }

    public static void cantoInferiorEsquerdo(Container fr, Component pn) {
        inicializa(fr, pn);
        X_frame = 0;
        Y_frame = (Y_frame) - (y_painel);
        pn.setBounds(X_frame, Y_frame, x_painel, y_painel);
        fr.add(pn);
    }

    //LADO DE OUTROS COMPONENTES
    public static void colocaDireita(Container fr, Component pn, Component pn2) {
        inicializa(fr, pn, pn2);
        X_frame = pn.getBounds().x + pn.getWidth();
        Y_frame = pn.getBounds().y;
        pn2.setBounds(X_frame, Y_frame, x_painel2, y_painel2);
        fr.add(pn2);

    }

    public static void colocaEsquerda(Container fr, Component pn, Component pn2) {
        inicializa(fr, pn, pn2);
        X_frame = (pn.getBounds().x - pn2.getWidth());
        Y_frame = pn.getBounds().y;
        pn2.setBounds(X_frame, Y_frame, x_painel2, y_painel2);
        fr.add(pn2);

    }

    public static void colocaBaixo(Container fr, Component pn, Component pn2) {
        inicializa(fr, pn, pn2);
        X_frame = pn.getBounds().x;
        Y_frame = pn.getBounds().y + pn.getHeight();
        pn2.setBounds(X_frame, Y_frame, x_painel2, y_painel2);
        fr.add(pn2);
    }

    public static void colocaCima(Container fr, Component pn, Component pn2) {
        inicializa(fr, pn, pn2);
        X_frame = pn.getBounds().x;
        Y_frame = pn.getBounds().y - pn2.getHeight();
        pn2.setBounds(X_frame, Y_frame, x_painel2, y_painel2);
        fr.add(pn2);
    }
    //MOVER VERTICAL

    public static void moverCimaBaixo(Component pn, int valor) {
        pn.setBounds(pn.getX(), pn.getY() + valor, pn.getWidth(), pn.getHeight());
    }

    //MOVER HORIZONTAL
    public static void moverEsquerdaDireita(Component pn, int valor) {
        pn.setBounds(pn.getX() + valor, pn.getY(), pn.getWidth(), pn.getHeight());
    }
}
