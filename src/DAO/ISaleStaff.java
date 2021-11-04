package DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entity.SaleStaff;
import java.util.ArrayList;

/**
 *
 * @author Cong_Ga
 */
public interface ISaleStaff{
    public ArrayList<SaleStaff> getAll();
    public SaleStaff update(SaleStaff saleStaff);
    public SaleStaff addNew(SaleStaff saleStaff);
    public ArrayList<SaleStaff> finByIDStaff(int id);
    public ArrayList<SaleStaff> finByNameStaff(String name);
    public ArrayList<SaleStaff> finByIDTypeStaff(int idTy);
    
}
