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
public class newStudent {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addProduct(int id, String fname, String  Grade, String add, String eml, int agg, String gnder, String btd, String cont){
   con =  DBconnection.conn();
        
        try {
            String sqlquery = "INSERT INTO student(studentId, studentName, age, email, gender, grade, birthday, address, contact) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sqlquery);
           
            pst.setInt(1, id);
            pst.setString(2, fname);
            pst.setInt(3, agg);
            pst.setString(4, eml);
            pst.setString(5, gnder);
            pst.setString(6, Grade);        
            pst.setString(7, btd);
            pst.setString(8, add);
            pst.setString(9, cont);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert SUCCESSFULY");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
}
}
    
}
