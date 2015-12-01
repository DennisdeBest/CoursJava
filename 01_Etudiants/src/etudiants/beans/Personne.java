package etudiants.beans;

public class Personne {
	private String prenom;
	private String nom;
	private boolean feminin;

	public Personne(String prenom, String nom, boolean feminin) {
		this.prenom = prenom;
		this.nom = nom;
		this.feminin = feminin;
	}
	
	public String toString()
	{
		String titre = feminin?"Mme.":"M.";
		return titre+" "+prenom+" "+nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public boolean isFeminin() {
		return feminin;
	}
	
	}
