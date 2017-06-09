	package main_package;

public class Main {
	public static String currentFrame = "addclub";
	public static String fonttype;
	
	//Andrew's Path Code for Resources
	public static String clubfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resources\\Club_List.ods");
	public static String vendorfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resources\\Vendor_List.ods");
	public static String expensesfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resources\\Expenses.ods");
	public static String localfilepath = ("C:\\Users\\burge\\workspace\\Skyline-Spartabots-PO-System\\PO-System\\resources\\local.ods");
	
	
	//Roger's Path Code for Resources
	//public static String clubfilepath = ("C:\\Users\\linrog18\\Documents\\PO-System\\resources\\Club_List.ods");
	//public static String vendorfilepath = ("C:\\Users\\linrog18\\Documents\\PO-System\\resources\\Vendor_List.ods");
	//public static String expensesfilepath = ("C:\\Users\\linrog18\\Documents\\PO-System\\resources\\Expenses.ods");
	//public static String localfilepath = ("C:\\Users\\linrog18\\Documents\\PO-System\\resources\\local.ods");
	
	//Julia's Path Code for Resources
	//public static String clubfilepath = ("/Users/juliapinx/Documents/GitHub/PO-System/resources/Club_List.ods");
	//public static String vendorfilepath = ("/Users/juliapinx/Documents/GitHub/PO-System/resources/Vendor_List.ods");
	//public static String expensesfilepath = ("/Users/juliapinx/Documents/GitHub/PO-System/resources/Expenses.ods");
	//public static String localfilepath = ("/Users/juliapinx/Documents/GitHub/PO-System/resources/local.ods");
		
	public static void main(String[] args) throws Exception
	{
		SQLServer.getconnection();
		CoreVariables.getCurrentFont();
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