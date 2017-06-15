package main_package;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class editVendors extends JFrame
{
    public editVendors() throws Exception
    {
        String[] columns = new String[] {
            "Vendor Name", "Address", "State", "City", "Zipcode", "Phone Number", "Fax Number"
        };
         
        //actual data for the table in a 2d array
        Object[/*row*/][/*col*/] data = new Object[9][7];{        	
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
    }}
     
    public static void createTable()
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
					new editVendors();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
    }   
}