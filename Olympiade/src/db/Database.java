package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




public class Database {
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public Database(){
		initDb();
		getAllTeams();
	}
	

	public void initDb(){
		System.out.println("connecte dich...");
		conn = null;
	    String url = "jdbc:mysql://db4free.net:3306/";
	    String dbName = "olympiade";
	    String driver = "com.mysql.jdbc.Driver";
	    String userName = "olympiade";
	    String password = "penis1";
		
		try {
			 Class.forName(driver).newInstance();
	         conn = DriverManager.getConnection(url + dbName, userName, password);
	         System.out.println("Connected to the database");
	         
			
		}catch(Exception e){
			System.out.println("NO CONNECTION " + e);
		}
	}
	
	public void closeDB(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Disconnected from database");
	}
	
	public void getAllTeams(){
		
		ArrayList<String> teamNames = new ArrayList<String>();
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT Lang FROM teams");
			
			while (rs.next()) {
				 teamNames.add(rs.getString("Lang")+ "\n");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}


	public boolean checkLoginData(String username, String inputPW) {
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM user");
			
			while (rs.next()) {
				
				 String name = rs.getString("Name");
				 String pw = rs.getString("Passwort");
				 
				 if(name.equals(username) && pw.equals(inputPW)){

					 return true;
				 }
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
