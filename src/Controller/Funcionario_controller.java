    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.Funcionario_DAO;
import Model.VO.Funcionario_VO;
import View.Login;
import View.Princinpal;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Gui
 */
public class Funcionario_controller {

    public static boolean logar() throws ClassNotFoundException {
        boolean acesso = false;
        Funcionario_DAO c = new Funcionario_DAO();
        ArrayList<Funcionario_VO> func = c.select();
        if (func.size() > 0) {
            for (int i = 0; i < func.size(); i++) {
                Funcionario_VO f = func.get(i);
                if (f.getSenha().equals(Login.senha.getText())  && f.getNome().equals(Login.nome.getText())) {
                    System.out.println("Dentro");
                    new Princinpal();
                    Princinpal.nomeUsuario.setText(f.getNome().toUpperCase());
                    Princinpal.idFuncionario = f.getId();
                    System.out.println("ID : ...>"+f.getId());
                    acesso = true;
                }
            }
        }
        return acesso;
    }
}
