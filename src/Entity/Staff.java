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
public abstract class  Staff {
   private String _name;
   private String _nPhone;
   private String _email;
   private String _add; 
   private int _id;
   private int _sex;
   private int _age;
   public static float _hsL=2;
   public float Salary(){return 0;};

    public Staff(int _id, String _name, int _age,  int _sex, String _add, String _nPhone, String _email) {
        this._name = _name;
        this._nPhone = _nPhone;
        this._email = _email;
        this._add = _add;
        this._id = _id;
        this._sex = _sex;
        this._age = _age;
    }
    @Override
    public String toString() {
        return "Staff{" + "_name=" + _name + ", _nPhone=" + _nPhone + ", _email=" + _email + ", _add=" + _add + ", _id=" + _id + ", _sex=" + _sex + ", _age=" + _age + '}';
    }

    public Staff() {
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setnPhone(String _nPhone) {
        this._nPhone = _nPhone;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public void setAdd(String _add) {
        this._add = _add;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public void setSex(int _sex) {
        this._sex = _sex;
    }

    public void setAge(int _age) {
        this._age = _age;
    }

    public static void setHsL(float _hsL) {
        Staff._hsL = _hsL;
    }

    public String getName() {
        return _name;
    }

    public String getnPhone() {
        return _nPhone;
    }

    public String getEmail() {
        return _email;
    }

    public String getAdd() {
        return _add;
    }

    public int getId() {
        return _id;
    }

    public int getSex() {
        return _sex;
    }

    public int getAge() {
        return _age;
    }

   
   
}
