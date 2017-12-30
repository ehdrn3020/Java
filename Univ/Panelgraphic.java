//Add another color panel to the panel.Function None.

package test;

import java.awt.*;
import javax.swing.*;

class Myframe extends JFrame {
	public Myframe() {

		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		// create 3 panel.
		
		JLabel label = new JLabel("Welcome to Java Pizza. Choose the Pizza.");
		p2.add(label);
		p2.setBackground(Color.GREEN);
		// Add label to panel2.
		
		p3.add(new JButton("Combo Pizza"));
		p3.add(new JButton("Potato Pizza"));
		p3.add(new JButton("Bulgogi Pizza"));
		p3.setBackground(Color.BLUE);
		// Add button to panel 3.
		
		p1.add(p2);
		p1.add(p3);
		p1.setBackground(Color.CYAN);
		// Add panel2 and panel3 to panel1.
		add(p1);
		setVisible(true); // output.
	}
}

public class Panelgraphic {
	public static void main(String[] args) {
		Myframe f = new Myframe();
	}
}
