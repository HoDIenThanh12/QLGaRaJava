/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.Car;
import java.util.ArrayList;

/**
 *
 * @author Thành Lùn PiPi
 */
public interface CarInterFace {
    public ArrayList<Car> getAll();
    public Car update(Car bv);
    public Car addNew(Car bv);
    public ArrayList<Car> finByIDStaff(int id);
    public ArrayList<Car> finByNameStaff(String name);
    public ArrayList<Car> finByIDTypeStaff(int idTy);
}
