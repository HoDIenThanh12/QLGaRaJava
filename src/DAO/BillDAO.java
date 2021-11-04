/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connected.Query;
import Entity.BillE;
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
public class BillDAO implements BilIn{

    public ArrayList<String> getTenxe(){
        String sql="select * from Cars";
        ResultSet rs = Query.getData(sql);
        ArrayList<String> l = null;
        l = new ArrayList<String>();
        try {
            while (rs.next()) {
                l.add(rs.getString(2));
            }
        } catch (Exception e) {
        }
        return  l;
    }
    public double getGiaban(int i){
        String sql="select Cars.Price from Cars where Cars.ID="+i+"";
        ResultSet rs = Query.getData(sql);
        double gia=0;
        try {
            while (rs.next()) {
                gia=Double.parseDouble( rs.getString(1) );
            }
        } catch (Exception e) {
        }
        return  gia;
    }
    @Override
    public ArrayList<BillE> getAll() {
        String sql="select b.ID, b.IDCar,c.Name, b.NameCustomer, c.Price, b.Date from Bill b, Cars c where b.IDCar=c.ID";
        ResultSet rs = Query.getData(sql);
        ArrayList<BillE> l = null;
        l = new ArrayList<BillE>();
        int i=0;
        try {
            while (rs.next()) {
                //JOptionPane.showMessageDialog(null, i);
                //JOptionPane.showMessageDialog(null, "có dl");
                BillE s = new BillE();
                s.setId(rs.getInt(1));
                s.setIdC(rs.getInt(2));
                s.setNameC(rs.getString(3));
                s.setNamKH(rs.getString(4));
                s.setGiaM(rs.getDouble(5));
                s.setNgmua(rs.getString(6));
                l.add(s);
            }
        } catch (SQLException ex) {
            //Logger.getogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    @Override
    public BillE addNew(BillE bv) {
        String sql = "insert into Bill(IDCar, NameCustomer,Date)  Values("
                + "N'" + bv.getIdC() + "'"
                + ",N'" + bv.getNamKH()+ "',"
                + "N'" + bv.getNgmua()+"')";
                //JOptionPane.showMessageDialog(null, sql);
        if (Query.Excute(sql) == 0) {
            //JOptionPane.showMessageDialog(null, sql);
            return null;
        }
        return bv;
    }

    @Override
    public ArrayList<BillE> finByIDStaff(int id) {
        String sql = "select b.ID, b.IDCar,c.Name, b.NameCustomer, c.Price, b.Date from Bill b, Cars c where b.IDCar=c.ID and b.ID=" + id + "";
        ResultSet rs = Query.getData(sql);
        ArrayList<BillE> l = null;
        l = new ArrayList<BillE>();
        try {
            while (rs.next()) {
                BillE s = new BillE();
                s.setId(rs.getInt(1));
                s.setIdC(rs.getInt(2));
                s.setNameC(rs.getString(3));
                s.setNamKH(rs.getString(4));
                s.setGiaM(rs.getDouble(5));
                s.setNgmua(rs.getString(6));
                l.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }
    @Override
    public ArrayList<BillE> finByNameStaff(String name) {
        String sql = "select b.ID, b.IDCar,c.Name, b.NameCustomer, c.Price, b.Date from Bill b, Cars c where b.IDCar=c.ID and b.NameCustomer like N'%" + name + "%' ";
        ResultSet rs = Query.getData(sql);
        ArrayList<BillE> l = null;
        l = new ArrayList<BillE>();
        try {
            while (rs.next()) {
                BillE s = new BillE();
                s.setId(rs.getInt(1));
                s.setIdC(rs.getInt(2));
                s.setNameC(rs.getString(3));
                s.setNamKH(rs.getString(4));
                s.setGiaM(rs.getDouble(5));
                s.setNgmua(rs.getString(6));
                l.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l; 
    }

    @Override
    public ArrayList<BillE> finByIDTypeStaff(int idTy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
