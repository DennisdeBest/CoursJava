package com.ingesup.b2.graphique;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import com.ingesup.b2.beans.Acteur;



public class ModeleTable extends AbstractTableModel {
	private final Acteur[] acteurs;
	private final String[] entetes = {"Nom", "Prenom", "Sexe", "Année de naissance"};
	private ArrayList<Acteur> ArrActeurs;
	
	public ModeleTable(ArrayList<Acteur> ArrAni){
		ArrActeurs = ArrAni;
		//On peuple le tableau avec les élémenacteursa liste
		acteurs = new Acteur[ArrActeurs.size()];
     	for (int i = 0; i<ArrActeurs.size(); i++)
     		acteurs[i]=ArrActeurs.get(i);
	}
	
	@Override
	public int getColumnCount() {
		return entetes.length;
	}

	@Override
	public int getRowCount() {
		return ArrActeurs.size();
	}
	public String getColumnName(int columnIndex) {
	    return entetes[columnIndex];
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
    		 switch(columnIndex){
             case 0:
          return acteurs[rowIndex].getNom();
             case 1:
          return acteurs[rowIndex].getPrenom();
             case 2:
          return acteurs[rowIndex].isEstFemme();
             case 3:
          return acteurs[rowIndex].getAnneeNaissance();
             default:
                 return null; 
    		 }
    }

	 
}
