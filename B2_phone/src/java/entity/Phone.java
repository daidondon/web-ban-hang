/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author HDC
 */
public class Phone {
    private int id;
    private String name;
    private float price;
    private Date dateEX;
    private String Des;  
    
    public Phone(){}

    public Phone(int id, String name, float price, Date dateEX, String Des) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.dateEX = dateEX;
        this.Des = Des;
    }

    public Phone(int aInt, String string, int aInt0, java.sql.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Date getDateEX() {
        return dateEX;
    }

    public String getDes() {
        return Des;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDateEX(Date dateEX) {
        this.dateEX = dateEX;
    }

    public void setDes(String Des) {
        this.Des = Des;
    }

    @Override
    public String toString() {
        return "Phone{" + "id=" + id + ", name=" + name + ", price=" + price + ", dateEX=" + dateEX + ", Des=" + Des + '}';
    }
    
    
}
