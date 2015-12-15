package com.ingesup.zoo.entities;

public class Omnivore extends Animal {
	private double quantiteLegumes;
	private double quantiteViande;
	public Omnivore(String s, int i, double d, double dd) {
		super(s, i);
		quantiteViande = d;
		quantiteLegumes = dd;
	}
	@Override
	public double mangeLegumes() {
		// TODO Auto-generated method stub
		return quantiteLegumes*this.getPoids();
	}

	@Override
	public double mangeViande() {
		// TODO Auto-generated method stub
		return quantiteViande*this.getPoids();
	}
	public String toString()
	{
		return super.toString() + " Mange " + mangeLegumes() + " Kilos de Legumes et " + mangeViande() + " Kilos de Viande";
	}

}
