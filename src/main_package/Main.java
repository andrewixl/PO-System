	package main_package;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;

public class Main {
	public static String currentFrame = "addclub";
	public static String fonttype;
	public static JFrame loadingframe = new JFrame("PO System");
	
	//Andrew's Path Code for Resources
	//public static String expensesfilepath = ("C:\\Program Files (x86)\\PO-System\\Expenses.ods");
	//public static String localfilepath = ("C:\\Program Files (x86)\\PO-System\\local.ods");
	
	//Roger's Path Code for Resources
	public static String expensesfilepath = ("C:\\Users\\linrog18\\Documents\\PO-System\\resources\\Expenses.ods");
	public static String localfilepath = ("C:\\Users\\linrog18\\Documents\\PO-System\\resources\\local.ods");
	
	//Julia's Path Code for Resources
	//public static String expensesfilepath = ("/Users/juliapinx/Documents/GitHub/PO-System/resources/Expenses.ods");
	//public static String localfilepath = ("/Users/juliapinx/Documents/GitHub/PO-System/resources/local.ods");
		
	public static void main(String[] args) throws Exception
	{
		loadingframe();
		SQLServer.getconnection();
		System.out.println(SQLServer.connection);
		
		if(SQLServer.connection.equals("true")){
			System.out.println("wtf");
		CoreVariables.getCurrentFont();
		loadingframe.dispose();
		start();
		}
		else{
			loadingframe.dispose();
			nointernetframe();
		}
	}
	public static void start() throws Exception
	{
		//label.setBounds(left right,up down,width,height);
		Spreadsheets instance = new Spreadsheets();
		instance.createSpreadsheet();
		
		Select_Club.selectClub();
	}
	public static void loadingframe(){
		JPanel panel = new JPanel();
		loadingframe.setBounds(500,500,500,500);
		loadingframe.add(panel);
		loadingframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loadingframe.setVisible(true);
	    panel.setLayout(null);
		
		JLabel loadinglabel4 = new JLabel("Please Wait");
	    loadinglabel4.setFont(new Font(Main.fonttype, Font.PLAIN, 15));
	    loadinglabel4.setBounds(200,200,250,50);
	    loadinglabel4.setVisible(true);
		panel.add(loadinglabel4);
	}
	
	public static void nointernetframe(){
		JPanel panel = new JPanel();
		loadingframe.setBounds(500,500,500,500);
		loadingframe.add(panel);
		loadingframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loadingframe.setVisible(true);
	    panel.setLayout(null);
		
		JLabel loadinglabel = new JLabel("No Connection Availible\nPlease Check Internet Connection");
	    loadinglabel.setFont(new Font(Main.fonttype, Font.PLAIN, 15));
	    loadinglabel.setBounds(200,200,250,50);
	    loadinglabel.setVisible(true);
		panel.add(loadinglabel);
	}

}