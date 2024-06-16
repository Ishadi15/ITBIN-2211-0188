/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author User
 */
public class update2 {
     public void update(int id, String address, String contact){
       
        new model.update().update(id, address, contact);
    } 
}
