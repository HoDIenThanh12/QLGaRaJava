/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Cong_Ga
 */
public class SecurityStaff extends Staff{
    private String _caLam;

    public SecurityStaff( int _id, String _name, String _nPhone, String _email, String _add, int _sex, int _age, String _caLam) {
        super(_id, _name, _age, _sex, _add, _nPhone, _email);
        this._caLam = _caLam;
    }

    public SecurityStaff() {
    }

    public String getCaLam() {
        return _caLam;
    }

    public void setCaLam(String _caLam) {
        this._caLam = _caLam;
    }

   @Override
    public float Salary() {
        return 250000* Staff._hsL ;
    }
    
    
}
