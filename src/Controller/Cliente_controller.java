/*99
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.Cliente_DAO;
import Model.VO.Client_VO;
import View.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Gui
 */
public class Cliente_controller {

    public static void adicionarCliente() {
        Cliente_DAO client = new Cliente_DAO();
        Client_VO c;        
        String nomeCliente = Cliente.nomeCliente.getText();
        String apelidoCliente = Cliente.apelidoCliente.getText();
        String dataNascimento = Cliente.dataNascimento.getText();
        System.out.println(" ..>"+dataNascimento);
        String endereco = Cliente.endereco.getText();
        String contactoCliente = Cliente.contactoCliente.getText();
        c = new Client_VO(nomeCliente, apelidoCliente, dataNascimento, endereco, contactoCliente,-99999);        
        client.insert(c);
        
    }
    
    
    public static void listarCliente(){
        Cliente_DAO client = new Cliente_DAO();
        ArrayList<Client_VO> c = client.select();
        System.out.println(c.size());
        for(int i = 0 ; i < c.size(); i++){
            Client_VO cl = c.get(i);
            System.out.println("ID:"+cl.getIdCliente());
        }
    }
}
