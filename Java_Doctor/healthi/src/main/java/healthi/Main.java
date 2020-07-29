/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthi;

import javax.swing.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Stefan Powell : powellstefan100@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        display_startscreen();
    }
    
    public static void signupscreen(){
       JFrame frame = new JFrame("Sign Up");
       frame.setSize(600, 500);
       frame.setLayout(null);
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
