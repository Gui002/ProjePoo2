/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JFrame;

/**
 *
 * @author Gui
 */
public class Cliente {

    JFrame pnMae;

    Cliente() {
        pnMae = new JFrame();

        pnMae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnMae.setSize(1051, 1024);
        pnMae.setLayout(null);
        
        pnMae.setVisible(true);
    }
    public static void main(String[] args) {
        new Cliente();
    }
}
