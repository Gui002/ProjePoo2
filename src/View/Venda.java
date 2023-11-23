/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gui
 */
public class Venda {

    JPanel pnMae;
    JScrollPane scrol;
    JPanel pnTabela, pn;
    public static JTable vendas;

    public Venda() {
        pnMae = new JPanel();
        String[] colunas = {"ID","Nome do cliente", "Marca do carro ", "Preço"};
        Object conteudo[][] = null;
        DefaultTableModel model = new DefaultTableModel(conteudo, colunas);
        vendas = new JTable(model);
        scrol = new JScrollPane(vendas);

        //SETS
        pnMae.setLayout(new BorderLayout());
        //TAMANHOS 
        pnMae.setSize(1051, 1024);
        
        //POSICOES
        pnMae.add(scrol);
        pnMae.setVisible(true);

    }

    public JPanel getPnMae() {
        return pnMae;
    }

}
