package Classes;


public class Temporaire extends Personne {
	private int tarif_horaire;
	private int nbre_heures;
	
	public Temporaire(String prenom, String nom, boolean feminin, int tarif_h, int nbre_heures) {
		super(prenom, nom, feminin);
		this.tarif_horaire = tarif_h;
		this.nbre_heures = nbre_heures;
	}
	public int salaire(){
		return tarif_horaire*nbre_heures;
	}
	public int getTarif_horaire() {
		return tarif_horaire;
	}
	public void setTarif_horaire(int tarif_horaire) {
		this.tarif_horaire = tarif_horaire;
	}
	public int getNbre_heures() {
		return nbre_heures;
	}
	public void setNbre_heures(int nbre_heures) {
		this.nbre_heures = nbre_heures;
	}
	public String toString() {
		String output = getClass()+super.toString()+"gagne "+this.salaire()+"€ ("+nbre_heures+" heures à "+tarif_horaire+"€ de l'heure)";;
		return output;
	}
}
