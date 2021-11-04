/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.SecurityStaff;
import java.util.ArrayList;

/**
 *
 * @author Thành Lùn PiPi
 */
public interface BVInterFace {
    public ArrayList<SecurityStaff> getAll();
    public SecurityStaff update(SecurityStaff bv);
    public SecurityStaff addNew(SecurityStaff bv);
    public ArrayList<SecurityStaff> finByIDStaff(int id);
    public ArrayList<SecurityStaff> finByNameStaff(String name);
    public ArrayList<SecurityStaff> finByIDTypeStaff(int idTy);
}
