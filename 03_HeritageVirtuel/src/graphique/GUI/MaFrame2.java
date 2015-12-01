package graphique.GUI;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MaFrame2 extends JFrame{
	public MaFrame2(){
		this.setSize(400,400);
		this.setTitle("Salariées2");
		AddPanel panel = new AddPanel();
		this.add(panel);
	}

}
