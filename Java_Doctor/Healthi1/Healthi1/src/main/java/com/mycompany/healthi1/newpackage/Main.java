/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.healthi1.newpackage;

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
 
    static JTextField firstname, lastname, email, patientsearch;
    static JTextField login_username;
    static JPasswordField login_password;
            
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
    
    public static void mainscreen(){
        JFrame frame = new JFrame("Welcome");
        frame.setSize(1000, 700);
        frame.getContentPane().setLayout(new FlowLayout());
        
        patientsearch = new JTextField(" ", 20);
        JButton searchbtn = new JButton("Search");
        JButton newbtn = new JButton("New Patient");
        JButton startpres = new JButton("Prescribe");
         
        frame.getContentPane().add(patientsearch);
        frame.getContentPane().add(searchbtn);
        frame.getContentPane().add(newbtn);
        frame.getContentPane().add(startpres);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        /*
        front -search for patient
        add patient to your list - use patient ID 
        create prescription - patient needs to already be in system
        */
        
        
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
       
       donebtn.addActionListener(new ActionListener (){
           @Override
           public void actionPerformed(ActionEvent x){
               System.out.println(firstname.getText());
           }
       });
    }
    
    public static boolean validate_data(String username, String password){
        return true;
    }
    
    public static void display_startscreen(){
      JFrame frame = new JFrame("Doctor Portal");
      frame.setSize(400, 300);
      frame.setLayout(null);
      
      JButton signupbtn = new JButton("New");
      JButton loginbtn = new JButton("Login");
      login_username = new JTextField("");
      login_password = new JPasswordField("");
      
      signupbtn.setBounds(300,10,80,40);
      login_username.setBounds(100,10,100,30);
      login_password.setBounds(100,80,100,30);
      loginbtn.setBounds(150,200,100,40);
      
      frame.add(signupbtn);
      frame.add(loginbtn);
      frame.add(login_username);
      frame.add(login_password);
      
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
      loginbtn.addActionListener(new ActionListener (){
          @Override
          public void actionPerformed(ActionEvent e){
             String user_name_val = login_username.getText();
             String user_pass_val = login_password.getText();
             System.out.println(user_pass_val);
             //boolean validate = validate_data(user_name_val, user_pass_val);
             //System.out.println(validate);
             //frame.setVisible(false);
             //mainscreen();
          }
      });
    }   
}
