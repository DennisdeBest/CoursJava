package com.ingesup.b2.mysql.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class testV1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/FilmsB2";
		String login = "root";
		String pass = "11Dennis";
		try {
		Connection con = DriverManager.getConnection(url, login, pass);
		String sql ="SELECT * FROM acteurs";
		Statement declaration = con.createStatement();
		ResultSet rSet = declaration.executeQuery(sql);
		while (rSet.next()){
			System.out.println(rSet.getString("prenom"));
			System.out.println(rSet.getString("nom"));
		}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		

	}
	

}
