package main_package;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class editVendors extends JFrame
{
	public static void main(String[] args){
		createTable();
	}
    public editVendors() throws Exception
    {
        
    	/*FileInputStream fstream = new FileInputStream(variables.filepath);
		Workbook wb = new Workbook(fstream);
		Worksheet sheet = wb.getWorksheets().get(0);
		Cells cells = sheet.getCells();
		GetVendorCell.vendorcell(sheet);
    	//headers for the table*/
        String[] columns = new String[] {
            "Vendor Name", "Address", "State", "City", "Zipcode", "Phone Number", "Fax Number"
        };
         
        //actual data for the table in a 2d array
        Object[/*row*/][/*col*/] data = new Object[9][7];//{//; //{
        	
        	
        	/*for (int i = 0; i < GetVendorCell.vendorcells.length-1; i++)
        	{
        		String area = GetVendorCell.vendorcells[i+1];
        		String[] sep = area.split("");
        		Cell fin0 = cells.get("A" + sep[1]);
        		Cell fin1 = cells.get("B" + sep[1]);
        		Cell fin2 = cells.get("C" + sep[1]);
        		Cell fin3 = cells.get("D" + sep[1]);
        		Cell fin4 = cells.get("E" + sep[1]);
        		Cell fin5 = cells.get("F" + sep[1]);
        		Cell fin6 = cells.get("G" + sep[1]);
        		Cell fin7 = cells.get("H" + sep[1]);
        		Cell fin8 = cells.get("I" + sep[1]);
        		Object[] info = {fin1.getValue(), fin2.getValue(), fin3.getValue(), fin4.getValue(), fin5.getValue(), fin6.getValue(), fin7.getValue(), fin8.getValue(), ""};
        		data[i] = info;
           	}*/
        	
        //create table with data
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Vendor Details");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
        this.setFont(new Font("Sans Serif", Font.PLAIN, 40));
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
    }
     
    public static void createTable()
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
					new editVendors();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }   
}