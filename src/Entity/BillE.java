/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Thành Lùn PiPi
 */
public class BillE {
    private int _id;
    private int _idC;
    private String _nameC;
    private String _namKH;
    private double _giaM;
    private String _ngmua;

    public BillE() {
    }

    public BillE(int _id, int _idC, String _nameC, String _namKH, double _giaM, String _ngmua) {
        this._id = _id;
        this._idC = _idC;
        this._nameC = _nameC;
        this._namKH = _namKH;
        this._giaM = _giaM;
        this._ngmua = _ngmua;
    }

    @Override
    public String toString() {
        return "BillE{" + "_id=" + _id + ", _idC=" + _idC + ", _nameC=" + _nameC + ", _namKH=" + _namKH + ", _giaM=" + _giaM + ", _ngmua=" + _ngmua + '}';
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public int getIdC() {
        return _idC;
    }

    public void setIdC(int _idC) {
        this._idC = _idC;
    }

    public String getNameC() {
        return _nameC;
    }

    public void setNameC(String _nameC) {
        this._nameC = _nameC;
    }

    public String getNamKH() {
        return _namKH;
    }

    public void setNamKH(String _namKH) {
        this._namKH = _namKH;
    }

    public double getGiaM() {
        return _giaM;
    }

    public void setGiaM(double _giaM) {
        this._giaM = _giaM;
    }

    public String getNgmua() {
        return _ngmua;
    }

    public void setNgmua(String _ngmua) {
        this._ngmua = _ngmua;
    }
    
}
