/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author User
 */
public class delete2 {
     Connection con = null;
    PreparedStatement pst = null;
    
    public void delet(int teacherid){
        
        con = DBconnection.conn();
        
        try{
            String sqlquery = "DELETE FROM teacher WHERE teacher_id = '"+teacherid+"' ";
            pst = con.prepareStatement(sqlquery);
            pst.execute();
            JOptionPane.showMessageDialog(null, "DELETED");
        }catch (Exception e){
          //  JOptionPane.showMessageDialog(null, "DELETED");
        }
    }
}


