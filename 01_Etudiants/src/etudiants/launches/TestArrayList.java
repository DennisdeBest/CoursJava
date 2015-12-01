package etudiants.launches;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		//Instanciation
		ArrayList<String> films;
		//Initialisation
		films = new ArrayList<>();
		System.out.println(films.size());
		//On ajoute des films
		films.add("Contact");
		films.add("Pearl Harbor");
		//Affichage avec boucle
		for(int i = 0; i<films.size(); i++)
			System.out.println(films.get(i));
		//Affichage avec boucle 2eme méthode
		for(String film:films)
			System.out.println(film);
		//Afficher taille de la liste
		System.out.println(films.size());
		//On stocke une methode dans une variable
		String film_enleve = films.remove(0);
		//Supprime le premier élément et affichage le nombre d'éléments restant
		System.out.println("Enlevé " + film_enleve+" -> films restants : "+films.size());
	}

}
