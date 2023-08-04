/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DatabaseHelper {  
    public static Connection getconnecDb(){
        try{
        String connectionUrl = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=QLQA;user=sa;password=288;"
                + "encrypt=true;trustServerCertificate=true;";
        Connection con = DriverManager.getConnection(connectionUrl);
        return con;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
