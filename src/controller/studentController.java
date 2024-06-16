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
public class studentController {
    
    public void stdu(int id, String fname, String  Grade, String add, String eml, int agg, String gnder, String btd, String con){
        
        new model.newStudent().addProduct(id, fname, Grade, add, eml, agg, gnder, btd, con);
    }
    
}
