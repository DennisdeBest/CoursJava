package graphique.GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MainPanel extends JPanel implements ActionListener {

	protected JButton bAddPers;

	public MainPanel() {
		//Set layout Grid
		setLayout(new GridLayout(4, 2, 10, 10))	;
		bAddPers = new JButton("Add Employee");
		add(bAddPers);
		
		bAddPers.addActionListener(this);
	
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
	    MaFrame2 frame = new MaFrame2();
	    frame.setVisible(true);
	}
}