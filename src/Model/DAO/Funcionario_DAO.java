/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Conexao;
import Model.VO.Funcionario_VO;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gui
 */
public class Funcionario_DAO implements CRUD {

    @Override
    public ArrayList<Funcionario_VO> select() {
        String query = "SELECT*FROM funcionario";
        ArrayList<Funcionario_VO> func = new ArrayList<>();
        Funcionario_VO c;
        try {
            Connection con = Conexao.getConexao();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                String contacto = rs.getString("contacto");
                String senha = rs.getString("senha");
                int id = rs.getInt("id");
                c = new Funcionario_VO(nome, contacto, senha, id);
                func.add(c);
            }
            con.close();
            rs.close();
        } catch (SQLException es) {
            System.out.println("Oii" + es.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cliente_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return func;
    }

    @Override
    public void update(int e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public void insert(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
