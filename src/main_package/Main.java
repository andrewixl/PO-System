	package main_package;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static String currentFrame = "addclub";
	public static String fonttype;
	public static JFrame loadingframe = new JFrame("PO System");
	
	//Andrew's Path Code for Resources
	public static String expensesfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resources\\Expenses.ods");
	public static String localfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resources\\local.ods");
	
	
	//Roger's Path Code for Resources
	//public static String expensesfilepath = ("C:\\Users\\linrog18\\Documents\\PO-System\\resources\\Expenses.ods");
	//public static String localfilepath = ("C:\\Users\\linrog18\\Documents\\PO-System\\resources\\local.ods");
	
	//Julia's Path Code for Resources
	//public static String expensesfilepath = ("/Users/juliapinx/Documents/GitHub/PO-System/resources/Expenses.ods");
	//public static String localfilepath = ("/Users/juliapinx/Documents/GitHub/PO-System/resources/local.ods");
		
	public static void main(String[] args) throws Exception
	{
		loadingframe();
		SQLServer.getconnection();
		CoreVariables.getCurrentFont();
		loadingframe.dispose();
		start();
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

}