package etudiants.beans;

import java.util.ArrayList;

public class Promo {
	private String nom;
	private ArrayList<Etudiant> eleves;
	public Promo(String n) {
		this.nom = n;
		eleves = new ArrayList<>();
	}
	
	public void ajoutEtudiant(Etudiant e)
	{
		eleves.add(e);
	}
	
	public double moyenne() throws Exception
	{
		double temp = 0;
		int tempE = 0;
		if (eleves.size()==0)
			throw new Exception ("Pas d'élève dans cette promo");
		try 
		{
			for(Etudiant e : eleves)
			{
	
					temp += e.moyenne();
					tempE++;
				}
			}
		catch (Exception e){
			System.out.println("élève sans moyenne");
		}

		if (tempE==0)
			throw new Exception ("Aucune moyenne dans la promo");
		return Math.floor((temp/tempE)* 100) / 100;

			
	}
	
	public String toString()
	{
		String output;
		try {
			output = "Il y'a "+eleves.size()+" dans la promo "+nom+" la moyenne est de "+moyenne();
			return output;
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}
}
