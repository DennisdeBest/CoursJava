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

@SuppressWarnings("serial")
public class MonPanel extends JPanel implements ActionListener{
	private static final String JOptionPane = null;
	private JButton jbConvert;
	private JButton jbQuit;
	private JTextField lyInput;
	private JTextField kmInput;
	private JRadioButton lyKm;
	private JRadioButton kmLy;

	public MonPanel() {
	//Set layout Grid
	setLayout(new GridLayout(4, 2, 10, 10))	;
	//Set Labels and textfields
	add(new JLabel("LY"));
	lyInput = new JTextField();
	add(lyInput);
	add(new JLabel("KM"));
	kmInput = new JTextField();
	add(kmInput);
	//Radio buttons
	lyKm = new JRadioButton("Ly->Km");
	lyKm.setSelected(true);
	kmLy = new JRadioButton("Km->Ly");
	//Button group and add buttons to group
	ButtonGroup group = new ButtonGroup();
	group.add(lyKm);
	group.add(kmLy);
	//add buttons to panel
	add(lyKm);
	add(kmLy);
	//Set and add buttons
	jbConvert = new JButton("Convert");
	add(jbConvert);
	jbQuit = new JButton("Quit");
	add(jbQuit);
	
	//Attach listener
	jbConvert.addActionListener(this);
	jbQuit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("ButtonPressed");
		double k = 3e5*3600*24*365;
		String inputS;
		double d = 0.0;
		double out = 0.0;
		//If Quit is clicked close the panel
		if(e.getSource()==jbQuit)
			System.exit(0);
		//if convert is clicked calculate the value
		if(e.getSource()==jbConvert)
		{
			//check the radio buttons
			if(lyKm.isSelected())
			{
				inputS = lyInput.getText();
				//d = Double.parseDouble(inputS);
				d = ParseDouble(inputS);
				out = d*k;

				kmInput.setText(String.format("%.3e", out));
			}
			else 
			{
				inputS = kmInput.getText();
				d = ParseDouble(inputS);
				out = d/k;
				
				lyInput.setText(String.format("%.3e", out));
			}
		}
	}
	public double ParseDouble (String s)
	{
		try {
			double d = Double.parseDouble(s);
			return d;
		}catch (NumberFormatException e) {
		    javax.swing.JOptionPane.showMessageDialog(this, "Invalid input");
		    return -1;
		}
	}


}
