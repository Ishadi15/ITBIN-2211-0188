/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DBconnection {
  //  static Connection conn;
  //  static Statement stat = null;
    
    public static Connection conn(){
        Connection conn = null;
        try {
            
            
          Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb", "root", "");
   
            
          // String url = "jdbc:mysql://localhost:3306/schooldb";
         //  conn = DriverManager.getConnection(url, "root", "");        
         //  stat = conn.createStatement();
           
        } catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
    
    
    
  //  public static void closeCon() throws SQLException {
  //      conn.close();
        
  //  }  
}
