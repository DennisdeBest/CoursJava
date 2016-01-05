package com.ingesup.b2.graphique;

import javax.swing.JFrame;


public class MainFrame extends JFrame {
	public MainFrame(){
		this.setSize(480,180);
		this.setTitle("Actor database");
		MainPanel panel = new MainPanel();
		this.add(panel);
	}
}
