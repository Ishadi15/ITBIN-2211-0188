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
public class update {
   public void update(int id, String email, String address){
       
        new model.update().update(id, email, address);
    } 
}
