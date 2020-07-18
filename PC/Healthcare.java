import java.awt.FlowLayout;
import javax.swing.*;


public class Healthcare {
	static JTextField textfield1, textfield2, textfield3;	
	public static void main(String[] args) 
        {	  
                    JFrame f = new JFrame("Login");
                    f.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                    f.setUndecorated(true);
                    f.setVisible(true);
		    f.getContentPane().setLayout(new FlowLayout());
                
                    JLabel label1 = new JLabel();
                    JLabel label2 = new JLabel();
                    JLabel label3 = new JLabel();
                    JLabel label4 = new JLabel();
                    JLabel label5 = new JLabel();
                    JLabel label6 = new JLabel();
                    label1.setText("Patient Name:");
                    label2.setText("Patient Address :");
                    label3.setText("Drug Name :");
                    label4.setText("Quantity Filled");
                    label5.setText("Refills");
                    label6.setText("Expiration Date");
                    
                    JButton quit =new JButton("Quit"); 
                    


                    JButton b = new JButton("Add");    
                    b.setBounds(50, 20, 30, 30); 
                    
		    textfield1 = new JTextField("",20);
                    textfield2 = new JTextField("",20);
                    textfield3 = new JTextField("",20);
                    f.getContentPane().add(label1);
		    f.getContentPane().add(textfield1);
                    f.getContentPane().add(label2);
                    f.getContentPane().add(textfield2);
                    f.getContentPane().add(label3);
		    f.getContentPane().add(textfield3);
                    f.getContentPane().add(b);
                    f.getContentPane().add(quit);
                    f.pack();
                    f.setVisible(true);
                    
                
        }

        
        
}