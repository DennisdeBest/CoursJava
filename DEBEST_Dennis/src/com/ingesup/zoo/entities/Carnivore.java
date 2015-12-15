package com.ingesup.zoo.entities;

public class Carnivore extends Animal {
	private double quantiteViande;
	public Carnivore(String s, int i, double d) {
		super(s, i);
		quantiteViande = d;
	}
	

	@Override
	public double mangeLegumes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double mangeViande() {
		// TODO Auto-generated method stub
		return quantiteViande*this.getPoids();
	}
	
	public String toString()
	{
		return super.toString() + " Mange " + this.mangeViande() + " Kilos de viande";
	}

}
