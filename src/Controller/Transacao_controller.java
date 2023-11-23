/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.Carro_DAO;
import Model.DAO.Cliente_DAO;
import Model.DAO.Transacao_DAO;
import Model.VO.Carro_VO;
import Model.VO.Client_VO;
import Model.VO.Transacao_VO;
import View.Princinpal;
import View.Cliente;
import View.Tabela;
import View.Transacao;
import View.Venda;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gui
 */
public class Transacao_controller {

    public static void adicionarTransacao() {
        Transacao_DAO t = new Transacao_DAO();
        LocalDate data = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dat = data.format(formato);
        Carro_VO c = Carro_DAO.getByID(Princinpal.idCarro);
        Client_VO cl = Cliente_DAO.getLast();
        //Transacao_VO(int id, int idCliente, int idFuncionario, int idCarro, int preco, int valorPagar, String datainicial)
        int idCliente = cl.getIdCliente();
        int idCarro = Princinpal.idCarro;
        int idFuncionario = Princinpal.idFuncionario;
        int preco = c.getPreco();
        int valorPagar = Transacao.novoValor;

        Transacao_VO tr = new Transacao_VO(-9999, idCliente, idFuncionario, idCarro, preco, valorPagar, dat);

        t.insert(tr);

    }

    public static void listar() throws ClassNotFoundException {
        Transacao_DAO dado = new Transacao_DAO();
        ArrayList<Transacao_VO> dados = dado.select();
        for (int i = 0; i < dados.size(); i++) {
            Client_VO cl = Cliente_DAO.getById(dados.get(i).getIdCliente());
            Carro_VO cr = Carro_DAO.getByID(dados.get(i).getIdCarro());
            String[] conteudo = {"" + dados.get(i).getId(), "" + cl.getNomeCliente(), "" + cr.getMarca(), "" + dados.get(i).getValorPagar(), "Incompleto"};
            DefaultTableModel tm = (DefaultTableModel) Tabela.transacoes.getModel();
            tm.addRow(conteudo);
        }

    }
    public static void listarVenda() throws ClassNotFoundException {
        Transacao_DAO dado = new Transacao_DAO();
        ArrayList<Transacao_VO> dados = dado.select();
        for (int i = 0; i < dados.size(); i++) {
            Client_VO cl = Cliente_DAO.getById(dados.get(i).getIdCliente());
            Carro_VO cr = Carro_DAO.getByID(dados.get(i).getIdCarro());
            String[] conteudo = {"" + dados.get(i).getId(), "" + cl.getNomeCliente(), "" + cr.getMarca(), "" +cr.getPreco()};
            DefaultTableModel tm = (DefaultTableModel) Venda.vendas.getModel();
            tm.addRow(conteudo);
        }

    }
    
    public static void actualizar(int id, int novoValor) throws ClassNotFoundException{
        Transacao_DAO.updateValor(id, novoValor);
    }
//{"ID","Nome do cliente", "Marca do carro ", "Valor a Pagar", "Estado"}
    //            Client_VO cl = Cliente_DAO.getById(dados.get(i).getIdCliente());
//            Carro_VO cr = Carro_DAO.getByID(dados.get(i).getIdCarro());

    public static void dadosCliente() {
        Transacao t = new Transacao();
        
    }

    public static void dadosCarro() {
        Carro_VO c = Carro_DAO.getByID(Princinpal.idCarro);
        System.out.println(" Marca ->"+c.getMarca());
        Transacao.marca.setText(c.getMarca());
        Transacao.preco.setText("" + c.getPreco());
        Transacao.precoParcela.setText((" " + (c.getPreco() / 2)));
        Transacao.nrParcelas.setText("2");
    }

}
