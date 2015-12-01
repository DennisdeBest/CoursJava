package Classes;


public class Commercial extends Personne {
	private int ca;
	private int pourc_commision;
	public Commercial(String prenom, String nom, boolean feminin, int ca, int pourc_commision) {
		super(prenom, nom, feminin);
		this.ca = ca;
		this.pourc_commision = pourc_commision;
	}
	public int salaire(){
		return ca*pourc_commision/100;
	}
	public String toString() {
		String output = getClass()+super.toString()+"gagne "+this.salaire()+"€ ("+pourc_commision+"% de "+ca+"€)";
		return output;
	}
}
