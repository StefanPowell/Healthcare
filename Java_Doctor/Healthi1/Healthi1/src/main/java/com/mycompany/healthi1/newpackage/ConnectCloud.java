/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.healthi1.newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author stefan
 */

public class ConnectCloud {    
    public static void main(String[] args) { 
        Connection dbConnection = null;
        try { String url = "jdbc:mysql://104.154.57.18:3306/mysql"; 
        Properties info = new Properties(); info.put("user", "spowell375"); 
        info.put("password", "mari$a1998"); 
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        dbConnection = DriverManager.getConnection(url, info); 
        if (dbConnection != null) { System.out.println("Successfully connected to MySQL database test"); } } 
        catch (Exception ex) 
        { System.out.println("An error occurred while connecting MySQL databse"); ex.printStackTrace(); } 
    }
}


