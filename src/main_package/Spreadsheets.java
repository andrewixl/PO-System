package main_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class Spreadsheets {
	public static void createSpreadsheet() throws Exception
	{	 
		//Test for Expenses Spreadsheet Existing
		try{
			FileInputStream fstream = new FileInputStream(Main.expensesfilepath);
			Workbook wb = new Workbook(fstream);
			Worksheet sheet = wb.getWorksheets().get(0);
			wb.save(Main.expensesfilepath, SaveFormat.ODS);
		}
		catch (FileNotFoundException exc){
			Workbook filecreation = new Workbook();
			filecreation.save(Main.expensesfilepath, SaveFormat.ODS);
		}
	}
}
 