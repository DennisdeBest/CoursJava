
public class Permanent extends Personne {
	private int fixe;

	public Permanent(int fixe) {
		this.fixe = fixe;
	}
	
	public int salaire() {
		return fixe;
	}
	public String toString(){
		String output = super.toString() + "gagne "+fixe+" € ";
		return output;
	}
}
