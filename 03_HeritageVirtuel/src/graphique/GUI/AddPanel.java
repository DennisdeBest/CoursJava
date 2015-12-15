package graphique.GUI;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Classes.Commercial;
import Classes.Permanent;
import Classes.Personne;
import Classes.Temporaire;

@SuppressWarnings("serial")
public class AddPanel extends JPanel implements ActionListener {
	

	protected JTextField fName;
	protected JTextField lName;
	protected JRadioButton temp;
	protected JRadioButton perm;
	protected JRadioButton com;
	protected JButton jbAdd;
	protected JButton jbQuit;
	protected JTextField hours;
	protected JTextField wages;
	protected JTextField volume;
	protected JTextField commision;
	public Container jp3;
	protected ArrayList<Personne> arrP;
	protected JRadioButton male;
	protected JRadioButton female;

	public AddPanel() {
		//Initialize the jp3 container
		jp3 = new Container();;
		jp3.setLayout(new CardLayout());
		
		//Main layout
		setLayout(new GridLayout(4,1,10,10));
		
		//Setting the first panel
		JPanel jp1 = new JPanel();
		//Set layout Grid
		jp1.setLayout(new GridLayout(3, 2, 10, 10))	;
		jp1.add(new JLabel("last name"));
		lName = new JTextField();
		jp1.add(lName);
		jp1.add(new JLabel("first name"));
		fName = new JTextField();
		jp1.add(fName);
		male = new JRadioButton("male");
		male.setSelected(true);
		female = new JRadioButton("female");
		ButtonGroup sexe = new ButtonGroup();
		sexe.add(male);
		sexe.add(female);
		jp1.add(male);
		jp1.add(female);
		add(jp1);
		
		//Setting the second panel
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(1, 3,5,5));
		temp = new JRadioButton("temp");
		temp.setSelected(true);
		perm = new JRadioButton("perm");
		com = new JRadioButton("com");
		//Button group and add buttons to group
		ButtonGroup group = new ButtonGroup();
		group.add(temp);
		group.add(perm);
		group.add(com);
		//add buttons to panel
		jp2.add(temp);
		jp2.add(perm);
		jp2.add(com);
		add(jp2);

		// Add listeners to radio buttons
		temp.addActionListener(this);
		perm.addActionListener(this);
		com.addActionListener(this);
		
		//Call the add component function to get the switchable cards
		addComponentToPane(this);
		
		//Set the 4th Panel (the buttons)
		JPanel jp4 = new JPanel();
		jbAdd = new JButton("Add");
		jp4.add(jbAdd);
		jbQuit = new JButton("Quit");
		jp4.add(jbQuit);
		add(jp4);
		//Add some linstners to the buttons
		jbAdd.addActionListener(this);
		jbQuit.addActionListener(this);
	}
	
	//The add component function
	public void addComponentToPane(Container pane) {
		//Set componenets for the first card
		JPanel card1 = new JPanel();
		card1.setLayout(new GridLayout(2, 2, 10, 10))	;
		card1.add(new JLabel("Hours : "));
		hours = new JTextField();
		card1.add(hours);
		card1.add(new JLabel("Wages : "));
		wages = new JTextField();
		card1.add(wages);
		//And the second
		JPanel card2 = new JPanel();
		card2.setLayout(new GridLayout(1, 2, 10, 10))	;
		card2.add(new JLabel("Monthly Pay : "));
		wages = new JTextField();
		card2.add(wages);
		//And the third
		JPanel card3 = new JPanel();
		card3.setLayout(new GridLayout(2, 2, 10, 10))	;
		card3.add(new JLabel("Commision : "));
		commision = new JTextField();
		card3.add(commision);
		card3.add(new JLabel("Sale volume : "));
		volume = new JTextField();
		card3.add(volume);
		
		//create a new panel
		jp3 =  new JPanel(new CardLayout());
		//add cards to the panel
		jp3.add(card3, "comcard");
		jp3.add(card2, "permcard");
		jp3.add(card1, "tempcard");
		//Add the panel to the pane
		pane.add(jp3);
		
	}
	
	//configures the actions performed
	public void actionPerformed(ActionEvent e)
	{
		//Listen to the source and do action accordingly
		CardLayout cl = (CardLayout)(jp3.getLayout());
		//Show cards according to radio button active
		if (e.getSource()==temp)
		{
			cl.show(jp3, "tempcard");
		}
		else if (e.getSource()==perm)
		{
			cl.show(jp3, "permcard");
		}
		else if (e.getSource()==com)
		{
			cl.show(jp3, "comcard");
		}
		//set quit button
		else if(e.getSource()==jbQuit)
			System.exit(0);
		else if(e.getSource()==jbAdd)
		{
			if(temp.isSelected()){
				if (male.isSelected())	
					arrP.add(new Temporaire(fName.getText(), lName.getText(), false, Integer.parseInt(hours.getText()), Integer.parseInt(wages.getText())));
				else
					arrP.add(new Temporaire(fName.getText(), lName.getText(), true, Integer.parseInt(hours.getText()), Integer.parseInt(wages.getText())));
			}
			else if (com.isSelected())
			{
				if (male.isSelected())
					arrP.add(new Commercial(fName.getText(), lName.getText(), false, Integer.parseInt(hours.getText()), Integer.parseInt(commision.getText())));
				else
					arrP.add(new Commercial(fName.getText(), lName.getText(), true, Integer.parseInt(hours.getText()), Integer.parseInt(commision.getText())));
			}
			else 
			{
				if (male.isSelected())
					arrP.add(new Permanent(fName.getText(), lName.getText(), false, Integer.parseInt(wages.getText())));
				else
					arrP.add(new Permanent(fName.getText(), lName.getText(), true, Integer.parseInt(wages.getText())));
			}
		}
	}
	public void printToFile (String s){
		String filename = "employees.txt";
		 try {
		FileWriter fileWriter = new FileWriter(filename);
		BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);
		bufferedWriter.write(s);
		bufferedWriter.close();
		 }  
    catch(IOException ex) {
        System.out.println(
            "Error writing to file '"
            + filename + "'");
        // Or we could just do this:
        // ex.printStackTrace();
    	}
	}
}