
public class Herbivore extends Animal {
	private double qte_legume;

	public Herbivore(String nom, double poids, double qte_legume) {
		super(nom, poids);
		this.qte_legume = qte_legume;
	}
	
	public double mangelegumes(){
		return this.getPoids()*qte_legume;
	}
}
