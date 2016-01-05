package com.ingesup.b2.graphique;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.ingesup.b2.beans.Acteur;

public class ListeActeurs extends JFrame {
public JTable tableau;
	
	public ListeActeurs(ArrayList<Acteur> ArrAct){
		this.setTitle("JTable ");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //On refille la liste au constructeur du panel
	    tableau = new JTable(new ModeleTable(ArrAct));

	    getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
	    
        pack();
	}
}

