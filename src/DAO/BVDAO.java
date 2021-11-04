/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connected.Query;
import Entity.SecurityStaff;
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
public class BVDAO implements BVInterFace{

    
    @Override
    public ArrayList<SecurityStaff> getAll() {
        ArrayList<SecurityStaff> l = null;
        String sql = "select nv.ID, nv.Name, nv.Age, nv.Sex, nv.Adress, nv.NumberPhone, nv.Email, nv.PartTime from NhanVien nv where nv.IDType=4";
        //JOptionPane.showMessageDialog(null, sql);
        ResultSet rs = Query.getData(sql);
        l = new ArrayList<SecurityStaff>();
        try {
            while (rs.next()) {
                //JOptionPane.showMessageDialog(null, "có dl");
                SecurityStaff s = new SecurityStaff();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setSex(rs.getInt(4));
                s.setAdd(rs.getString(5));
                s.setnPhone(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setCaLam(rs.getString(8));
                l.add(s);
            }
        } catch (SQLException ex) {
            //Logger.getogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l; 
    }

    @Override
    public SecurityStaff update(SecurityStaff bv) {
        String sql = "update NhanVien set Name=N'" + bv.getName() + "', "
                + "Age=" + bv.getAge() + ", Sex=" + bv.getSex() + ", "
                + "Adress=N'" + bv.getAdd() + "', "
                + "NumberPhone='" + bv.getnPhone() + "' , "
                + "Email='" + bv.getEmail() + "', "
                + "PartTime='" + bv.getCaLam()+ "' "
                + "where NhanVien.ID="+ bv.getId() + "";
        //JOptionPane.showMessageDialog(null, sql);
        if (Query.Excute(sql) == 0) {
            return null;
        }
        return bv;
    }

    @Override
    public SecurityStaff addNew(SecurityStaff bv) {
        String sql = "insert into NhanVien (Name, Age, Sex, Adress, NumberPhone, Email,PartTime, IDType)  Values("
                + "N'" + bv.getName() + "'"
                + "," + bv.getAge() + ","
                + "" + bv.getSex() + ","
                + "N'" + bv.getAdd() + "',"
                + "'" + bv.getnPhone() + "',"
                + "'" + bv.getEmail() + "',"
                + "'" + bv.getCaLam()+ "',"
                + "4)";
                //JOptionPane.showMessageDialog(null, sql);
        if (Query.Excute(sql) == 0) {
            //JOptionPane.showMessageDialog(null, sql);
            return null;
        }
        return bv;
    }

    @Override
    public ArrayList<SecurityStaff> finByIDStaff(int id) {
        String sql = "select nv.ID, nv.Name, nv.Age, nv.Sex, nv.Adress, nv.NumberPhone, nv.Email, nv.PartTime from NhanVien nv where nv.IDType=4 and nv.ID=" + id + "";
        ResultSet rs = Query.getData(sql);
        ArrayList<SecurityStaff> l = null;
        l = new ArrayList<SecurityStaff>();
        try {
            while (rs.next()) {
                SecurityStaff s = new SecurityStaff();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setSex(rs.getInt(4));
                s.setAdd(rs.getString(5));
                s.setnPhone(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setCaLam(rs.getString(8));
                l.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    @Override
    public ArrayList<SecurityStaff> finByNameStaff(String name) {
        String sql = "select nv.ID, nv.Name, nv.Age, nv.Sex, nv.Adress, nv.NumberPhone, nv.Email, nv.PartTime from NhanVien nv where nv.IDType=4 and nv.Name like N'%" + name + "%'";
        ResultSet rs = Query.getData(sql);
        ArrayList<SecurityStaff> l = null;
        l = new ArrayList<SecurityStaff>();
        try {
            while (rs.next()) {
                SecurityStaff s = new SecurityStaff();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setSex(rs.getInt(4));
                s.setAdd(rs.getString(5));
                s.setnPhone(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setCaLam(rs.getString(8));
                l.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    @Override
    public ArrayList<SecurityStaff> finByIDTypeStaff(int idTy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
