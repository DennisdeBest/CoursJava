package com.ingesup.zoo.entities;

public class Herbivore extends Animal {
	private double quantiteLegumes;
	public Herbivore(String s, int i, double d) {
		super(s, i);
		quantiteLegumes = d;
	}
	@Override
	public double mangeLegumes() {
		// TODO Auto-generated method stub
		return quantiteLegumes*this.getPoids();
	}

	@Override
	public double mangeViande() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String toString()
	{
		return super.toString() + " Mange " + mangeLegumes() + " Kilos de Legumes";
	}
}
