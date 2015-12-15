package com.ingesup.zoo.entities;

public abstract class Animal {
	private String nom;
	private int poids;
	//constructeur
	public Animal (String s, int i){
		nom = s;
		poids = i;
	}
	//Accéseurs
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	//Méthodes
	public abstract double mangeLegumes();

	public abstract double mangeViande();
	
	public String toString(){
		return "Class : " + this.getClass().getSimpleName()+" Nom : " + nom + " Poids : " + poids +" Kilos \t";
	}
	
}
