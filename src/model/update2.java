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
public class update2 {
    Connection con = null;
    PreparedStatement pst = null;
    
    public void update(int id, String address, String contact){
        
        con = DBconnection.conn();
        
        try {
            String sqlquery = "UPDATE teacher SET address = '"+address+"', contact = '"+contact+"' WHERE teacher_id  = '"+id+"' ";
            pst = con.prepareStatement(sqlquery);
            pst.execute();
            JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULY");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "UPDATE UNSUCCESSFULY");
        }
    }
}
