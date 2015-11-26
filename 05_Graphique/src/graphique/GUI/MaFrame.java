package graphique.GUI;

import javax.swing.JFrame;

public class MaFrame extends JFrame{
	public MaFrame(){
		this.setSize(400,400);
		this.setTitle("My Frame !!!");
		MonPanel panel = new MonPanel();
		this.add(panel);
	}

}
