package graphique.GUI;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MaFrame extends JFrame{
	public MaFrame(){
		this.setSize(400,250);
		this.setTitle("Salariées");
		MainPanel panel = new MainPanel();
		this.add(panel);
	}

}
