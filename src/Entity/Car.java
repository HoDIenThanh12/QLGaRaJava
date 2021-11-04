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
public class Car {
    private  int _id;
    private  String _name;
    private String _manufacturer;
    private  int _nSeats;
    private double _priceBuy;
    private double _price;
    private int _yearManufacturer;
    private int _warrantyPeriod;
    private String _status;
    private String _dateBuy;

    public Car(int _id, String _name, String _manufacturer, int _nSeats, double _priceBuy, double _price, int _yearManufacturer, int _warrantyPeriod, String _status, String _dateBuy) {
        this._id = _id;
        this._name = _name;
        this._manufacturer = _manufacturer;
        this._nSeats = _nSeats;
        this._priceBuy = _priceBuy;
        this._price = _price;
        this._yearManufacturer = _yearManufacturer;
        this._warrantyPeriod = _warrantyPeriod;
        this._status = _status;
        this._dateBuy = _dateBuy;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" + "_id=" + _id + ", _name=" + _name + ", _manufacturer=" + _manufacturer + ", _nSeats=" + _nSeats + ", _priceBuy=" + _priceBuy + ", _price=" + _price + ", _yearManufacturer=" + _yearManufacturer + ", _warrantyPeriod=" + _warrantyPeriod + ", _status=" + _status + ", _dateBuy=" + _dateBuy + '}';
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getManufacturer() {
        return _manufacturer;
    }

    public void setManufacturer(String _manufacturer) {
        this._manufacturer = _manufacturer;
    }

    public int getnSeats() {
        return _nSeats;
    }

    public void setnSeats(int _nSeats) {
        this._nSeats = _nSeats;
    }

    public double getPriceBuy() {
        return _priceBuy;
    }

    public void setPriceBuy(double _priceBuy) {
        this._priceBuy = _priceBuy;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double _price) {
        this._price = _price;
    }

    public int getYearManufacturer() {
        return _yearManufacturer;
    }

    public void setYearManufacturer(int _yearManufacturer) {
        this._yearManufacturer = _yearManufacturer;
    }

    public int getWarrantyPeriod() {
        return _warrantyPeriod;
    }

    public void setWarrantyPeriod(int _warrantyPeriod) {
        this._warrantyPeriod = _warrantyPeriod;
    }

    public String getStatus() {
        return _status;
    }

    public void setStatus(String _status) {
        this._status = _status;
    }

    public String getDateBuy() {
        return _dateBuy;
    }

    public void setDateBuy(String _dateBuy) {
        this._dateBuy = _dateBuy;
    }
    
    
}
