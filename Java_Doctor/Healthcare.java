import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Healthcare implements ActionListener {
        static JTextField textfield1, textfield2, textfield3,textfield4, textfield5, textfield6;
        JFrame f = new JFrame("Login");
        JButton quit =new JButton("Quit"); 

	public void startui() 
        {	  
                    
                    f.setPreferredSize(new Dimension(700, 500)); 
                    f.setUndecorated(true);
                    f.setVisible(true);
		    f.getContentPane().setLayout(new FlowLayout());
                
                    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.RIGHT);
                    tabbedPane.addTab("Tab 1", new JLabel("This is tab 1"));
                    tabbedPane.addTab("Tab 2", new JLabel("This is tab 2"));

                    JLabel label1 = new JLabel();
                    JLabel label2 = new JLabel();
                    JLabel label3 = new JLabel();
                    JLabel label4 = new JLabel();
                    JLabel label5 = new JLabel();
                    JLabel label6 = new JLabel();
                    label1.setText("Patient ID #:");
                    label2.setText("Patient Name :");
                    label3.setText("Drug Name :");
                    label4.setText("Quantity Filled");
                    label5.setText("Refills");
                    label6.setText("Expiration Date");
                    
                    
                    quit.addActionListener(this);
                    JButton b = new JButton("Add");    
                    b.setBounds(50, 20, 30, 30); 
                    
		    textfield1 = new JTextField("",10);
                    textfield2 = new JTextField("",10);
                    textfield3 = new JTextField("",10);
                    textfield4 = new JTextField("",10);
                    textfield5 = new JTextField("",10);
                    textfield6 = new JTextField("",10);
                    
                    f.getContentPane().add(tabbedPane);
                    f.getContentPane().add(quit);
                    f.getContentPane().add(label1);
		    f.getContentPane().add(textfield1);
                    f.getContentPane().add(label2);
                    f.getContentPane().add(textfield2);
                    f.getContentPane().add(label3);
                    f.getContentPane().add(textfield3);
                    f.getContentPane().add(label4);
		    f.getContentPane().add(textfield4);
                    f.getContentPane().add(label5);
                    f.getContentPane().add(textfield5);
                    f.getContentPane().add(label6);
                    f.getContentPane().add(textfield6);
                    
                    f.getContentPane().add(b);
                    
                    
                    f.pack();
                    f.setVisible(true);
                    
                       
        }

        public void actionPerformed(ActionEvent e)
        {
          quit = (JButton)e.getSource();		
          f.dispose();		
          System.out.println("Frame Closed.");		
        }  

        public void main(String[] args) 
        {
                startui();
        }
        
}