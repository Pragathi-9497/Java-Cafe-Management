/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author HP
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useSSL=false","root","Pratush@1998");
            System.out.println("Database connected...");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
    
}
