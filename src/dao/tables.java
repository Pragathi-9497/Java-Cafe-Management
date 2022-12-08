/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class tables {
    public static void main(String[] args){
        
        try{
            String userTable = "create table user( id int AUTO_INCREMENT primary Key , name varchar(200), email varchar(200), mobileNumber varchar(200),address varchar(200), password varchar(200) , securityQuestion varchar(200) , answer varchar(200) , status varchar(200) , UNIQUE (email))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','India','admin','What primary school did you attended?','ABC','true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchare(200))";
            DbOperations.setDataorDelete(userTable,"user table created Successfully");
            
            //DbOperations.setDataorDelete(adminDetails,"Admin Details Added Successfully");
            
            //
            DbOperations.setDataorDelete(userTable,"Category table created Successfully");
            
            
        }
        
        catch(Exception e ){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
