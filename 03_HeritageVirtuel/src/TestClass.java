import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		Permanent p = new Permanent("nomPer", "prenomPer", true, 1250);
		Commercial c = new Commercial("nomCom", "prenomCom", false, 10000, 20);
		Temporaire t = new Temporaire("nomTemp","prenomTemp", true, 18, 24);

		ArrayList<Personne> salaries = new ArrayList<>();
		salaries.add(p);
		salaries.add(c);
		salaries.add(t);
		
		int totsalaire = 0;
		for(Personne salarie:salaries){
			System.out.println(salarie);
			totsalaire += salarie.salaire();
		}
		System.out.println("Total a payer : "+totsalaire+"€");
	}

}
