/**
*
* Smiley
*
*/


import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Vindu extends JFrame {
	public Vindu(String tittel) {
		setTitle(tittel);
		setSize(500, 400); // bredde, høyde
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tegning tegningen = new Tegning();
		add(tegningen);
	}
}

class Tegning extends JPanel {
	public void paintComponent(Graphics tegneflate) {
		super.paintComponent(tegneflate); // husk denne!!
		tegneflate.setColor(Color.ORANGE);
		tegneflate.fillOval(100, 50, 300, 300);
		tegneflate.setColor(Color.BLACK);
		tegneflate.fillOval(175, 125, 50, 50);
		tegneflate.fillOval(275, 125, 50, 50);
		tegneflate.fillArc(150, 150, 200, 150, 180, 180);
	}
}

class Main {
	public static void main(String[] args) {
		Vindu vindu1 = new Vindu("Test");
		vindu1.setVisible(true);
	}
}