package com.ingesup.b2.graphique;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.ingesup.b2.beans.Acteur;
import com.ingesup.b2.mysql.v2.DaoActeur;


public class MainPanel extends JPanel implements ActionListener{
	//déclaration de tout les éléments avec lesquelles il va falloir interagir
	private JButton jbAddActor;
	private JButton jbQuitte;
	private JButton jbListe;
	private JTextField jtfNom;
	private JTextField jtfPrenom;
	private JTextField jtfSexe;
	private JTextField jtfAnneeNaissance;
	
	
	//Constructeur
	public MainPanel(){
		//Layout null pour placement pixel perfect
		setLayout(null);

		//placement des labels
		placeComp(new JLabel("Nom :"), 10,10);
		placeComp(new JLabel("Prenom :"), 10,40);
		placeComp(new JLabel("Sexe :"), 10,70);
		placeComp(new JLabel("Annee de Naissance :"), 10,100);
		
		//création des text fields
		jtfNom = new JTextField(22);
		jtfPrenom = new JTextField(22);
		jtfSexe = new JTextField(22);
		jtfAnneeNaissance = new JTextField(22);
		
		//Placement des textfields
		placeComp(jtfNom, 200, 10);
		placeComp(jtfPrenom, 200, 40);
		placeComp(jtfSexe, 200, 70);
		placeComp(jtfAnneeNaissance, 200, 100);
		
		//création des boutons
		jbAddActor = new JButton("Ajout Acteur");
		jbQuitte = new JButton("Quitter");
		jbListe = new JButton("Liste Acteurs");
		
		//Placement des boutons
		placeComp(jbAddActor, 10, 130);
		placeComp(jbListe, 180, 130);
		placeComp(jbQuitte, 368, 130);
		
		//On rajoute des listener sur les boutons
		jbAddActor.addActionListener(this);
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
	public void actionPerformed(ActionEvent e) {
		//Bouton Quitte
		if(e.getSource()==jbQuitte)
			System.exit(0);
		//Bouton Herbivore
		else if (e.getSource()==jbAddActor){
			DaoActeur acteurs = new DaoActeur();
			boolean sexe = jtfSexe.hasFocus()?true : false;
			int annee = ParseInt(jtfAnneeNaissance.getText());
			Acteur a = new Acteur(jtfNom.getText(), jtfPrenom.getText(), sexe, annee);
			acteurs.addActorDB(a);

		}
		//Bouton liste
		else if (e.getSource()==jbListe){
			//On passe note arraylist au constructeur
			DaoActeur acteurs = new DaoActeur();
			ListeActeurs la = new ListeActeurs(acteurs.getActeurs());
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

