
public class Personne {
	protected String nom;
	protected String prenom;
	protected boolean feminin;
	public String toString() {
		String titre = feminin?"Mme.":"M.";
		String output = titre+" "+prenom+" "+nom+" ";
		return output;
	}
}
