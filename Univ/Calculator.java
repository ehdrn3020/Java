//Simple calculation program implementation using event processing

package test;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {
	private JTextField t;
	private JButton b0, bzero, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	private JButton bd, bt, bp, bm, result; //divide, multiple, plus, minus
	private double[] darr = new double[10]; // button array.
	private String[] sarr = new String[9]; // operator array.
	private int j = 0, k = 0;

	public MyFrame() {
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		p1.setLayout(new FlowLayout(FlowLayout.LEADING));
		t = new JTextField(20);
		p1.add(t); // Add text box to panel1
		
		p2.setLayout(new GridLayout(0, 5));
		b0 = new JButton("C");
		b0.addActionListener(this);
		p2.add(b0);
		p1.add(p2); // Add reset button to penel2
		
		p3.setLayout(new GridLayout(4, 5, 5, 5));
		p3.add(b7 = new JButton("7"));
		b7.addActionListener(this);
		p3.add(b8 = new JButton("8"));
		b8.addActionListener(this);
		p3.add(b9 = new JButton("9"));
		b9.addActionListener(this);
		p3.add(bd = new JButton("/"));
		bd.addActionListener(this);
		p3.add(b4 = new JButton("4"));
		b4.addActionListener(this);
		p3.add(b5 = new JButton("5"));
		b5.addActionListener(this);
		p3.add(b6 = new JButton("6"));
		b6.addActionListener(this);
		p3.add(bt = new JButton("*"));
		bt.addActionListener(this);
		p3.add(b1 = new JButton("1"));
		b1.addActionListener(this);
		p3.add(b2 = new JButton("2"));
		b2.addActionListener(this);
		p3.add(b3 = new JButton("3"));
		b3.addActionListener(this);
		p3.add(bm = new JButton("-"));
		bm.addActionListener(this);
		p3.add(bzero = new JButton("0"));
		bzero.addActionListener(this);
		p3.add(new JButton("C"));
		p3.add(result = new JButton("="));
		result.addActionListener(this);
		p3.add(bp = new JButton("+"));
		//Add each button 0-9 and operator button to penel3
		
		bp.addActionListener(this);
		p1.add(p3);
		this.add(p1);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String i;
		if (e.getSource() == b0){ // Reset text box when C button is pressed
			t.setText(null);
			k = 0;
			j = 0;
		} else if (e.getSource() == bt || e.getSource() == bd || 
					e.getSource() == bp || e.getSource() == bm) {
			sarr[j++] = e.getActionCommand();
		} //When the operator button is pressed, it is stored in operator array
		else if (e.getSource() == result) { 
			double n1 = 0, n2 = 0;
			j = 0;
			k = 0;
			// When the "=" button is pressed, the values are retrieved from the two arrays and calculate.
			
			while (sarr[j] != null) {
				n1 = darr[k];
				n2 = darr[++k];
				switch (sarr[j++]) // Separate operators.
				{
				case "+":
					n1 += n2;
					break;
				case "-":
					n1 -= n2;
					break;
				case "*":
					n1 *= n2;
					break;
				case "/":
					n1 /= n2;
					break;
				default:
					break;
				}
				darr[k] = n1;
			}
			t.setText(Double.toString(darr[k])); 
			j = 0;
			k = 0;
			// Input the value of result to text box.
		} else { // If the number button, leave it.
			darr[k++] = Double.parseDouble(e.getActionCommand());
			i = t.getText();
			t.setText(i + e.getActionCommand());
		}
	}
}

public class Calculator {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
}
