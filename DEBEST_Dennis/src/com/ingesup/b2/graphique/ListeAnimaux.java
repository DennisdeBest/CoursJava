package com.ingesup.b2.graphique;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.ingesup.zoo.entities.Animal;

public class ListeAnimaux extends JFrame {
public JTable tableau;
	
	public ListeAnimaux(ArrayList<Animal> ArrAni){
		this.setTitle("JTable ");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //On refille la liste au constructeur du panel
	    tableau = new JTable(new ModeleTable(ArrAni));

	    getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
	    
        pack();
	}
}
