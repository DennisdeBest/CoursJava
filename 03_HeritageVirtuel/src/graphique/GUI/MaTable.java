package graphique.GUI;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Classes.Personne;

public class MaTable extends JFrame {
	public JTable tableau;
	
	public MaTable(){
		this.setTitle("JTable ");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    tableau = new JTable(new ModeleStatique());
	    tableau.getColumnModel().getColumn(1).setCellRenderer(new BoldRenderer());
	    tableau.getColumnModel().getColumn(2).setCellRenderer(new SexeCellRenderer());
	    getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
	    
        pack();
	    /*
	    DefaultValues dv = new DefaultValues();
	    ArrayList<Personne> defaultList = dv.getDefaultList();
	    int size = defaultList.size();
	    for(int i=0; i<size; i++){
            for (int j=0; j < 5; j++)
            	Objects[i]
       }
    
	    String[] entetes = {"Prénom", "Nom", "Femme", "Hours", "Wages"};
        JTable tableau = new JTable(donnees, entetes);
    */
    
	}
	 public static void main(String[] args) {
	        new MaTable().setVisible(true);
	    }
    

}
