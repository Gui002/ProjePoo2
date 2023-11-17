/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Estrutura_Carro;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Gui
 */
public class Carro_controller {
    public static ArrayList<Estrutura_Carro> preencherMain(){
        ArrayList<Estrutura_Carro> cars = new ArrayList();        
        cars.add(new Estrutura_Carro("ZIMAS", "2 . 0 0 0 . 0 0 0  MZN", new ImageIcon("Bimas.jpg")));        
        cars.add(new Estrutura_Carro("ZIMAS", "2 . 0 0 0 . 0 0 0  MZN", new ImageIcon("X6.jpeg")));        
        cars.add(new Estrutura_Carro("ZIMAS", "2 . 0 0 0 . 0 0 0  MZN", new ImageIcon("Toyota.jpeg")));        
        cars.add(new Estrutura_Carro("ZIMAS", "2 . 0 0 0 . 0 0 0  MZN", new ImageIcon("Lambo.jpeg")));                        
        return cars;
    }    
}
