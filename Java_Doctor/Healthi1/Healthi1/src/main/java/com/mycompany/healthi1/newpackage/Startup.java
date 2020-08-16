/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.healthi1.newpackage;

import static com.mycompany.healthi1.newpackage.Main.firstname;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 *
 * @author stefan
 */
public class Startup {
    
    static JTextField prescription_name, dosage, patient_id, refill;
    static JTextArea instructions;
    
    public static void main(){
        JFrame frame = new JFrame("Healthi");
        frame.setSize(1000, 700);
        frame.setLayout(null);
        
        JTabbedPane tp= new JTabbedPane();    
        JPanel p1=new JPanel(); 
        JPanel p2=new JPanel();  
        JPanel p3=new JPanel();   
        tp.setBounds(0, 0, 1000, 700);
        tp.add("Prescribe Medication",p1);  
        tp.add("Patients",p2);  
        tp.add("Settings",p3);  
        
        
        frame.add(tp);    
        
        p1.setSize(1000, 700);
        p1.setLayout(null);
        //p1 elements
        JLabel label = new JLabel("Patient ID");
        label.setBounds(10,10,100,20);
        patient_id = new JTextField("");
        patient_id.setBounds(120,10,250,20);
        JLabel label1 = new JLabel("Medication");
        label1.setBounds(10,40,100,20);
        prescription_name = new JTextField("");
        prescription_name.setBounds(120,40,250,20);
        JLabel label2 = new JLabel("Dosage");
        label2.setBounds(10,70,100,20);
        dosage = new JTextField("");
        dosage.setBounds(120,70,75,20);
        JLabel label3 = new JLabel("Refills");
        label3.setBounds(10,110,100,20);
        refill = new JTextField("");
        refill.setBounds(120,110,20,20);
        JLabel label4 = new JLabel("Instructions");
        label4.setBounds(10,140,100,20);
        instructions = new JTextArea("");
        instructions.setBounds(120,140,300,100);
        JButton donebtn = new JButton("Finish");
        donebtn.setBounds(850, 10, 100, 25);
        
        p1.add(label);p1.add(patient_id);
        p1.add(label1);p1.add(prescription_name);
        p1.add(label2);p1.add(dosage);
        p1.add(label3);p1.add(refill);
        p1.add(label4);p1.add(instructions);
        p1.add(donebtn);
        
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
