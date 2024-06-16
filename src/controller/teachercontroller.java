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
public class teachercontroller {
      public void teacher(int teacherid,String tname,String add,int age,String gnder,String cnt){
        
        new model.newTeacher().addProduct(teacherid, tname, add, age, gnder, cnt);
    }
}
