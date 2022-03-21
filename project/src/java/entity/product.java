/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author HDC
 */
public class product {
    private int id;
    private String name;
    private double price;
    private String image;
    private int sl;
    private int cateID;

    public product() {
    }

    public product(int id, String name, double price, String image, int sl, int cateID) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.sl = sl;
        this.cateID = cateID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public int getSl() {
        return sl;
    }

    public int getCateID() {
        return cateID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    @Override
    public String toString() {
        return "product{" + "id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + ", sl=" + sl + ", cateID=" + cateID + '}';
    }

    
}
