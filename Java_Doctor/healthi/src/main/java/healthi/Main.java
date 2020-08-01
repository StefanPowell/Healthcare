/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthi;

import java.awt.FlowLayout;
import javax.swing.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


/**
 *
 * @author Stefan Powell : powellstefan100@gmail.com
 */
public class Main {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
    static JTextField firstname, lastname, email;
            
    public static void main(String[] args) {
        String ip = "104.154.57.18";
        String username = "spowell375";
        String password = "mari$a1998";
        //connect(ip,username, password);
        display_startscreen();
    }
    
    public static void connect(String ip, String user, String password) {
            Connection conn1 = null;
            Connection conn2 = null;
            Connection conn3 = null;
            try {
                String url2 = "jdbc:mysql://104.154.57.18:3306/mysql?user=spowell375&password=mari$a1998";
                conn2 = DriverManager.getConnection(url2);
                if (conn2 != null) {
                    System.out.println("Connected to the database test2");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
    }
    
    public static void signupscreen(){
       JFrame frame = new JFrame("Sign Up");
       frame.setSize(600, 400);
       frame.getContentPane().setLayout(new FlowLayout());
       
       JButton donebtn = new JButton("Done");
       
       firstname = new JTextField("Firstname", 20);
       lastname = new JTextField("Lastname");
       email = new JTextField("Email");
       
       donebtn.setBounds(150,200,100,40);
       
       frame.getContentPane().add(firstname);
       frame.add(donebtn);
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
    }
    
    public static void display_startscreen(){
      JFrame frame = new JFrame("Doctor Portal");
      frame.setSize(400, 300);
      frame.setLayout(null);
      
      JButton signupbtn = new JButton("New");
      JButton loginbtn = new JButton("Login");
      
      signupbtn.setBounds(300,10,80,40);
      loginbtn.setBounds(150,200,100,40);
      
      frame.add(signupbtn);
      frame.add(loginbtn);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      
      signupbtn.addActionListener(new ActionListener (){
          @Override
          public void actionPerformed(ActionEvent e){
             frame.setVisible(false);
             signupscreen();
          }
      });
    }
    
}
