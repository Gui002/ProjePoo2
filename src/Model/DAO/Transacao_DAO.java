/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Conexao;
import Model.VO.Transacao_VO;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gui
 */
public class Transacao_DAO implements CRUD {

    @Override
    public ArrayList<Transacao_VO> select() {
        String query = "SELECT*FROM transacao where valorpagar > 0";
        ArrayList<Transacao_VO> trans = new ArrayList<>();
        Transacao_VO tr;
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int idCarro = rs.getInt("idcarro");
                int idCliente = rs.getInt("idcliente");
                int idFuncionario = rs.getInt("idfuncionario");
                int preco = rs.getInt("preco");
                int valorPagar = rs.getInt("valorpagar");
                String datainicial = rs.getString("datainicial");
                //Transacao_VO(int id, int idCliente, int idFuncionario, int idCarro, int preco, int valorPagar, String datainicial)
                tr = new Transacao_VO( id, idCliente, idFuncionario, idCarro, preco, valorPagar, datainicial);
                trans.add(tr);
            }
            con.close();
            rs.close();
        } catch (SQLException es) {
            System.out.println("Oii" + es.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return trans;
    }

    @Override
    public void insert(Object e) {
        String query = "INSERT INTO transacao (id, idcarro, idcliente, idfuncionario, preco, datainicial, valorpagar) VALUES (NULL, ?, ?, ?, ?, ?, ?)";
        Transacao_VO t = (Transacao_VO) e;
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, t.getIdCarro());
            ps.setInt(2, t.getIdCliente());
            ps.setInt(3, t.getIdFuncionario());
            ps.setInt(4, t.getPreco());
            ps.setString(5, t.getDatainicial());
            ps.setInt(6, t.getPreco());
            ps.execute();
            con.close();
        } catch (SQLException es) {
            System.out.println("cmk " + es.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Carro_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updateValor(int id, int novoValor) throws ClassNotFoundException{
                String query = "UPDATE transacao set valorpagar = ? where id = ?";
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, novoValor);
            ps.setInt(2, id);
            ps.executeUpdate();

            con.close();
        } catch (SQLException es) {
            System.out.println("Opaaa" + es.getMessage());
        }
    }
    
        public ArrayList<Transacao_VO> selectVenda() {
        String query = "SELECT*FROM transacao where valorpagar <=0 ";
        ArrayList<Transacao_VO> trans = new ArrayList<>();
        Transacao_VO tr;
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int idCarro = rs.getInt("idcarro");
                int idCliente = rs.getInt("idcliente");
                int idFuncionario = rs.getInt("idfuncionario");
                int preco = rs.getInt("preco");
                int valorPagar = rs.getInt("valorpagar");
                String datainicial = rs.getString("datainicial");
                //Transacao_VO(int id, int idCliente, int idFuncionario, int idCarro, int preco, int valorPagar, String datainicial)
                tr = new Transacao_VO( id, idCliente, idFuncionario, idCarro, preco, valorPagar, datainicial);
                trans.add(tr);
            }
            con.close();
            rs.close();
        } catch (SQLException es) {
            System.out.println("Oii" + es.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return trans;
    }
    @Override
    public void update(int e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
