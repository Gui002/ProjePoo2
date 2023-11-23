/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Conexao;
import Model.VO.Client_VO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gui
 */
public class Cliente_DAO implements CRUD {

    @Override
    public ArrayList<Client_VO> select() {
        String query = "SELECT*FROM cliente where id = 120";
        ArrayList<Client_VO> clientes = new ArrayList<>();
        Client_VO c;
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nomeCliente = rs.getString("nome");
                String apelidoCliente = rs.getString("apelido");
                String dataNascimento = rs.getString("datanascimento");
                String endereco = rs.getString("endereco");
                String contactoCliente = rs.getString("contacto");
                int id = rs.getInt("id");
                c = new Client_VO(nomeCliente, apelidoCliente, dataNascimento, endereco, contactoCliente, id);
                clientes.add(c);
                System.out.println(">> " + nomeCliente);
            }
            con.close();
            rs.close();
        } catch (SQLException es) {
            System.out.println("Oii" + es.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clientes;
    }

    @Override
    public void insert(Object e) {
        String query = "INSERT INTO cliente (id, nome, apelido, datanascimento, endereco, contacto) VALUES (NULL, ?, ?,?, ?, ?);";
        Client_VO cliente = (Client_VO) e;
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getApelidoCliente());
            ps.setString(3, cliente.getDataNascimento());
            ps.setString(4, cliente.getEndereco());
            ps.setString(5, cliente.getContactoCliente());
            ps.execute();

            con.close();
        } catch (SQLException es) {
            System.out.println("Opaaa" + es.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Client_VO getLast() {
        String query = "SELECT*FROM cliente order by id desc limit 1";
        ArrayList<Client_VO> clientes = new ArrayList<>();
        Client_VO c = null;
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nomeCliente = rs.getString("nome");
                String apelidoCliente = rs.getString("apelido");
                String dataNascimento = rs.getString("datanascimento");
                String endereco = rs.getString("endereco");
                String contactoCliente = rs.getString("contacto");
                int id = rs.getInt("id");
                c = new Client_VO(nomeCliente, apelidoCliente, dataNascimento, endereco, contactoCliente, id);
                clientes.add(c);
                System.out.println(">> " + nomeCliente);
            }
            con.close();
            rs.close();
        } catch (SQLException es) {
            System.out.println("Oii" + es.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return c;
    }

    public static Client_VO getById(int ID) {
        String query = "SELECT*FROM cliente where id = ?";
        ArrayList<Client_VO> clientes = new ArrayList<>();
        Client_VO c = null;
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, ID);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nomeCliente = rs.getString("nome");
                String apelidoCliente = rs.getString("apelido");
                String dataNascimento = rs.getString("datanascimento");
                String endereco = rs.getString("endereco");
                String contactoCliente = rs.getString("contacto");
                int id = rs.getInt("id");
                c = new Client_VO(nomeCliente, apelidoCliente, dataNascimento, endereco, contactoCliente, id);
                clientes.add(c);
                System.out.println(">> " + nomeCliente);
            }
            con.close();
            rs.close();
        } catch (SQLException es) {
            System.out.println("Oii" + es.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return c;
    }

    public static void main(String[] args) {
        Cliente_DAO d = new Cliente_DAO();
        System.out.println(d.select());
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

