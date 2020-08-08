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
        String ip = "104.154.57.18";
        String username = "spowell375";
        String password = "mari$a1998";
        
            Connection conn = null;

            try {
                
                String url = "jdbc:mysql://104.154.57.18:3306/users";
                Properties info = new Properties();
                info.put("user", "spowell375");
                info.put("password", "mari$a1998");
                
                 
                conn = DriverManager.getConnection(url, info);
                
                if (conn != null) {
                    System.out.println("Connected to the database test2");
                }
                }catch(SQLException e){
                    System.out.println(e);
                }
    }
}


