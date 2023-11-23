/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Funcionario_controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Gui
 */
public class Login extends JFrame implements ActionListener{
    public static JTextField nome ;
    public static JPasswordField senha;
    JPanel painel;
    JButton btn;
    Login() {
        painel = new JPanel();
        nome = new JTextField(10);
        senha = new JPasswordField(10);
        btn = new JButton("Validar");
        this.setSize(420, 500);
        
        painel.add(nome);
        painel.add(senha);
        painel.add(btn);
        this.add(painel);
        btn.addActionListener(this);
        
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        //VALIDAR CAMPOS
        boolean acesso = false;
        try {
            acesso = Funcionario_controller.logar();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(acesso);
        if(acesso){
            this.dispose();
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }

}
