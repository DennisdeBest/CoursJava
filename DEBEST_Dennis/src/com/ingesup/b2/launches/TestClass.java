package com.ingesup.b2.launches;
import java.util.ArrayList;

import com.ingesup.zoo.entities.*;
public class TestClass {

	public static void main(String[] args) {
		
		ArrayList<Animal> liste = new ArrayList<>();
		double legumes = 0.0;
		double viande = 0.0;
		liste.add(new Carnivore("Jean le tyrex", 1100, 10));
		liste.add(new Herbivore("Jacques le diplodocus", 2000, 20));
		liste.add(new Omnivore("Pierre le dryosaurus", 800, 5, 5));
		
		for (Animal a : liste){
			System.out.println(a);
			legumes += a.mangeLegumes();
			viande += a.mangeViande();
		}
		System.out.println("Il faut commander "+legumes+" Kilos de legumes et "+viande+" Kilos de viande");
	}

}
