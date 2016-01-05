package com.ingesup.b2.mysql.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ingesup.b2.beans.Acteur;

public class DaoActeur {

	private ArrayList<Acteur> acteurs = new ArrayList<>();
	public ArrayList<Acteur> getActeurs() {
		return acteurs;
	}
	private int cursor;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public DaoActeur(){
		ResultSet rSet = results();
		try {
			while(rSet.next()){
				int id = rSet.getInt("id");
				String nom = rSet.getString("nom");
				String prenom = rSet.getString("prenom");
				boolean sexe = rSet.getInt("sexe")==1?true:false;
				int anneNaissance = rSet.getInt("anneeNaissance");
				Acteur tempAct = new Acteur(id, nom, prenom, sexe, anneNaissance);
				acteurs.add(tempAct);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet results()
	{
		String url = "jdbc:mysql://localhost/FilmsB2";
		String login = "root";
		String pass = "11Dennis";
		try {
		Connection con = DriverManager.getConnection(url, login, pass);
		String sql ="SELECT * FROM acteurs";
		Statement declaration = con.createStatement();
		ResultSet rSet = declaration.executeQuery(sql);
		System.out.println(rSet);
		return rSet;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return null;
		}
	}
	public void printList(){
		for (int i = 0; i < acteurs.size() ; i++){
			System.out.println(acteurs.get(i));
		}
	}
	public void printAt(int i){
		if (i >= acteurs.size())
			System.out.println("Index out of range");
		else
			System.out.println(acteurs.get(i));
	}
	public void addActorDB(Acteur a){
		String url = "jdbc:mysql://localhost/FilmsB2";
		String login = "root";
		String pass = "11Dennis";
		String nom = a.getNom();
		String prenom = a.getPrenom(); 
		int sexe = a.isEstFemme()==true? 1 : 0;
		int anneeNaissance = a.getAnneeNaissance();
		try {
		Connection con = DriverManager.getConnection(url, login, pass);
		//System.out.println("INSERT INTO acteurs (nom, prenom, sexe, anneeNaissance) VALUES ("+nom+","+prenom+","+sexe+","+anneeNaissance+")");
		String sql ="INSERT INTO acteurs (nom, prenom, sexe, anneeNaissance) VALUES (\""+nom+"\",\""+prenom+"\",\""+sexe+"\",\""+anneeNaissance+"\")";
		Statement declaration = con.createStatement();
		int res = declaration.executeUpdate(sql);
		System.out.println(res);
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
}
