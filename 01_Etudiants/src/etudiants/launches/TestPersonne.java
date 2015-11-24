package etudiants.launches;

import etudiants.beans.Personne;

public class TestPersonne {

	public static void main(String[] args) {
			Personne p1=new Personne("Jodie", "FOSTER", true);
			Personne p2=new Personne("Matt", "DAMON", false);
			System.out.println(p1);
			System.out.println(p2);
	}

}
