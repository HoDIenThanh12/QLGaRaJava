/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author Cong_Ga
 */
public class EnginerrStaff extends Staff  {
    private int _partCode;

    public EnginerrStaff(int _id, String _name, String _nPhone, String _email, String _add, int _sex, int _age, int partCode) {
        super(_id, _name, _age, _sex, _add, _nPhone, _email);
        this._partCode=partCode;
    }

    public int getPartCode() {
        return _partCode;
    }

    public void setPartCode(int _partCode) {
        this._partCode = _partCode;
    }

    public EnginerrStaff() {
    }

    @Override
    public float Salary() {
        return 300000* Staff._hsL +200000;
    }
    
  
}
