//Add another color panel to the panel.Function None.

package test;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Mypanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g;
		g2.drawOval(200, 30, 200, 200);
		
		g2.drawArc(240, 60, 50, 50, 180, -180); // snowman eyes
		g2.drawArc(320, 60, 50, 50, 180, -180);
		g2.drawArc(250, 100, 100, 100, 180, 180);
		
		g2.drawLine(300, 30, 300, 10); // snowman hair
		g2.drawLine(290, 30, 280, 10);
		g2.drawLine(310, 30, 320, 10);
		// snowman face
		
		QuadCurve2D q = new QuadCurve2D.Float();
		q.setCurve(300, 230, 250, 280, 300, 350);
		((Graphics2D) g2).draw(q);
		q.setCurve(300, 230, 350, 280, 300, 350);
		((Graphics2D) g2).draw(q);
		// body
		
		q.setCurve(300, 230, 220, 230, 160, 290);
		((Graphics2D) g2).draw(q);
		q.setCurve(300, 230, 250, 290, 160, 290);
		((Graphics2D) g2).draw(q);
		g2.drawLine(160, 290, 130, 290);
		g2.drawLine(160, 290, 130, 310);
		g2.drawLine(160, 290, 140, 330);
		// right hand
		q.setCurve(300, 230, 380, 230, 440, 290);
		((Graphics2D) g2).draw(q);
		q.setCurve(300, 230, 350, 290, 440, 290);
		((Graphics2D) g2).draw(q);
		g2.drawLine(440, 290, 470, 290);
		g2.drawLine(440, 290, 470, 310);
		g2.drawLine(440, 290, 460, 330);
		// ´«»ç¶÷ ¿Þ¼Õ
		q.setCurve(300, 350, 240, 400, 250, 450);
		((Graphics2D) g2).draw(q);
		q.setCurve(300, 350, 300, 430, 250, 450);
		((Graphics2D) g2).draw(q);
		g2.drawRect(150, 450, 100, 50);
		// ´«»ç¶÷ ¿À¸¥ÂÊ ´Ù¸®
		q.setCurve(300, 350, 350, 390, 350, 450);
		((Graphics2D) g2).draw(q);
		q.setCurve(300, 350, 300, 430, 350, 450);
		((Graphics2D) g2).draw(q);
		g2.drawRect(350, 450, 100, 50);
		// ´«»ç¶÷ ¿ÞÂÊ ´Ù¸®
	}
}

class Myframe extends JFrame {
	public Myframe() {
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Snowman");
		Mypanel p = new Mypanel();
		add(p);
		setVisible(true);
	}
}

public class Snowman_Graphic {
	public static void main(String[] args) {
		Myframe f = new Myframe();
	}
}
