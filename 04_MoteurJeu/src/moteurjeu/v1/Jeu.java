package moteurjeu.v1;

import java.util.Random;
import java.util.Scanner;

public class Jeu {

	public static void main(String[] args) {
		Random alea = new  Random();
		Scanner clavier = new Scanner(System.in);
		//creation d'un nbre aléatoir entre 1 et 100;
		int nbre_a_trouver = alea.nextInt(100)+1;
		
		int nbre_coupmax = 7;
		char continuer = 'o';
		
		
		while(continuer != 'n'){
			int nbre_coups = 0;
			boolean gagner = false;
			System.out.println("Trouvez le nombre aléatoir entre 1 et 100 en "+nbre_coupmax+" coups");
			while (nbre_coups < nbre_coupmax){
				int nombre = clavier.nextInt();
				if (nbre_a_trouver == nombre){
					System.out.println("Bravo vous avez gagné");
					gagner = true;
					break;
				}
				else if (nbre_a_trouver<nombre)
					System.out.println("C'est moins !");
				else
					System.out.println("C'est plus !");
				nbre_coups+=1;
				}
			if (!gagner)
				System.out.println("Perdu ! il fallait trouver : "+nbre_a_trouver);
			System.out.println("Rejouer ? [o/n]");
			String tempLine = clavier.next();
			continuer = tempLine.charAt(0);
		}
	}

}
