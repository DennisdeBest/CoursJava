
public abstract class Personne {
	protected String nom;
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
