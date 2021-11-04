/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Connected.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List; 
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;
public class SaleStaff extends Staff {  
    private int _language;

    public SaleStaff(int _id, String _name, int _age,  int _sex, String _add, String _nPhone, String _email, int language) {
        super(_id, _name, _age, _sex, _add, _nPhone, _email);
        this._language=language;
    }
    public int getLanguage() {
        return _language;
    }

    public void setLanguage(int _language) {
        this._language = _language;
    }

    public SaleStaff(){};

    @Override
    public float Salary() {
        return 290000* Staff._hsL +500000;
    }
    
    
}
