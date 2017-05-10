package main_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static String clubfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resourcesClub_List.ods");
	public static String vendorfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resourcesVendor_List.ods");
	public static String expensesfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resourcesExpenses.ods");
	
	/*public static void main(String[] argv) throws Exception {
		System.out.println("----MySQL JDBC Connection Testing -------");
	    
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	    } catch (ClassNotFoundException e) {
	        System.out.println("Where is your MySQL JDBC Driver?");
	        e.printStackTrace();
	        return;
	    }

	    System.out.println("MySQL JDBC Driver Registered!");
	    Connection connection = null;

	    try {
	        connection = DriverManager.
	                getConnection("jdbc:mysql://localhost:3306/posystem.ctaljdp4qkel.us-west-2.rds.amazonaws.com","andrewixl", "delorean1107");
	    } catch (SQLException e) {
	        System.out.println("Connection Failed!:\n" + e.getMessage());
	    }

	    if (connection != null) {
	        System.out.println("SUCCESS!!!! You made it, take control     your database now!");
	    } else {
	        System.out.println("FAILURE! Failed to make connection!");
	    }


	  }
}*/
	public static void main(String[] args) throws Exception
	{
		start();
	}
	public static void start() throws Exception
	{
		//label.setBounds(left right,up down,width,height);
		Spreadsheets instance = new Spreadsheets();
		instance.createSpreadsheet();
		
		Select_Club.selectClub();
	}

}
