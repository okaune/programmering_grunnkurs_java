/**
*
* Applet.java
*
*/

import javax.swing.*;
import java.awt.*;

public class Applet extends JApplet {
	public void init() {
		add(new Tegning());
	}
	
	public void start() {
		
	}
	
	public void stop() {
		
	}
	
	public void destroy() {
		
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