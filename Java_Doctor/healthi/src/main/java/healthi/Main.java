/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthi;

import javax.swing.*;  
import java.awt.*;

/**
 *
 * @author Stefan Powell : powellstefan100@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        display_startscreen();
    }
    
    public static void display_startscreen(){
      JFrame frame = new JFrame("Doctor Portal");
      frame.setSize(400, 300);
      
      frame.setLayout(null);
      
      JButton button = new JButton("Add Doctor");
      
      button.setBounds(250,10,140,40);
      frame.add(button);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
    }
    
}
