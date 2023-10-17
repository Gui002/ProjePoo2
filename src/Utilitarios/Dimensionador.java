/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.awt.Component;
import java.awt.Container;

/**
 *
 * @author Gui
 */
public class Dimensionador {
    static float X_frame, Y_frame, x_painel, y_painel;

    public Dimensionador() {
    }

    static void inicializa(Container fr, Component pn) {
        X_frame = fr.getWidth();
        Y_frame = fr.getHeight();       

    }

    public static void tamanho(Container fr, Component pn, float x, float y) {
           inicializa(fr, pn);
           x_painel = x*X_frame;
           y_painel = y*Y_frame;
           pn.setSize((int)x_painel ,(int) y_painel);
                   
           
    }
}
