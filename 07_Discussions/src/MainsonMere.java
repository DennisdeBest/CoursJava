
public class MainsonMere {
	private int budgetGlobal;
	private Filiale f1;
	public MainsonMere(int budgetGlobal) {
		this.budgetGlobal = budgetGlobal;
		f1 = new Filiale(this, budgetGlobal/2);
	}
	
	public int getBudgetGlobal() {
		return budgetGlobal;
	}

	public Filiale getF1() {
		return f1;
	}

	public int getBudgetLocalFiliale(){
		return f1.getBudgetLocal();
	}
	
	public String toString() {
		return "budget : " + this.getBudgetGlobal() + " Budget filial : " + f1.getBudgetLocal();
	}
}
