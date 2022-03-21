/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import entity.product;
import java.util.ArrayList;

/**
 *
 * @author HDC
 */
public class dao {
    Connection conn= null;
    PreparedStatement ps = null;
    ResultSet rs= null;
    
    public List<product> getAllProduct(){
        List<product> list = new ArrayList<>();
            String query = "select* from Product";
            try {
            conn = new DBContext().getConnection();//mo ket noi
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new product(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        return list;
    }
    
    public List<Category> getAllCategory(){
        List<Category> list = new ArrayList<>();
            String query = "select* from Category";
            try {
            conn = new DBContext().getConnection();//mo ket noi
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        return list;
    }
    
    public List<product> getProductByCID(String cid){
        List<product> list = new ArrayList<>();
            String query = "Select* from Product \n" +
"where cateID = ?";
            try {
            conn = new DBContext().getConnection();//mo ket noi
            ps = conn.prepareStatement(query);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new product(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6)));
            }
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        return list;
    }
    
    public product getProductByID(String pid){
    
            String query = "Select* from Product \n" +
"where id = ?";
            try {
            conn = new DBContext().getConnection();//mo ket noi
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while(rs.next()){
                return new product(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6));
            }
        } catch (Exception e) {
            System.out.print(e.toString());     
        }
        return null;
    }
    
    public Account login(String user, String pass){
        String query = "select* from Accounts\n" +
"where users =?\n" +
"and pass=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()){
                return new Account(rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4),
                rs.getInt(5));
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
        return null;
        
    }
    
    public void signup(String user, String pass){
        String query ="insert into Accounts\n" +
"values(0,?,?,0,0)";
        try {
            conn = new DBContext().getConnection();//mo ket noi
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
             ps.executeUpdate();
           
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    
    public static void main(String[] args) {
        dao dao= new dao();
        List<product>list =dao.getAllProduct();
        for(product o :list){
            System.out.println(o);
        }
    }
}
