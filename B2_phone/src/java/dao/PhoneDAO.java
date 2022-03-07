/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBcontext;
import entity.Phone;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HDC
 */
public class PhoneDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<Phone> getAllPhone(){
        List<Phone> list = new ArrayList<>();
        String query = "select * from Phone";
        
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Phone(rs.getInt(1),
                        rs.getString(2), 
                        (int) rs.getFloat(3),
                        rs.getDate(4),
                        rs.getString(5)));
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public Phone getPhoneById(String id){
        
        String query = "select * from Phone\n" +
"where PhoneID = ?";
        
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Phone(rs.getInt(1),
                        rs.getString(2), 
                        (int) rs.getFloat(3),
                        rs.getDate(4),
                        rs.getString(5));
                
            }
        } catch (Exception e) {
        }
        return null;
    }
    
     public void insertPhone(String name, float price, Date dateEX, String Des){
        String query = "insert into\n" +
                       "Phone\n" +
                       "values(?,?,?,?)";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setFloat(2, price);
            ps.setDate(3, (java.sql.Date) dateEX);
            ps.setString(4, Des);
            ps.executeUpdate();
             
        } catch (Exception e) {
        }
    }
     
     public void updatePhone(int id, String name, float price, Date dateEX, String Des){
        String query = "update Phone\n" +
                       "set [name]=?,\n" +
                       "	[price]=?,\n" +
                       "	[dateEX]=?,\n" +
                       "	[Des]=?\n" +
                       "	where PhoneID=?";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setFloat(2, price);
            ps.setDate(3, (java.sql.Date) dateEX);
            ps.setString(4, Des);
            ps.setInt(5, id);
            ps.executeUpdate();
                        

        } catch (Exception e) {
        }
    }
     
     public void delPhone(int id){
        String query ="delete from Phone\n" +
                      "where PhoneID=?";
        try {
            conn = new DBcontext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
