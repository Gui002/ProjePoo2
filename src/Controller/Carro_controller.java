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
        Carro_VO listCarro = bdCar.get(0);
        //Carro_VO(String marca, String modelo, String preco, String chassi, String cor, String urlFoto, int numeroChassim, int km) 
        cars.add(new Estrutura_Carro(listCarro.getMarca(), "2 . 0 0 0 . 0 0 0  MZN", new ImageIcon(listCarro.getUrlFoto())));
        cars.add(new Estrutura_Carro("ZIMAS", "2 . 0 0 0 . 0 0 0  MZN", new ImageIcon("X6.jpeg")));
        cars.add(new Estrutura_Carro("ZIMAS", "2 . 0 0 0 . 0 0 0  MZN", new ImageIcon("Toyota.jpeg")));
        cars.add(new Estrutura_Carro("ZIMAS", "2 . 0 0 0 . 0 0 0  MZN", new ImageIcon("Lambo.jpeg")));
        return cars;
    }

    //Testando metodo para preencher caaro clicado 
    public static ArrayList<Carro_VO> preenCher() {
        Carro_VO c = new Carro_VO("Guito", "zipzap", "2 . 0 0 0 . 0 0 0  MZN", "numero", "AZUL","bimas.jpg", 1, 1);
        Carro_VO c2 = new Carro_VO("Broo", "zipzap", "2 . 0 0 0 . 0 0 0  MZN", "numero", "AZUL","Toyota", 1, 1);
        ArrayList<Carro_VO> car = new ArrayList();
        car.add(c);
        car.add(c2);
        return car;
    }
    
    //Metodo para preencher as descricao
    
    public static void preencherDescricao(int posCarro){
        ArrayList<Carro_VO> cV = preenCher();
        Carro.lblmarca.setText(cV.get(posCarro).getMarca());
    }
}
