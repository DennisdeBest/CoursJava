package graphique.GUI;
import java.util.ArrayList;

import Classes.Commercial;
import Classes.Permanent;
import Classes.Personne;
import Classes.Temporaire;


public class DefaultValues {
	private ArrayList<Personne> DefaultList = new ArrayList<>();
	
	public DefaultValues(){
		DefaultList.add(new Temporaire("Jean", "Dujardin", false, 10,25));
		DefaultList.add(new Temporaire("Jeannette", "Chirac", true, 100,25));
		DefaultList.add(new Commercial("Ulysse", "Dupont", false, 100,25));
		DefaultList.add(new Permanent("Christine", "Random", true, 100));
	}

	public ArrayList<Personne> getDefaultList() {
		return DefaultList;
	}
}
