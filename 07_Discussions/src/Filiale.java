
public class Filiale {
	private int budgetLocal;
	private MainsonMere maisonMere;
	public Filiale(MainsonMere maisonMere, int budget){
		this.maisonMere = maisonMere;
		budgetLocal = budget;
		System.out.println(maisonMere.getBudgetGlobal());
	}
	public int getBudgetLocal() {
		return budgetLocal;
	}
	public String toString(){
		return "Budget global : " + maisonMere.getBudgetGlobal() + " Budget local : " +this.getBudgetLocal();
	}
}
