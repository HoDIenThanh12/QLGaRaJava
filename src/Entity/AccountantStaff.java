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
public class AccountantStaff extends Staff{
    private String _degree ;

    public AccountantStaff(int _id, String _name, String _nPhone, String _email, String _add, int _sex, int _age, String degree) {
        super(_id, _name, _age, _sex, _add, _nPhone, _email);
        this._degree=degree;
    }

    public String getDegree() {
        return _degree;
    }

    public void setDegree(String _degree) {
        this._degree = _degree;
    }

    public AccountantStaff() {
    }

   @Override
    public float Salary() {
        return 300000* Staff._hsL +500000;
    }
    
    
}
