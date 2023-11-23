/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import View.Cadastrar;
import Model.DAO.Carro_DAO;
import Model.VO.Carro_VO;
import View.Carro;
import View.Estrutura_Carro;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Gui
 */
public class Carro_controller {

    public void inicializar() {

    }

    public static ArrayList<Estrutura_Carro> preencherMain() {
        ArrayList<Estrutura_Carro> cars = new ArrayList();
        ArrayList<Carro_VO> bdCar = listarCarro();

        for (int i = 0; i < bdCar.size(); i++) {
            Carro_VO listCarro = bdCar.get(i);
            cars.add(new Estrutura_Carro(listCarro.getMarca(), "" + listCarro.getPreco() + " MZN ", new ImageIcon(listCarro.getUrlFoto())));
        }

        return cars;
    }

    //Testando metodo para preencher caaro clicado 
    public static ArrayList<Carro_VO> listarCarro() {
        Carro_DAO carrDao = new Carro_DAO();
        ArrayList<Carro_VO> car = carrDao.select();
        return car;
    }
    public static int listarCarro(int t) {
        Carro_DAO carrDao = new Carro_DAO();
        ArrayList<Carro_VO> car = carrDao.select();
        int id = car.get(t).getIdCarro();
        return id;
    }

    //Metodo para preencher as descricao
    public static void preencherDescricao(int posCarro) {
        ArrayList<Carro_VO> cV = listarCarro();
        Carro_VO car = cV.get(posCarro);
        Carro.lblmarca.setText(car.getMarca());
        Carro.lblmodelo.setText(car.getModelo());
        Carro.fotoCarro.setIcon(new ImageIcon(car.getUrlFoto()));
        Carro.lblchassi.setText("" + car.getNumeroChassim());
        Carro.lblkm.setText("" + car.getKm());
        Carro.lblcor.setText(car.getCor());
        Carro.lblpreco.setText("" + car.getPreco());
        Carro.lbltransmissao.setText(car.getTransm());
        Carro.lbltipoCombustivel.setText(car.getTipoCombustivel());

    }

    public static void adicionarCarro() {
        String marca, modelo, cor, urlFoto, tipoCombustivel, transm, numeroChassim;
        int km, preco;
        Carro_DAO carrDao = new Carro_DAO();
        Carro_VO carro;
        marca = Cadastrar.marca.getText();
        modelo = Cadastrar.modelo.getText();
        urlFoto = Cadastrar.getUrl();
        cor = Cadastrar.cor.getText();
        tipoCombustivel = (String) Cadastrar.tipoCombustivel.getSelectedItem();
        transm = (String ) Cadastrar.transmissao.getSelectedItem();
        numeroChassim = Cadastrar.chassi.getText();
        km = Integer.parseInt(Cadastrar.km.getText().trim());
        preco = Integer.parseInt(Cadastrar.preco.getText().trim());        
        carro = new Carro_VO(marca, modelo, cor, urlFoto, tipoCombustivel, transm, numeroChassim, km, preco, -99999);          
        carrDao.insert(carro);

    }
}
