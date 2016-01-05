package com.ingesup.b2.mysql.v2;

import com.ingesup.b2.beans.Acteur;

public class TestDoa1 {

	public static void main(String[] args) {
		DaoActeur listActeurs = new DaoActeur();
		
		Acteur a = new Acteur("Travolta", "John", false, 1952);
		//listActeurs.addActorDB(a);
		
		listActeurs.printList();
	}

}
