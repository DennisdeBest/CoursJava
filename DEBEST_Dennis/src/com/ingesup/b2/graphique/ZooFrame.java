package com.ingesup.b2.graphique;

import javax.swing.JFrame;

public class ZooFrame extends JFrame {
	public ZooFrame()
	{
		setSize(460,210);
		ZooPanel zp = new ZooPanel();
		add(zp);
	}
	
}
