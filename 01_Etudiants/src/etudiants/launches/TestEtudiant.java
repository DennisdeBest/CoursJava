package etudiants.launches;

import etudiants.beans.Etudiant;

public class TestEtudiant {

public static void main(String[] args) {
	Etudiant e1 = new Etudiant("Jean", "Philippe", false);
	e1.ajoutDeNote(18.5);
	e1.ajoutDeNote(10.5);
	e1.ajoutDeNote(100.5);
	Etudiant e2 = new Etudiant("Jack", "Ouille", false);
	System.out.println(e1);
	System.out.println(e2);
}
}
