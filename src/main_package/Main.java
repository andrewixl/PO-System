package main_package;

public class Main {
	public static String clubfilepath = ("C:\\Users\\burge\\workspace\\PO System\\resources\\Club_List.ods");
	public static String vendorfilepath = ("C:\\Users\\burge\\workspace\\PO System\\resources\\Vendor_List.ods");
	public static String expensesfilepath = ("C:\\Users\\burge\\workspace\\PO System\\resources\\Expenses.ods");
	
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
