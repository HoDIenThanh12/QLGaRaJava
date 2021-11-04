/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Entity.EnginerrStaff;
import Entity.SaleStaff;
import java.util.ArrayList;

/**
 *
 * @author Thành Lùn PiPi
 */
public interface IEnginerrStaff {
    public ArrayList<EnginerrStaff> getAll();
    public ArrayList<EnginerrStaff> update(SaleStaff saleStaff);
    public ArrayList<EnginerrStaff> addNew(SaleStaff saleStaff);
    public ArrayList<EnginerrStaff> finByIDStaff(int id);
    public ArrayList<EnginerrStaff> finByNameStaff(String name);
    public ArrayList<EnginerrStaff> finByIDTypeStaff(int idTy);

    
}
