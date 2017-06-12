package main_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import com.mysql.jdbc.PreparedStatement;

public class SQLServer {
	public static int columns;
	public static String[] clubs;
	public static Connection getconnection(){
	     String connectionUrl = "jdbc:mysql://posystem.ctaljdp4qkel.us-west-2.rds.amazonaws.com:3306";
	        String dbUser = "andrewixl";
	        String dbPwd = "delorean1107";
	        Connection conn = null;

	        try {
	        	Connection connect = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
	            System.out.println("conn Available");
	            PreparedStatement statement = (PreparedStatement) connect.prepareStatement("SELECT * FROM club_data.club_list");
	            ResultSet data = statement.executeQuery();
	            
	            PreparedStatement statement1 = (PreparedStatement) connect.prepareStatement("SELECT COUNT(*) AS rowcount FROM club_data.club_list");
	            ResultSet r = statement1.executeQuery();
	            r.next();
	            int count = r.getInt("rowcount");
	            r.close();
	            columns = count;
	            
	            clubs = new String[columns];
	            while (data.next()){
	            	for (int i = 0; i < columns; i++){
	            		if (clubs[i] == null){
	            			clubs[i] = (String) data.getObject("club_name");
	            			i = columns;
	            		}
	            	}  	
	            }
	            System.out.println(Arrays.toString(clubs));
	            
	            statement.close();
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	            System.out.println("fetch option error"+e.getLocalizedMessage());
	        }

	        return conn;
	}   
}
