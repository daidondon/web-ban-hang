/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HDC
 */
public class listphone {
    private int id;
    private String name;
    private float price;
    private String dateEx;       
    private String Des;
    
    public listphone(){}

    public listphone(int id, String name, float price, String dateEx, String Des) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.dateEx = dateEx;
        this.Des = Des;
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

    public String getDateEx() {
        return dateEx;
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

    public void setDateEx(String dateEx) {
        this.dateEx = dateEx;
    }

    public void setDes(String Des) {
        this.Des = Des;
    }
    
    
            
            
}
