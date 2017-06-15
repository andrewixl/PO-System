package main_package;

import java.io.FileInputStream;

import com.aspose.cells.Cell;
import com.aspose.cells.Cells;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class CoreVariables {
	public static String error = "false";
	public static String[] states = {"Aa", "California", "Alabama", "Arkansas", "Arizona", "Alaska", "Colorado", 
			"Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", 
			"Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", 
			"Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", 
			"New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", 
			"Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", 
			"Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming" };

	public static void restartProgram(){
		Select_Club.selectclubframe.dispose();
		Add_Club.addClubFrame.dispose();
		StartOptions.options.dispose();
		Settings.settingsframe.dispose();
		AddProduct.addproductframe.dispose();
		AddVendor.Vendorframe.dispose();
		try {
			Main.startprogram();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getCurrentFont() throws Exception{
		FileInputStream fstream = new FileInputStream(Main.localfilepath);
		Workbook wb = new Workbook(fstream);
		Worksheet sheet = wb.getWorksheets().get(0);
		Cells cells = sheet.getCells();
		String cellFilled = "true";
		Cell cell = cells.get("B1");
		Main.fonttype = cell.toString();
}}
