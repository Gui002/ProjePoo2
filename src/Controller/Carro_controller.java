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
            cars.add(new Estrutura_Carro(listCarro.getMarca(),listCarro.getPreco(), new ImageIcon(listCarro.getUrlFoto())));
        }
        
        return cars;
    }

    //Testando metodo para preencher caaro clicado 
    public static ArrayList<Carro_VO> preenCher() {
        Carro_VO c = new Carro_VO("Guito", "zipzap", "2 . 0 0 0 . 0 0 0  MZN", "numero", "AZUL", "bimas.jpg", 1, 1);
        Carro_VO c2 = new Carro_VO("Broo", "zipzap", "2 . 0 0 0 . 0 0 0  MZN", "numero", "AZUL", "Toyota.jpeg", 1, 1);
        Carro_VO c3 = new Carro_VO("Broo", "zipzap", "2 . 0 0 0 . 0 0 0  MZN", "numero", "AZUL", "X6.jpeg", 1, 1);
        Carro_VO c4 = new Carro_VO("Broo", "zipzap", "2 . 0 0 0 . 0 0 0  MZN", "numero", "AZUL", "Lambo.jpeg", 1, 1);
        Carro_VO c5 = new Carro_VO("Broo", "zipzap", "2 . 0 0 0 . 0 0 0  MZN", "numero", "AZUL", "x.jpeg", 1, 1);
        Carro_VO c6 = new Carro_VO("Broo", "zipzap", "2 . 0 0 0 . 0 0 0  MZN", "numero", "AZUL", "1.jpg", 1, 1);
        Carro_VO c7 = new Carro_VO("Broo", "zipzap", "2 . 0 0 0 . 0 0 0  MZN", "numero", "AZUL", "2.jpg", 1, 1);
        Carro_VO c8 = new Carro_VO("Broo", "zipzap", "2 . 0 0 0 . 0 0 0  MZN", "numero", "AZUL", "3.jpg", 1, 1);
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
        Carro.lblchassi.setText(car.getChassi());
        Carro.lblkm.setText("" + car.getKm());
        Carro.lblcor.setText(car.getCor());
        Carro.lblpreco.setText(car.getPreco());
        
    }
}
