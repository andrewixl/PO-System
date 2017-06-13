package main_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;

public class SQLServer {
	public static int columns;
	public static int columns2;
	public static String[] clubs;
	public static String[] vendors;
	public static Connection conn;
	public static Connection getconnection(){
	     String connectionUrl = "jdbc:mysql://posystem.ctaljdp4qkel.us-west-2.rds.amazonaws.com:3306";
	        String dbUser = "andrewixl";
	        String dbPwd = "delorean1107";
	        conn = null;

	        try {
	        	getClubList(connectionUrl, dbUser, dbPwd);
	        	getVendorList(connectionUrl, dbUser, dbPwd);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            System.out.println("fetch option error"+e.getLocalizedMessage());
	        }

	        return conn;
	}   
	
	public static void getClubList(String connectionUrl, String dbUser, String dbPwd) throws SQLException{
		Connection connect = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
        System.out.println("conn Available");
       
        //Get Clubs List
        PreparedStatement statement = (PreparedStatement) connect.prepareStatement("SELECT * FROM club_data.club_list");
        ResultSet data = statement.executeQuery();
        
        PreparedStatement statement1 = (PreparedStatement) connect.prepareStatement("SELECT COUNT(*) AS rowcount FROM club_data.club_list");
        ResultSet r = statement1.executeQuery();
        r.next();
        int count = r.getInt("rowcount");
        r.close();
        columns = count;
        
        clubs = new String[columns+1];
        clubs[clubs.length-1] = "Aa";
        while (data.next()){
        	for (int i = 0; i < columns; i++){
        		if (clubs[i] == null){
        			clubs[i] = (String) data.getObject("club_name");
        			i = columns;
        		}
        	}  	
        }
        Arrays.sort(clubs);
        clubs[0] = "Select Club";
        System.out.println(Arrays.toString(clubs));     
        
        statement.close();
	}
	
	public static void getVendorList(String connectionUrl, String dbUser, String dbPwd) throws SQLException{
		Connection connect = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
        System.out.println("conn Available");
       
        //Get Clubs List
        PreparedStatement statement = (PreparedStatement) connect.prepareStatement("SELECT * FROM club_data.vendor_list");
        ResultSet data = statement.executeQuery();
        
        PreparedStatement statement1 = (PreparedStatement) connect.prepareStatement("SELECT COUNT(*) AS rowcount FROM club_data.vendor_list");
        ResultSet r = statement1.executeQuery();
        r.next();
        int count = r.getInt("rowcount");
        r.close();
        columns = count;
        
        vendors = new String[columns+1];
        vendors[vendors.length-1] = "Aa";
        while (data.next()){
        	for (int i = 0; i < columns; i++){
        		if (vendors[i] == null){
        			vendors[i] = (String) data.getObject("vendor_name");
        			i = columns;
        		}
        	}  	
        }
        Arrays.sort(vendors);
        vendors[0] = "Select Vendor";
        System.out.println(Arrays.toString(vendors));     
        
        statement.close();
	}
	
	public static void updateVendorList() throws SQLException{
		String query = " insert into club_data.vendor_list (vendor_name, vendor_address, vendor_state, vendor_city, vendor_zipcode, vendor_phone, vendor_fax)"
		          + " values (?, ?, ?, ?, ?, ?, ?)";
		        // create the mysql insert preparedstatement       
		        PreparedStatement preparedStmt = conn.prepareStatement(query);
		        preparedStmt.setString (1, AddVendor.EnterVendors.getText());
		        preparedStmt.setString (2, AddVendor.StreetAddress.getText());
		        preparedStmt.setString (3, String.valueOf(AddVendor.VendorState.getSelectedItem()));//
		        preparedStmt.setString (4, AddVendor.VendorCity.getText());
		        preparedStmt.setInt    (5, Integer.parseInt(AddVendor.VendorZipCode.getText()));//
		        preparedStmt.setString (6, AddVendor.phoneentry.getText());//
		        preparedStmt.setString (7, AddVendor.faxentry.getText());//

		        // execute the preparedstatement
		        preparedStmt.execute();
		        
		        conn.close();
	}
}
