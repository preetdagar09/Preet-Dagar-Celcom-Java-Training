package com.celcom.day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/Database1";
		String username = "root";
		String password = "Celcom123#";
		
		String query1 = "create table Book("+"bookName varchar(20),"+"authorName varchar(20))";
		String query2 = "insert into Book(bookName,authorName) values('Babylon','John')";
		String query3 = "insert into Book(bookName,authorName) values('Charisma','Marie')" ;
		String query4 = "Delete from Book where bookName = 'Charisma'";
		String query5 = "Truncate Table Book";
		String query6 = "Update book set authorName = 'John Kennedy' where bookName = 'Babylon'";
		
		String query = "Select * from book";
		
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			//st.executeUpdate(query1);
			st.executeUpdate(query2);
			st.executeUpdate(query3);
			//st.executeUpdate(query4);
			//st.executeUpdate(query5);
			st.executeUpdate(query6);
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			}
			
			//String email = rs.getString("EmailId");
			System.out.println("Connection is Successful");
		} catch(Exception e) {
			System.out.println("Connection Unsuccessful" + e);
		}
		
		
		

	}

}
