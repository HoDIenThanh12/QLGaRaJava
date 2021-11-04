/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.BillE;
import java.util.ArrayList;

/**
 *
 * @author Thành Lùn PiPi
 */
public interface BilIn {
    public ArrayList<BillE> getAll();
    //public Car update(Car bv);
    public BillE addNew(BillE bv);
    public ArrayList<BillE> finByIDStaff(int id);
    public ArrayList<BillE> finByNameStaff(String name);
    public ArrayList<BillE> finByIDTypeStaff(int idTy);
}
