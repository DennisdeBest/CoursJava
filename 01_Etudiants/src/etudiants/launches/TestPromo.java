package etudiants.launches;

import etudiants.beans.Etudiant;
import etudiants.beans.Promo;

public class TestPromo {

	public static void main(String[] args) {
		Promo p1 = new Promo("B1");
		Etudiant e1 = new Etudiant("Jack", "OUILLE", false);
		Etudiant e2 = new Etudiant("Jeanne", "OUILLE", true);
		Etudiant e3 = new Etudiant("Jack", "DANIEL", false);
		//etudiant sans moyenne
		Etudiant e4 = new Etudiant("Jacky", "DANIEL", false);
		
		e1.ajoutDeNote(10.5);
		e1.ajoutDeNote(0.5);
		e1.ajoutDeNote(15.5);
		e2.ajoutDeNote(17.25);
		e2.ajoutDeNote(10.5);
		e2.ajoutDeNote(8.5);
		e3.ajoutDeNote(6.5);
		e3.ajoutDeNote(10.5);
		e3.ajoutDeNote(18.5);
		
		p1.ajoutEtudiant(e1);
		p1.ajoutEtudiant(e2);
		p1.ajoutEtudiant(e3);
		p1.ajoutEtudiant(e4);
		
		System.out.println(p1);
	}

}
