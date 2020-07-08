package ee219;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;




public class PrimeFactorApp implements ActionListener{
	
	private JFrame frame;
	private JButton button;
	private JTextField textfield;
	private JLabel label1,label2,label3;
	
	
	public PrimeFactorApp() {
		
		frame = new JFrame("Factoring App");
		frame.setLayout(null);
		label1 = new JLabel("Enter a number to factorize:");
		textfield = new JTextField(20);
		label2 = new JLabel("");
		label3 = new JLabel("");
		button = new JButton("Find prime factorization");
		
	
		
		label1.setBounds(20, 10, 300, 30); 
        textfield.setBounds(20, 40, 300, 25); 
        label2.setBounds(20, 70, 300, 30); 
        label3.setBounds(20, 100, 300, 30);
        button.setBounds(20, 170, 300, 25);
       
        
		frame.add(label1);
		frame.add(textfield);
		frame.add(label2);
		frame.add(label3);
		frame.add(button);
		
		
		
		button.addActionListener(this);
		
		
		frame.setSize(340,250);
		frame.setResizable(false);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String Str = textfield.getText();
		if(Str.length()>12) {
			label2.setText("Input number can be no larger than 999999999999" );
			return;
		}
			
		
		try 
        { 
          long n=Long.parseLong(Str); 
          if(n<1) {
  			label2.setText("Input is invalid!");
  			return;
  			}  
          
          label2.setText("The prime factorization of " + Str + " is:");
          Str="";
          for (int i = 2; i <= n; i++) {
        	  while (n % i == 0) {
                  Str =  Str + i ;
                  Str =  Str + " x " ;
                  n /= i;
              }
          }
          label3.setText(Str.substring(0,Str.length()-3));
          
          
          
          
         
        }  
        catch (NumberFormatException r)  
        { 
        	label2.setText("Input is invalid!");
        } 
		
		
		
	}
	
	
	public static void main(String args[]) {
		PrimeFactorApp theApp = new PrimeFactorApp();
	}

}
