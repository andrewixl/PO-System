package main_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Main {
	public static String currentFrame = "addclub";
	
	//Andrew's Path Code for Resources
	public static String clubfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resources\\Club_List.ods");
	public static String vendorfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resources\\Vendor_List.ods");
	public static String expensesfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resources\\Expenses.ods");
	public static String localfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resources\\local.ods");
	public static String fonttype;
	
	//Roger's Path Code for Resources
	//public static String clubfilepath = ("C:\\Users\\linrog18\\Documents\\PO-System\\resources\\Club_List.ods");
	//public static String vendorfilepath = ("C:\\Users\\linrog18\\Documents\\PO-System\\resources\\Vendor_List.ods");
	//public static String expensesfilepath = ("C:\\Users\\linrog18\\Documents\\PO-System\\resources\\Expenses.ods");
	//public static String localfilepath = ("C:\\Users\\linrog18\\Documents\\PO-System\\resources\\local.ods");
	
	//Julia's Path Code for Resources
	//public static String clubfilepath = ("");
	//public static String vendorfilepath = ("");
	//public static String expensesfilepath = ("");
	
	public static void main(String[] argv) throws Exception {
	getconnection();
	}
	
	public static Connection getconnection(){

		     String connectionUrl = "jdbc:mysql://posystem.ctaljdp4qkel.us-west-2.rds.amazonaws.com:3306";
		        String dbUser = "andrewixl";
		        String dbPwd = "delorean1107";
		        Connection conn = null;

		        try {
		            //conn = (Connection) DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
		        	Connection connect = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
		            System.out.println("conn Available");
		            PreparedStatement statement = (PreparedStatement) connect.prepareStatement("SELECT * FROM club_data.club_list");
		            ResultSet data = statement.executeQuery();
		            
		            while (data.next()){
		            	System.out.print(data.getObject("club_id"));
		            }
		            
		            statement.close();
		        } catch (SQLException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		            System.out.println("fetch otion error"+e.getLocalizedMessage());
		        }

		        return conn;
		}   
	
		
	/*public static void main(String[] args) throws Exception
	{
		CoreVariables.getCurrentFont();
		start();
	}
	//public static String fonttype();
	public static void start() throws Exception
	{
		//label.setBounds(left right,up down,width,height);
		Spreadsheets instance = new Spreadsheets();
		instance.createSpreadsheet();
		
		Select_Club.selectClub();
	}*/

}