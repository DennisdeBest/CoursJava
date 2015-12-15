package graphique.GUI;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

import Classes.Personne;
import Classes.Temporaire;

public class ModeleStatique<Ami> extends AbstractTableModel {
    private final Personne[] amis;
    private final String[] entetes = {"First name", "Last name", "Sexe", "contract"};

	public ArrayList<Personne> dv =  new ArrayList<>();
	
    public ModeleStatique() {
    	
    	
        DefaultValues dfltv = new DefaultValues();
        dv = dfltv.getDefaultList();
        System.out.println(dv.get(0));
        //for (int i=0; i<dv.size();i++){
        	//amis[i]=dv.get(i);
        //amis[0]=new Temporaire("d","d",false, 10,20);
        
        amis = new Personne[dv.size()];
        	for (int i = 0; i<dv.size();i++)
        		amis[i]=dv.get(i);
        }
    
 
    public int getRowCount() {
        return amis.length;
    }
 
    public int getColumnCount() {
        return entetes.length;
    }
 
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
 
    
    public Object getValueAt(int rowIndex, int columnIndex) {

    	//System.out.println(dv.get(rowIndex).getClass().getName());
    		 switch(columnIndex){
             case 0:
                 return amis[rowIndex].getPrenom();
             case 1:
                 return amis[rowIndex].getNom();
             case 2:
            	 return amis[rowIndex].isFeminin();
             case 3:
                 return amis[rowIndex].getClass().getSimpleName();
             default:
                 return null; //Ne devrait jamais arriver
    		 }
    }
}


