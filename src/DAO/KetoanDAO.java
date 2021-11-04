/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connected.Query;
import Entity.AccountantStaff;
import java.util.ArrayList;


import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Thành Lùn PiPi
 */
public class KetoanDAO implements KetoanInterFace{

    @Override
    public ArrayList<AccountantStaff> getAll() {
        ArrayList<AccountantStaff> l = null;
        String sql = "select nv.ID, nv.Name, nv.Age, nv.Sex, nv.Adress, nv.NumberPhone, nv.Email, nv.Degree from NhanVien nv where nv.IDType=1";
        ResultSet rs = Query.getData(sql);
        l = new ArrayList<AccountantStaff>();
        try {
            while (rs.next()) {
                AccountantStaff s = new AccountantStaff();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setSex(rs.getInt(4));
                s.setAdd(rs.getString(5));
                s.setnPhone(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setDegree(rs.getString(8));
                l.add(s);
            }
        } catch (SQLException ex) {
            //Logger.getogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    @Override
    public AccountantStaff update(AccountantStaff ktoan) {
        String sql = "update NhanVien set Name=N'" + ktoan.getName() + "', "
                + "Age=" + ktoan.getAge() + ", Sex=" + ktoan.getSex() + ", "
                + "Adress=N'" + ktoan.getAdd() + "', "
                + "NumberPhone='" + ktoan.getnPhone() + "' , "
                + "Email='" + ktoan.getEmail() + "', "
                + "Degree=N'" + ktoan.getDegree()+ "' "
                + "where NhanVien.ID="+ ktoan.getId() + "";
        //JOptionPane.showMessageDialog(null, sql);
        if (Query.Excute(sql) == 0) {
            return null;
        }
        return ktoan;
    }

    @Override
    public AccountantStaff addNew(AccountantStaff ktoan) {
        String sql = "insert into NhanVien (Name, Age, Sex, Adress, NumberPhone, Email, Degree, IDType)  Values("
                + "N'" + ktoan.getName() + "',"
                + "" + ktoan.getAge() + ","
                + "" + ktoan.getSex() + ","
                + "N'" + ktoan.getAdd() + "',"
                + "'" + ktoan.getnPhone() + "',"
                + "'" + ktoan.getEmail() + "',"
                + "N'" + ktoan.getDegree()+ "',"
                + "1)";
                //JOptionPane.showMessageDialog(null, sql);
        if (Query.Excute(sql) == 0) {
            //JOptionPane.showMessageDialog(null, sql);
            return null;
        }
        return ktoan;
    }

    @Override
    public ArrayList<AccountantStaff> finByIDStaff(int id) {
        String sql = "select nv.ID, nv.Name, nv.Age, nv.Sex, nv.Adress, nv.NumberPhone, nv.Email, nv.Degree from NhanVien nv where nv.IDType=1 and nv.ID=" + id + "";
        ResultSet rs = Query.getData(sql);
        ArrayList<AccountantStaff> l = null;
        l = new ArrayList<AccountantStaff>();
        try {
            while (rs.next()) {
                AccountantStaff s = new AccountantStaff();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setSex(rs.getInt(4));
                s.setAdd(rs.getString(5));
                s.setnPhone(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setDegree(rs.getString(8));
                l.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    @Override
    public ArrayList<AccountantStaff> finByNameStaff(String name) {
        String sql = "select nv.ID, nv.Name, nv.Age, nv.Sex, nv.Adress, nv.NumberPhone, nv.Email, nv.Degree from NhanVien nv where nv.IDType=1 and nv.Name like N'%" + name + "%'";
        ResultSet rs = Query.getData(sql);
        ArrayList<AccountantStaff> l = null;
        l = new ArrayList<AccountantStaff>();
        try {
            while (rs.next()) {
                AccountantStaff s = new AccountantStaff();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setSex(rs.getInt(4));
                s.setAdd(rs.getString(5));
                s.setnPhone(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setDegree(rs.getString(8));
                l.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    @Override
    public ArrayList<AccountantStaff> finByIDTypeStaff(int idTy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
