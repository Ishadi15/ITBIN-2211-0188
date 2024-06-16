/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class newTeacher {
 Connection con = null;
    PreparedStatement pst = null;
    
    public void addProduct(int teacherid,String tname,String add,int age,String gnder,String cnt){
   con =  DBconnection.conn();
        
        try {
            String sqlquery = "INSERT INTO teacher(teacher_id, teacher_name, address, age, gender, contact) VALUES (?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sqlquery);
           
            pst.setInt(1, teacherid);
            pst.setString(2, tname);
            pst.setString(3, add);
            pst.setInt(4, age);
            pst.setString(5, gnder);
            pst.setString(6, cnt );
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert SUCCESSFULY");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
}
}
       
}
