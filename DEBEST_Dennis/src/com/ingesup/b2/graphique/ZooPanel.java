package com.ingesup.b2.graphique;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.ingesup.zoo.entities.*;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ZooPanel extends JPanel implements ActionListener {
	//déclaration de tout les éléments avec lesquelles il va falloir interagir
	private JButton jbAjouteHerbivore;
	private JButton jbAjouteCarnivore;
	private JButton jbAjouteOmnivore;
	private JButton jbCommande;
	private JButton jbQuitte;
	private JButton jbListe;
	private JTextField jtfNom;
	private JTextField jtfPoids;
	private JTextField jtfMangeLegumes;
	private JTextField jtfMangeViande;
	
	private ArrayList<Animal> listeAnimaux = new ArrayList<>();
	
	//Constructeur
	public ZooPanel(){
		//Layout null pour placement pixel perfect
		setLayout(null);
		
		//Quelques valeurs par défaut
		listeAnimaux.add(new Herbivore("Justin le lapin", 2, 0.5));
		listeAnimaux.add(new Omnivore("Pascal le chacal", 35, 10,10));
		listeAnimaux.add(new Carnivore("Hectore le Tyrannosaure", 1500, 10));
		
		//placement des labels
		placeComp(new JLabel("Nom de l'animal :"), 10,10);
		placeComp(new JLabel("Poids :"), 10,40);
		placeComp(new JLabel("Quantité de légumes :"), 10,70);
		placeComp(new JLabel("Quantité de viande :"), 10,100);
		
		//création des text fields
		jtfNom = new JTextField(22);
		jtfPoids = new JTextField(22);
		jtfMangeLegumes = new JTextField(22);
		jtfMangeViande = new JTextField(22);
		
		//Placement des textfields
		placeComp(jtfNom, 200, 10);
		placeComp(jtfPoids, 200, 40);
		placeComp(jtfMangeLegumes, 200, 70);
		placeComp(jtfMangeViande, 200, 100);
		
		//création des boutons
		jbAjouteHerbivore = new JButton("Ajout Végétarien");
		jbAjouteCarnivore = new JButton("Ajout Carnivore");
		jbAjouteOmnivore = new JButton("Ajout Omnivore");
		jbCommande = new JButton("Commande");
		jbQuitte = new JButton("Quitter");
		jbListe = new JButton("Liste animaux");
		
		//Placement des boutons
		placeComp(jbAjouteHerbivore, 10, 130);
		placeComp(jbAjouteCarnivore, 166, 130);
		placeComp(jbAjouteOmnivore, 311, 130);
		placeComp(jbCommande, 10, 170);
		placeComp(jbListe, 180, 170);
		placeComp(jbQuitte, 368, 170);
		
		//On rajoute des listener sur les boutons
		jbAjouteHerbivore.addActionListener(this);
		jbAjouteCarnivore.addActionListener(this);
		jbAjouteOmnivore.addActionListener(this);
		jbCommande.addActionListener(this);
		jbQuitte.addActionListener(this);
		jbListe.addActionListener(this);
	}
	//Méthode pour placer un élément
	public void placeComp(Component comp, int x, int y){
		Dimension dim = comp.getPreferredSize();
		comp.setBounds(x, y, dim.width, dim.height);
		this.add(comp);
	}
	//Les actions à éffectuer quand un bouton est déclenché
	@Override
	public void actionPerformed(ActionEvent e) {
		//Bouton Quitte
		if(e.getSource()==jbQuitte)
			System.exit(0);
		//Bouton Commande
		else if (e.getSource()==jbCommande){
			double legumes = 0.0;
			double viande = 0.0;
			for (Animal a : listeAnimaux){
				System.out.println(a);
				legumes += a.mangeLegumes();
				viande += a.mangeViande();
			}
			String output = "Il faut commander " + viande + " Kilos de viande et " + legumes + " Kilos de legumes";
			 javax.swing.JOptionPane.showMessageDialog(this, output);
		}
		//Bouton Herbivore
		else if (e.getSource()==jbAjouteHerbivore){
			int p;
			double qte;
			p = ParseInt(jtfPoids.getText());
			qte = ParseDouble(jtfMangeLegumes.getText());
			Herbivore temp = new Herbivore(jtfNom.getText(), p, qte);
			listeAnimaux.add(temp);
			//On vide les champs de text
			jtfPoids.setText("");
			jtfNom.setText("");
			jtfMangeLegumes.setText("");
			jtfMangeViande.setText("");
		}
		//Bouton Carnivore
		else if (e.getSource()==jbAjouteCarnivore){
			int p;
			double qte;
			p = ParseInt(jtfPoids.getText());
			qte = ParseDouble(jtfMangeViande.getText());
			Carnivore temp = new Carnivore(jtfNom.getText(), p, qte);
			listeAnimaux.add(temp);
			//On vide les champs de text
			jtfPoids.setText("");
			jtfNom.setText("");
			jtfMangeLegumes.setText("");
			jtfMangeViande.setText("");
		}
		//Bouton Omnivore
		else if (e.getSource()==jbAjouteOmnivore){
			int p;
			double qteL;
			double qteV;
			p = ParseInt(jtfPoids.getText());
			qteL = ParseDouble(jtfMangeLegumes.getText());
			qteV = ParseDouble(jtfMangeViande.getText());
			Omnivore temp = new Omnivore(jtfNom.getText(), p, qteL, qteV);
			listeAnimaux.add(temp);
			//On vide les champs de text
			jtfPoids.setText("");
			jtfNom.setText("");
			jtfMangeLegumes.setText("");
			jtfMangeViande.setText("");
		}
		//Bouton liste
		else if (e.getSource()==jbListe){
			//On passe note arraylist au constructeur
			ListeAnimaux la = new ListeAnimaux(listeAnimaux);
			la.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			la.setVisible(true);
		}
		
	}
	
	//Méthode pour vérifier l'entréé utilisateur en en faire un double
	public double ParseDouble (String s)
	{
		try {
			double d = Double.parseDouble(s);
			return d;
		}catch (NumberFormatException e) {
		    javax.swing.JOptionPane.showMessageDialog(this, "Invalid input");
		    return -1;
		}
	}
	//Méthode pour vérifier l'entréé utilisateur en en faire un int
	public int ParseInt (String s)
	{
		try {
			int i = Integer.parseInt(s);
			return i;
		}catch (NumberFormatException e) {
		    javax.swing.JOptionPane.showMessageDialog(this, "Invalid input");
		    return -1;
		}
	}
}
