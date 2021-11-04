/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connected.Query;
import Entity.Car;
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
public class CarDAO implements CarInterFace{

    
    @Override
    public ArrayList<Car> getAll() {
        String sql = "select c.ID, c.Name, c.Manufacturer, c.NumberSeat, c.PriceBuy,c.Price,c.YearNumberSeat,c.WarrantyPeriod,c.Status,c.DateBuy from Cars c";
        ResultSet rs = Query.getData(sql);
        ArrayList<Car> l = null;
        l = new ArrayList<Car>();
        int i=0;
        try {
            while (rs.next()) {
                //JOptionPane.showMessageDialog(null, i);
                //JOptionPane.showMessageDialog(null, "có dl");
                Car s = new Car();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setManufacturer(rs.getString(3));
                s.setnSeats(rs.getInt(4));
                s.setPriceBuy(rs.getDouble(5));
                s.setPrice(rs.getDouble(6));
                s.setYearManufacturer(rs.getInt(7));
                s.setWarrantyPeriod(rs.getInt(8));
                s.setStatus(rs.getString(9));
                s.setDateBuy(rs.getString(10));
                l.add(s);
            }
        } catch (SQLException ex) {
            //Logger.getogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }

    @Override
    public Car update(Car bv) {
        String sql = "update Cars set Name=N'" + bv.getName() + "', "
                + "Manufacturer=N'" + bv.getManufacturer() + "', NumberSeat=" + bv.getnSeats() + ", "
                + "PriceBuy=" + bv.getPriceBuy() + ", "
                + "Price=" + bv.getPrice() + ", "
                + "YearNumberSeat=" + bv.getYearManufacturer() + ", "
                + "WarrantyPeriod=" + bv.getWarrantyPeriod() + ", "
                + "Status=N'" + bv.getStatus() + "', "
                + "DateBuy=N'" + bv.getDateBuy()+ "' "
                + "where Cars.ID="+ bv.getId() + "";
        //JOptionPane.showMessageDialog(null, sql);
        if (Query.Excute(sql) == 0) {
            return null;
        }
        return bv;
    }

    @Override
    public Car addNew(Car bv) {
       String sql = "insert into Cars (Name, Manufacturer, NumberSeat, PriceBuy, Price, YearNumberSeat, WarrantyPeriod, Status, DateBuy)  Values("
                + "N'" + bv.getName() + "'"
                + ",N'" + bv.getManufacturer()+ "',"
                + "" + bv.getnSeats()+ ","
                + "" + bv.getPriceBuy()+ ","
                + "" + bv.getPrice()+ ","
                + "" + bv.getYearManufacturer()+ ","
                + "" + bv.getWarrantyPeriod()+ ","
                + "'" + bv.getStatus()+"',"
                + "'" + bv.getDateBuy()+"')";
                //JOptionPane.showMessageDialog(null, sql);
        if (Query.Excute(sql) == 0) {
            //JOptionPane.showMessageDialog(null, sql);
            return null;
        }
        return bv;
    }

    @Override
    public ArrayList<Car> finByIDStaff(int id) {
        String sql = "select * from Cars where Cars.ID=" + id + "";
        ResultSet rs = Query.getData(sql);
        ArrayList<Car> l = null;
        l = new ArrayList<Car>();
        try {
            while (rs.next()) {
                Car s = new Car();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setManufacturer(rs.getString(3));
                s.setnSeats(rs.getInt(4));
                s.setPriceBuy(rs.getFloat(5));
                s.setPrice(rs.getFloat(6));
                s.setYearManufacturer(rs.getInt(7));
                s.setWarrantyPeriod(rs.getInt(8));
                s.setStatus(rs.getString(9));
                s.setDateBuy(rs.getString(10));
                l.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;    
    }

    @Override
    public ArrayList<Car> finByNameStaff(String name) {
        String sql = " select * from Cars where Cars.Name like N'%" + name + "%' ";
        ResultSet rs = Query.getData(sql);
        ArrayList<Car> l = null;
        l = new ArrayList<Car>();
        try {
            while (rs.next()) {
                Car s = new Car();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setManufacturer(rs.getString(3));
                s.setnSeats(rs.getInt(4));
                s.setPriceBuy(rs.getFloat(5));
                s.setPrice(rs.getFloat(6));
                s.setYearManufacturer(rs.getInt(7));
                s.setWarrantyPeriod(rs.getInt(8));
                s.setStatus(rs.getString(9));
                s.setDateBuy(rs.getString(10));
                l.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SaleStaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;   
    }

    @Override
    public ArrayList<Car> finByIDTypeStaff(int idTy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
