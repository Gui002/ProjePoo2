/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gui
 */
public class Conexao {

    static String host;
    static String nomeDoBD;
    static String usuario;
    static String senha;

    public Conexao() {
        this.host = "localhost";
        //this.nomeDoBD = "loja";
        this.nomeDoBD = "concessionaria";
        this.usuario = "root";
        this.senha = "";
    }

    public static Connection getConexao() throws ClassNotFoundException {
        Connection cn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexao con = new Conexao();
            cn = DriverManager.getConnection("jdbc:mysql://" + host + "/" + nomeDoBD, usuario, senha);
        } catch (SQLException es) {
            System.out.println(es.getMessage());            
        }
            if(cn == null){
                System.out.println("Nao foi possivel conectar a BD");
            }
        return cn;
    }

}