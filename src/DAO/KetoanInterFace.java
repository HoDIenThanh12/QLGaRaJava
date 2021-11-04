/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entity.AccountantStaff;
import java.util.ArrayList;

/**
 *
 * @author Thành Lùn PiPi
 */
public interface KetoanInterFace {
    public ArrayList<AccountantStaff> getAll();
    public AccountantStaff update(AccountantStaff ktoan);
    public AccountantStaff addNew(AccountantStaff ktoan);
    public ArrayList<AccountantStaff> finByIDStaff(int id);
    public ArrayList<AccountantStaff> finByNameStaff(String name);
    public ArrayList<AccountantStaff> finByIDTypeStaff(int idTy);
}
