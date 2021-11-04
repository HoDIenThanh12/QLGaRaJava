/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connected.Query;
import Entity.EnginerrStaff;

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
public class KythuatDAO implements KythuatInterFace{

    public ArrayList<String> getBoPhan()  {
        String sql = "select * from PartCode";
        ResultSet rs = Query.getData(sql);
        ArrayList<String> l=new ArrayList<>();
        try{
            while(rs.next()){
                String a=rs.getNString(2);
                l.add(a);
            }
        }
        catch (SQLException ex) {
            //Logger.getogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return l;
    }
    public int getIDBophan(String i){
        String sql="select p.ID from PartCode p where p.Name=N'"+i+"'";
        ResultSet rs = Query.getData(sql);
        int IDbp=-1;
        try {
            while(rs.next()){
                IDbp=rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return IDbp-1;
    }
    public String getTenBophan(int i){
        String sql="select p.Name from PartCode p where p.ID="+i+"";
        ResultSet rs = Query.getData(sql);
        String Namebp="";
        try {
            while(rs.next()){
                Namebp=rs.getString(1);
            }
        } catch (Exception e) {
        }
        return Namebp;
    }
    @Override
    public ArrayList<EnginerrStaff> getAll() {
       ArrayList<EnginerrStaff> l = null;
        String sql = "select nv.ID, nv.Name, nv.Age, nv.Sex, nv.Adress, nv.NumberPhone, nv.Email, nv.IDPassCode from NhanVien nv where nv.IDType=3";
        ResultSet rs = Query.getData(sql);
        l = new ArrayList<EnginerrStaff>();
        try {
            while (rs.next()) {
                EnginerrStaff s = new EnginerrStaff();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setSex(rs.getInt(4));
                s.setAdd(rs.getString(5));
                s.setnPhone(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setPartCode(rs.getInt(8));
                l.add(s);
            }
        } catch (SQLException ex) {
            //Logger.getogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;     
    }

    @Override
    public EnginerrStaff update(EnginerrStaff Kythuat) {
        String sql = "update NhanVien set Name=N'" + Kythuat.getName() + "', "
                + "Age=" + Kythuat.getAge() + ", Sex=" + Kythuat.getSex() + ", "
                + "Adress=N'" + Kythuat.getAdd() + "', "
                + "NumberPhone='" + Kythuat.getnPhone() + "' , "
                + "Email='" + Kythuat.getEmail() + "', "
                + "IDPassCode=" + Kythuat.getPartCode() + " "
                + "where NhanVien.ID="+ Kythuat.getId() + "";
        //JOptionPane.showMessageDialog(null, sql);
        if (Query.Excute(sql) == 0) {
            return null;
        }
        return Kythuat;
    }

    @Override
    public EnginerrStaff addNew(EnginerrStaff s) {
        String sql = "insert into NhanVien (Name, Age, Sex, Adress, NumberPhone, Email,IDPassCode, IDType)  Values("
                + "N'" + s.getName() + "'"
                + "," + s.getAge() + ","
                + "" + s.getSex() + ","
                + "N'" + s.getAdd() + "',"
                + "'" + s.getnPhone() + "',"
                + "'" + s.getEmail() + "',"
                + "" + s.getPartCode() + ","
                + "3)";
                //JOptionPane.showMessageDialog(null, sql);
        if (Query.Excute(sql) == 0) {
            //JOptionPane.showMessageDialog(null, sql);
            return null;
        }
        return s;
    }

    @Override
    public ArrayList<EnginerrStaff> finByIDStaff(int id) {
        String sql = "select nv.ID, nv.Name, nv.Age, nv.Sex, nv.Adress, nv.NumberPhone, nv.Email, nv.IDPassCode from NhanVien nv where nv.IDType=3 and nv.ID=" + id + "";
        ResultSet rs = Query.getData(sql);
        ArrayList<EnginerrStaff> l = null;
        l = new ArrayList<EnginerrStaff>();
        try {
            while (rs.next()) {
                EnginerrStaff s = new EnginerrStaff();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setSex(rs.getInt(4));
                s.setAdd(rs.getString(5));
                s.setnPhone(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setPartCode(rs.getInt(8));
                l.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    @Override
    public ArrayList<EnginerrStaff> finByNameStaff(String name) {
        String sql = "select nv.ID, nv.Name, nv.Age, nv.Sex, nv.Adress, nv.NumberPhone, nv.Email, nv.Degree from NhanVien nv where nv.IDType=4 and nv.Name like N'%" + name + "%'";
        ResultSet rs = Query.getData(sql);
        ArrayList<EnginerrStaff> l = null;
        l = new ArrayList<EnginerrStaff>();
        try {
            while (rs.next()) {
                EnginerrStaff s = new EnginerrStaff();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));
                s.setSex(rs.getInt(4));
                s.setAdd(rs.getString(5));
                s.setnPhone(rs.getString(6));
                s.setEmail(rs.getString(7));
                s.setPartCode(rs.getInt(8));
                l.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    @Override
    public ArrayList<EnginerrStaff> finByIDTypeStaff(int idTy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
