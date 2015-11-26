package graphique.GUI;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MaFrame extends JFrame{
	public MaFrame(){
		this.setSize(300,140);
		this.setTitle("Converter");
		MonPanel panel = new MonPanel();
		this.add(panel);
	}

}
