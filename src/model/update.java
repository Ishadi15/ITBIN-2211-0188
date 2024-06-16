/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class update {
    Connection con = null;
    PreparedStatement pst = null;
    
    public void update(int id, String email, String address){
        
        con = DBconnection.conn();
        
        try {
            String sqlquery = "UPDATE student SET email = '"+email+"', address = '"+address+"' WHERE studentId = '"+id+"' ";
            pst = con.prepareStatement(sqlquery);
            pst.execute();
            JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULY");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "UPDATE UNSUCCESSFULY");
        }
    }
}
