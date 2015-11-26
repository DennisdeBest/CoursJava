 package moteurjeu.v2;
import java.util.Random;

public class Moteur {
private boolean win;
private int nbr_a_trouver;
private int nbr_coups;
private int nbr_coups_max;
	public Moteur(){
		this(7);
	}
	
	public Moteur(int coups_max){
		win = false;
		Random alea = new Random();
		nbr_a_trouver = alea.nextInt(100)+1;
		nbr_coups = 0;
		nbr_coups_max = coups_max;
	}
	
	public int getCoupsMax(){
		return nbr_coups_max;
	}
	
	public int getCoup(){
		return nbr_coups;
	}
	
	public void addCoup(){
		nbr_coups++;
	}
	
	public int Essai(int nbr_propose){
		if(nbr_propose == nbr_a_trouver)
		{
			win = true;
			return 0;
		}
		else if(nbr_propose < nbr_a_trouver)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	public int getNbrATrouver(){
		return nbr_a_trouver;
	}
	public boolean getWin(){
		return win;
	}
}