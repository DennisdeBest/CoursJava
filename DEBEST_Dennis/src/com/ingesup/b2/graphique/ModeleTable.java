package com.ingesup.b2.graphique;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import com.ingesup.zoo.entities.Animal;


public class ModeleTable extends AbstractTableModel {
	private final Animal[] animaux;
	private final String[] entetes = {"Nom", "Poids", "Régime"};
	private ArrayList<Animal> ArrAnimal;
	
	public ModeleTable(ArrayList<Animal> ArrAni){
		ArrAnimal = ArrAni;
		//On peuple le tableau avec les éléments de la liste
		animaux = new Animal[ArrAnimal.size()];
     	for (int i = 0; i<ArrAnimal.size();i++)
     		animaux[i]=ArrAnimal.get(i);
	}
	
	@Override
	public int getColumnCount() {
		return entetes.length;
	}

	@Override
	public int getRowCount() {
		return ArrAnimal.size();
	}
	public String getColumnName(int columnIndex) {
	    return entetes[columnIndex];
	}
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
    		 switch(columnIndex){
             case 0:
                 return animaux[rowIndex].getNom();
             case 1:
                 return animaux[rowIndex].getPoids();
             case 2:
                 return animaux[rowIndex].getClass().getSimpleName();
             default:
                 return null; 
    		 }
    }

	 
}
