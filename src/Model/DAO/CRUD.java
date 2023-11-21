/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import java.util.ArrayList;

/**
 *
 * @author Gui
 */
public interface CRUD<E> {
    public abstract ArrayList<E> select();
    public abstract  void insert(E e);
}
