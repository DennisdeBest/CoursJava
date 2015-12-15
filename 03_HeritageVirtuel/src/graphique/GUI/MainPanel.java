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
	protected JButton bTable;

	public MainPanel() {
		//Set layout Grid
		setLayout(new GridLayout(4, 2, 10, 10))	;
		bAddPers = new JButton("Add Employee");
		add(bAddPers);
		bAddPers.addActionListener(this);
		bTable = new JButton("Table");
		add(bTable);
		bTable.addActionListener(this);
	
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bAddPers){
			
		    MaFrame2 frame = new MaFrame2();
		    frame.setVisible(true);
		}
		else if (e.getSource()==bTable){
			 new MaTable().setVisible(true);

		}
	}
}