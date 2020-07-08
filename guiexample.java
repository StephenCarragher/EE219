package ee219;


import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.*;


public class guiexample {
	public static void main(String args[]) {

		JFrame frame = new JFrame("Hello World App");
		JLabel label = new JLabel("Hello World!");
		label.setFont(new Font("Arial", Font.BOLD, 20)); // change font

		// The easy-to-use BorderLayout
		frame.add(label, BorderLayout.PAGE_START);
		/* Also have: PAGE_END, LINE_START, LINE_END, CENTER */

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
