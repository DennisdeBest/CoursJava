
public class TestClass {

	public static void main(String[] args) {
		Personne p = new Personne("unNom", "unPrenom", false);
		System.out.println(p);
		Permanent per = new Permanent("nomPer", "prenomPer", true, 1250);
		System.out.println(per);
		Commercial c = new Commercial("nomCom", "prenomCom", false, 10000, 20);
		System.out.println(c);
		Temporaire t = new Temporaire("nomTemp","prenomTemp", true, 18, 24);
		System.out.println(t);
	}

}
