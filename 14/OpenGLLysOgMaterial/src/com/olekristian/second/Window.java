package com.olekristian.second;

import javax.swing.JFrame;

public class Window extends JFrame {
	   
	public Window (String tittel) {
		setTitle(tittel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Graphic graphic = new Graphic();
		graphic.setBounds(0, 0, 500, 500);
		add(graphic);
		pack();
	}
}
