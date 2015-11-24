
public class Temporaire extends Personne {
	private int tarif_horaire;
	private int nbre_heures;
	
	public Temporaire(String prenom, String nom, boolean feminin, int ca, int pourc_commision) {
		super(prenom, nom, feminin);
		this.tarif_horaire = ca;
		this.nbre_heures = pourc_commision;
	}
	public int salaire(){
		return tarif_horaire*nbre_heures;
	}
	public String toString() {
		String output = getClass()+super.toString()+"gagne "+this.salaire()+"€ ("+nbre_heures+" heures à "+tarif_horaire+"€ de l'heure)";;
		return output;
	}
}
