package com.ingesup.b2.beans;

public class Acteur {
	private String nom;
	private String prenom;
	private boolean estFemme;
	private int id;
	private int anneeNaissance;
	
	public Acteur(int id, String nom, String prenom, boolean estFemme, int anneeNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.estFemme = estFemme;
		this.id = id;
		this.anneeNaissance = anneeNaissance;
	}
	public Acteur(String nom, String prenom, boolean estFemme, int anneeNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.estFemme = estFemme;
		this.anneeNaissance = anneeNaissance;
	}
	
	public String toString(){
		String sexe = (estFemme)?"Mme ":"M.";
		return sexe + prenom + " " + nom + " (" + anneeNaissance+")";
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public boolean isEstFemme() {
		return estFemme;
	}
	public int getAnneeNaissance() {
		return anneeNaissance;
	}
}
