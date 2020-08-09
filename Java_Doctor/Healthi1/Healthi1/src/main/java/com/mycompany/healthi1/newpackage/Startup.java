/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.healthi1.newpackage;

import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


/**
 *
 * @author stefan
 */
public class Startup {
    
    public static void main(String[] args){
        JFrame frame = new JFrame("Healthi");
        frame.setSize(1000, 700);
        frame.setLayout(null);
        
        JTabbedPane tp= new JTabbedPane();  
        //JTextArea ta=new JTextArea(200,200);  
        JPanel p1=new JPanel();  
        //p1.add(ta);  
        JPanel p2=new JPanel();  
        JPanel p3=new JPanel();   
        tp.setBounds(50,50,200,200);  
        tp.add("Prescribe Medication",p1);  
        tp.add("Patients",p2);  
        tp.add("Settings",p3);  
        
        tp.setBounds(0, 0, 1000, 700);
        frame.add(tp);    
        
        //p1 elements
        JButton prescribebtn = new JButton("Fill");
        p1.add(prescribebtn);
        
        //p2 elements
        JButton searchbtn = new JButton("Search");
        p2.add(searchbtn);
        
        //p3 elements
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
