/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connected;

import static Connected.DB.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Cong_Ga
 */
public class Query {

    public static ResultSet getData(String sql) {
        ResultSet rs = null;
        try {
            Connection cnn = DB.getConnection();
            if (cnn == null) {
                JOptionPane.showMessageDialog(null, "kết nối thất bại");
            } else {
                PreparedStatement ps = cnn.prepareStatement(sql);
                rs = ps.executeQuery();
            }

        } catch (Exception e) {
        }

        return rs;
    }

    public static int Update(String sql) {
        int Rs = 0;
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            Rs = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        return Rs;
    }
public static int Delete(int id) {
        int Rs = 0;
        String sql="delete from NhanVien where NhanVien.ID="+id+"";
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            Rs = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        return Rs;
    }
public static int DeleteCar(int id) {
        int Rs = 0;
        String sql="delete from Cars where Cars.ID="+id+"";
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            Rs = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        return Rs;
    }
public static int Excute(String sql) {
        int Rs = 0;
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            Rs = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        return Rs;
    }
}
