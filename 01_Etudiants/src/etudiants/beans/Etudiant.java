package etudiants.beans;

import java.util.ArrayList;

public class Etudiant extends Personne {
	

	private ArrayList<Double> notes;
	
	public Etudiant(String prenom, String nom, boolean feminin) {
		super(prenom, nom, feminin);
		//Allocation de la collection note
		notes = new ArrayList<>();
	}
	
	public void ajoutDeNote(double d)
	{
		if ( 0<=d && d<=20 )
			notes.add(d);				
	}
	
	public float moyenne() throws Exception
	{
		if(notes.size()>0)
		{
			float temp = 0;
			for(double note:notes)
				temp += note;
			return temp/notes.size();
		}
		else
			throw new Exception ("Pas de notes ! ");
	}
	
	public String toString()
	{
		try {
			return super.toString()+" a une moyenne de : "+moyenne();
		} catch (Exception e) {
			return super.toString()+" : "+e.getMessage();
			
		}
	}
}
