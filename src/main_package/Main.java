package main_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	//Andrew's Path Code for Resources
	public static String clubfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resourcesClub_List.ods");
	public static String vendorfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resourcesVendor_List.ods");
	public static String expensesfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resourcesExpenses.ods");
	
	//Roger's Path Code for Resources
	//public static String clubfilepath = ("");
	//public static String vendorfilepath = ("");
	//public static String expensesfilepath = ("");
	
	//Julia's Path Code for Resources
	//public static String clubfilepath = ("");
	//public static String vendorfilepath = ("");
	//public static String expensesfilepath = ("");
	
	/*public static void main(String[] argv) throws Exception {
	 getconnection();
	}
	
	public static Connection getconnection(){

		     String connectionUrl = "jdbc:mysql://posystem.ctaljdp4qkel.us-west-2.rds.amazonaws.com:3306";
		        String dbUser = "andrewixl";
		        String dbPwd = "delorean1107";
		        Connection conn = null;

		        try {
		            conn = (Connection) DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
		            System.out.println("conn Available");
		        } catch (SQLException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		            System.out.println("fetch otion error"+e.getLocalizedMessage());
		        }

		        return conn;
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
