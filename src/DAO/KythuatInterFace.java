/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.EnginerrStaff;
import java.util.ArrayList;

/**
 *
 * @author Thành Lùn PiPi
 */
public interface KythuatInterFace {
    public ArrayList<EnginerrStaff> getAll();
    public EnginerrStaff update(EnginerrStaff Kythuat);
    public EnginerrStaff addNew(EnginerrStaff Kythuat);
    public ArrayList<EnginerrStaff> finByIDStaff(int id);
    public ArrayList<EnginerrStaff> finByNameStaff(String name);
    public ArrayList<EnginerrStaff> finByIDTypeStaff(int idTy);
}
