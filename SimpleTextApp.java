package ee219;

import java.awt.event.*;
import javax.swing.*;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class SimpleTextApp implements ActionListener{
	private JFrame frame;
	private JButton button1;
	private JButton button2;
	private JTextField textfield;
	
	public SimpleTextApp() {
		
		JFrame frame = new JFrame("SimpleTextApp");
		frame.setLayout(new FlowLayout());
		
		textfield = new JTextField("Here is some TEST text with MIXED case",40);
		button1 = new JButton("Upper Case");
		button2 = new JButton("Lower Case");

		frame.add(textfield);
		frame.add(button1);
		frame.add(button2);

		button1.addActionListener(this);
		button2.addActionListener(this);
		
		frame.pack();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Upper Case")) {
			String Str = textfield.getText();
			textfield.setText(Str.toUpperCase());
			}
		else if (e.getActionCommand().equals("Lower Case")) {
			String Str = textfield.getText();	
			textfield.setText(Str.toLowerCase());
			}
	}
	

	public static void main(String args[]) {
		SimpleTextApp theApp = new SimpleTextApp();
	}
	
}
