/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connected.DB;
import Connected.Query;
import Entity.SaleStaff;
import Entity.Staff;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class SaleStaffDAO implements ISaleStaff {


    @Override
    public ArrayList<SaleStaff> getAll() {
        ArrayList<SaleStaff> l = null;
        String sql = "select nv.ID, nv.Name, nv.Age, nv.Sex, nv.Adress, nv.NumberPhone, nv.Email, nv.language from NhanVien nv where nv.IDType=2";
        ResultSet rs = Query.getData(sql);
        l = new ArrayList<SaleStaff>();
        try {
            while (rs.next()) {
                SaleStaff s = new SaleStaff();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setSex(rs.getInt(4));
                s.setAdd(rs.getString(5));
                s.setnPhone(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setLanguage(rs.getInt(8));
                l.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    @Override
    public SaleStaff update(SaleStaff s) {
        String sql = "update NhanVien set Name=N'" + s.getName() + "', "
                + "Age=" + s.getAge() + ", Sex=" + s.getSex() + ", "
                + "Adress=N'" + s.getAdd() + "', "
                + "NumberPhone='" + s.getnPhone() + "' , "
                + "Email='" + s.getEmail() + "', "
                + "language=" + s.getLanguage() + " "
                + "where NhanVien.ID="+ s.getId() + "";
        //JOptionPane.showMessageDialog(null, sql);
        if (Query.Excute(sql) == 0) {
            return null;
        }
        return s;
    }

    @Override
    public SaleStaff addNew(SaleStaff s) {
        String sql = "insert into NhanVien (Name, Age, Sex, Adress, NumberPhone, Email, language, IDType)  Values("
                + "N'" + s.getName() + "'"
                + "," + s.getAge() + ","
                + "" + s.getSex() + ","
                + "'" + s.getAdd() + "',"
                + "'" + s.getnPhone() + "',"
                + "'" + s.getEmail() + "',"
                + "" + s.getLanguage() + ","
                + "2)";
        
        if (Query.Excute(sql) == 0) {
            //JOptionPane.showMessageDialog(null, sql);
            return null;
        }
        return s;
    }

    @Override
    public ArrayList<SaleStaff> finByIDStaff(int id) {
        String sql = "select nv.ID, nv.Name, nv.Age, nv.Sex, nv.Adress, nv.NumberPhone, nv.Email, nv.language from NhanVien nv where nv.IDType=2 and nv.ID=" + id + "";
        ResultSet rs = Query.getData(sql);
        ArrayList<SaleStaff> l = null;
        l = new ArrayList<SaleStaff>();
        try {
            while (rs.next()) {
                SaleStaff s = new SaleStaff();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setSex(rs.getInt(4));
                s.setAdd(rs.getString(5));
                s.setnPhone(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setLanguage(rs.getInt(8));
                l.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    @Override
    public ArrayList<SaleStaff> finByNameStaff(String name) {
        String sql = "select nv.ID, nv.Name, nv.Age, nv.Sex, nv.Adress, nv.NumberPhone, nv.Email, nv.language from NhanVien nv where nv.IDType=2 and nv.Name like N'%" + name + "%'";
        ResultSet rs = Query.getData(sql);
        ArrayList<SaleStaff> l = null;
        l = new ArrayList<SaleStaff>();
        try {
            while (rs.next()) {
                SaleStaff s = new SaleStaff();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setSex(rs.getInt(4));
                s.setAdd(rs.getString(5));
                s.setnPhone(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setLanguage(rs.getInt(8));
                l.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    @Override
    public ArrayList<SaleStaff> finByIDTypeStaff(int idTy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
