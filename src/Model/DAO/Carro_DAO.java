/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Conexao;
import Model.VO.Carro_VO;
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
public class Carro_DAO implements CRUD {

    @Override
    public ArrayList<Carro_VO> select() {
        String query = "SELECT*FROM carro where vendido = 0";
        ArrayList<Carro_VO> carros = new ArrayList<>();
        Carro_VO carro;
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String url = rs.getString("url");
                String combustivel = rs.getString("combustivel");
                String transmissao = rs.getString("transmissao");
                String numeroChassi = rs.getString("numerochassi");
                String cor = rs.getString("numerochassi");
                int preco = rs.getInt("preco");
                int km = rs.getInt("km");
                System.out.println(url);
                carro = new Carro_VO(marca, modelo, cor, url, combustivel, transmissao, numeroChassi, km, preco);
                carros.add(carro);
            }
            con.close();
            rs.close();
        } catch (SQLException es) {
            System.out.println("Oii" + es.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Carro_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return carros;
    }

    @Override
    public void insert(Object e) {          
        String query = "INSERT INTO carro (id, preco, km, marca, cor, modelo, url, combustivel, transmissao, numerochassi, vendido) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?,0 )";
        Carro_VO carro = (Carro_VO) e;
        ;
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement ps = con.prepareStatement(query);            
            ps.setInt(1, carro.getPreco());
            ps.setInt(2,carro.getKm());
            ps.setString(3, carro.getMarca());
            ps.setString(4, carro.getCor());
            ps.setString(5, carro.getModelo());
            ps.setString(6, carro.getUrlFoto());
            ps.setString(7, carro.getTipoCombustivel());
            ps.setString(8, carro.getTransm());
            ps.setString(9, carro.getNumeroChassim());
            ps.execute();
            con.close();
        } catch (SQLException es) {
            System.out.println("cmk " + es.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Carro_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

public static void main(String[] args) {
        Carro_DAO c = new Carro_DAO();
        c.select();
    }
    
}
