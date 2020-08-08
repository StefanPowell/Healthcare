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
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author Stefan Powell : powellstefan100@gmail.com
 */

public class Main {
 
    static JTextField firstname, lastname, email, patientsearch;
    static JTextField login_username;
    static JPasswordField login_password, new_password, confirm_password;
            
    public static void main(String[] args) {
        display_startscreen();
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
       JFrame frame = new JFrame("Registration");
       frame.setSize(400, 300);
       frame.setLayout(null);
       
       JButton donebtn = new JButton("Register");
       JButton cancelbtn = new JButton("Cancel");
       JLabel label1 = new JLabel("Firstname");
       firstname = new JTextField("");
       JLabel label2 = new JLabel("Lastname");
       lastname = new JTextField("");
       JLabel label3 = new JLabel("Email");
       email = new JTextField("");
       JLabel label4 = new JLabel("Password");
       new_password = new JPasswordField("");
       JLabel label5 = new JLabel("Confirm Password");
       confirm_password = new JPasswordField("");
       
       // - left - top - width - height
       donebtn.setBounds(25,220,150,30);
       cancelbtn.setBounds(225,220,150,30);
       label1.setBounds(10,10,130,30);
       firstname.setBounds(150,10,200,30);
       label2.setBounds(10,50,130,30);
       lastname.setBounds(150,50,200,30);
       label3.setBounds(10,90,130,30);
       email.setBounds(150,90,200,30);
       label4.setBounds(10,130,130,30);
       new_password.setBounds(150,130,200,30);
       label5.setBounds(10,170,130,30);
       confirm_password.setBounds(150,170,200,30);
       
       
       frame.add(label1);frame.add(label2);frame.add(label3);frame.add(label4);frame.add(label5);
       frame.add(firstname);
       frame.add(lastname);
       frame.add(email);
       frame.add(new_password);
       frame.add(confirm_password);
       frame.add(donebtn);
       frame.add(cancelbtn);
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
       frame.setResizable(false);
       
       donebtn.addActionListener(new ActionListener (){
           @Override
           public void actionPerformed(ActionEvent x){
               System.out.println(firstname.getText());
           }
       });
    }
    
    public static boolean validate_data(String username, String password){
        boolean valuespopulated = false;
        boolean passwordsize = false;
        boolean capitalFound = false;
        boolean letterFound = false;
        boolean hasSymbol = false;
        
        String[] symbols = new String[]{"~","!","@","#","$","%","^","&","*","?"};
        if(!username.isEmpty() && !password.isEmpty()){valuespopulated=true;}
        char[] password_array = password.toCharArray();
        for(int x = 0; x < password_array.length; x++){
            //check if not Capitalized
            if(Character.isUpperCase(password_array[x])){
               capitalFound = true; 
            }
            //check if no letter
            if(Character.isLetter(password_array[x])){
               letterFound = true; 
            }
            //check if no symbol
            List<String> listofsymbols = Arrays.asList(symbols);
            String password_element_check = Character.toString(password_array[x]);
            if(listofsymbols.contains(password_element_check)){
                hasSymbol = true;
            }
        }
        return(hasSymbol && letterFound && capitalFound && valuespopulated && (password.length() >= 10));
    }
    
    public static void display_startscreen(){
      JFrame frame = new JFrame("Doctor Portal");
      frame.setSize(400, 300);
      frame.setLayout(null);
      
      JButton signupbtn = new JButton("New");
      JButton loginbtn = new JButton("Login");
      login_username = new JTextField("");
      login_password = new JPasswordField("");
      
      signupbtn.setBounds(300,10,80,30);
      login_username.setBounds(100,70,200,30);
      login_password.setBounds(100,110,200,30);
      loginbtn.setBounds(150,200,100,30);
      
      frame.add(signupbtn);
      frame.add(loginbtn);
      frame.add(login_username);
      frame.add(login_password);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setResizable(false);
      
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
