package Classes;

public abstract class Personne {
	protected String nom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public boolean isFeminin() {
		return feminin;
	}
	public void setFeminin(boolean feminin) {
		this.feminin = feminin;
	}
	protected String prenom;
	protected boolean feminin;
	public Personne(String prenom, String nom, boolean feminin) {
		this.prenom = prenom;
		this.nom = nom;
		this.feminin = feminin;
	}
	public String toString() {
		String titre = feminin?" Mme.":" M.";
		String output = titre+" "+prenom+" "+nom+" ";
		return output;
	}
	public abstract int salaire();
}
