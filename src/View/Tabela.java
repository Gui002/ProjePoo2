/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Utilitarios.Posicionar;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gui
 */
public class Tabela implements ListSelectionListener {

    public static JTable transacoes;
    JPanel pnMae;
    JScrollPane scrol;
    JPanel pnTabela, pn;
    Transacao t;
    public Tabela() {
        pnMae = new JPanel();
        t = new Transacao();
        String[] colunas = {"ID", "Nome do cliente", "Marca do carro ", "Valor a Pagar", "Estado"};
        Object conteudo[][] = null;
        DefaultTableModel model = new DefaultTableModel(conteudo, colunas);
        transacoes = new JTable(model);
        scrol = new JScrollPane(transacoes);

        //SETS
        pnMae.setLayout(new BorderLayout());
        ListSelectionModel selectionModel = transacoes.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(this);
        //TAMANHOS 
        pnMae.setSize(1051, 1024);

        //POSICOES
        pnMae.add(scrol);
        pnMae.setVisible(true);

    }

    public JPanel getPnMae() {
        return pnMae;
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        JPanel aux = new JPanel();
      
        if (!lse.getValueIsAdjusting()) {
            int selectedRow = transacoes.getSelectedRow();
            if (selectedRow != -1) {
                String ID = transacoes.getValueAt(selectedRow, 0).toString();
                String nomeCliente = transacoes.getValueAt(selectedRow, 1).toString();
                String marcaCarro = transacoes.getValueAt(selectedRow, 2).toString();
                String valorPagar = transacoes.getValueAt(selectedRow, 3).toString();
                String estado = transacoes.getValueAt(selectedRow, 4).toString();
                //  {"ID","Nome do cliente", "Marca do carro ", "Valor a Pagar", "Estado"}
                Transacao.nombre.setText(nomeCliente);
                Transacao.marca.setText(marcaCarro);
                Transacao.preco.setText(valorPagar);
                Transacao.precoParcela.setText(valorPagar);
                Transacao.nrParcelas.setText("1");
                Transacao.status.setText(estado);
                Transacao.numParcelas.setEditable(false);
                Transacao.formaPagamento.setEnabled(false); 
                Transacao.idTr = Integer.parseInt(ID);
                
      
            aux = t.getPnMae();
            aux.setVisible(true);
            if (Princinpal.painelActivo != aux) {
                Princinpal.painelActivo.setVisible(false);
                Posicionar.colocaDireita(Princinpal.principal, Princinpal.pnEsquerdo, aux);
                Princinpal.painelActivo = aux;
            }
            }
            
            
        }
    }

}
