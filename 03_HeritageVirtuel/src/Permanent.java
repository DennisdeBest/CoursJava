
public class Permanent extends Personne {
	private int fixe;

	public Permanent(String prenom, String nom, boolean feminin, int fixe) {
		super(prenom, nom, feminin);
		this.fixe = fixe;
	}
	public int salaire() {
		return fixe;
	}
	public String toString(){
		String output = super.toString() + "gagne "+fixe+" € par mois ";
		return output;
	}
}
