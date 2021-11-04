/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connected;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cong_Ga
 */
public class DB {
 public static Connection getConnection() throws SQLException{
         Connection connection =null;
        try {
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String url="jdbc:sqlserver://THANH-LUN-PIPI\\SQLEXPRESS:1433;databaseName=QLGara";
            String name ="sa";
            String pas="123";
            connection=DriverManager.getConnection(url,name,pas);
            if(connection!=null){
                //JOptionPane.showMessageDialog(null, "thanhf công");
                System.out.println("thanhfc oong");
            }
        } catch (Exception ex) {
            
            ex.printStackTrace();
        }
        return connection;         
    }
    
public static ResultSet getData(String sql) {
        ResultSet rs=null;
        try {
            Connection cnn = DB.getConnection();
            if(cnn==null)
                JOptionPane.showMessageDialog(null,"kết nối thất bại");
            else{
                PreparedStatement ps = cnn.prepareStatement(sql);
                rs = ps.executeQuery();
            }
            
        } catch (Exception e) {
        }

        return rs;
    }

   

    public static int CheckRow(String sql) {
        int a = 0;
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                a = 1;
            }
        } catch (SQLException ex) {
        }
        return a;
    }

    public static int LayID(String sql) {
        int id = -1;
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
            return id;
        } catch (SQLException ex) {
        }
        return id;
    }
  public static void close(Connection con)
    {
        if(con!=null){
            try{
                con.close();               
            }
            catch(SQLException ex){
                
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws SQLException {
        Connection n =getConnection();
        //JOptionPane.showMessageDialog(null, "thành công");
    }
}
