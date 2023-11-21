/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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

    public static ArrayList<Estrutura_Carro> preencherMain() {
        ArrayList<Estrutura_Carro> cars = new ArrayList();
        ArrayList<Carro_VO> bdCar = preenCher();
        
        for (int i = 0; i < bdCar.size(); i++) {
            Carro_VO listCarro = bdCar.get(i);
            cars.add(new Estrutura_Carro(listCarro.getMarca(),""+listCarro.getPreco()+" MZN ", new ImageIcon(listCarro.getUrlFoto())));
        }
        
        return cars;
    }

    //Testando metodo para preencher caaro clicado 
    public static ArrayList<Carro_VO> preenCher() {
                       //Carro_VO(String marca, String modelo, String cor, String urlFoto, String tipoCombustivel, String transm, int numeroChassim, int km, int preco)
        Carro_VO c = new Carro_VO("Guito", "zipzap", "AZUL", "bimas.jpg", "DIESEL", "Manual", "9BD111060T5002156", 1, 2000000);
        Carro_VO c2 = new Carro_VO("Guito", "zipzap", "AZUL", "Toyota.jpeg", "DIESEL", "Manual", "", 1, 2000000);
        Carro_VO c3 = new Carro_VO("Guito", "zipzap", "AZUL", "X6.jpeg", "DIESEL", "Manual", "", 1, 2000000);
        Carro_VO c4 = new Carro_VO("Guito", "zipzap", "AZUL", "Lambo.jpeg", "DIESEL", "Manual", "", 1, 2000000);
        Carro_VO c5 = new Carro_VO("Guito", "zipzap", "AZUL", "x.jpg", "DIESEL", "Manual", "", 1, 2000000);
        Carro_VO c6 = new Carro_VO("Guito", "zipzap", "AZUL", "1.jpg", "GASOLINA", "Manual", "", 1, 2000000);
        Carro_VO c7 = new Carro_VO("Guito", "zipzap", "AZUL", "2.jpg", "DIESEL", "Manual", "", 1, 2000000);
        Carro_VO c8 = new Carro_VO("Guito", "zipzap", "AZUL", "3.jpg", "DIESEL", "Manual", "", 1, 2000000);
        ArrayList<Carro_VO> car = new ArrayList();
        car.add(c);
        car.add(c2);
        car.add(c3);
        car.add(c4);
        car.add(c5);
        car.add(c6);
        car.add(c7);
        car.add(c8);
        return car;
    }

    //Metodo para preencher as descricao
    public static void preencherDescricao(int posCarro) {
        ArrayList<Carro_VO> cV = preenCher();
        Carro_VO car = cV.get(posCarro);
        Carro.lblmarca.setText(car.getMarca());
        Carro.lblmodelo.setText(car.getModelo());
        Carro.fotoCarro.setIcon(new ImageIcon(car.getUrlFoto()));
        Carro.lblchassi.setText(""+car.getNumeroChassim());
        Carro.lblkm.setText("" + car.getKm());
        Carro.lblcor.setText(car.getCor());
        Carro.lblpreco.setText(""+car.getPreco());
        Carro.lbltransmissao.setText(car.getTransm());
        Carro.lbltipoCombustivel.setText(car.getTipoCombustivel());
        
    }
}
