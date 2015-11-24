
public class Animal {
private String nom;
private double poids;

public Animal(String nom, double poids) {
	this.nom = nom;
	this.poids = poids;
}

public double getPoids() {
	return poids;
}

public void setPoids(double D) {
	poids = D;
}
public String toString(){
	String output = "l'animal : "+nom+" fait : "+poids+"kg";
	return output;
}
}
