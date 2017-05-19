package main_package;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;


	public class AddVendor {
		public static JFormattedTextField phoneentry;
	    public static JFormattedTextField faxentry;
	    public static MaskFormatter phoneformat;
	public static void createVendorFrame() throws ParseException {
			
			JFrame Vendorframe = new JFrame();
			JPanel panel = new JPanel();
			Vendorframe.setExtendedState(Vendorframe.getExtendedState() | JFrame.MAXIMIZED_BOTH);
			Vendorframe.setBounds(1000, 1000, 1000, 1000);
			Vendorframe.add(panel);
			Vendorframe.setVisible(true);
			panel.setLayout(null);
			
			JLabel EnterVendorName = new JLabel ("Enter Vendor Name:");
			EnterVendorName.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    //label.setBounds(left right,up down,width,height);
			EnterVendorName.setBounds(100,100,250,50);
		    panel.add(EnterVendorName);
		    
		    JTextField EnterVendors = new JTextField();
		    EnterVendors.setBounds(100, 150, 300, 50);
		    panel.add(EnterVendors);
		    
		    JLabel VendorStreet = new JLabel ("Vendor Street Address:");
			VendorStreet.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    //label.setBounds(left right,up down,width,height);
			VendorStreet.setBounds(100,225,250,50);
		    panel.add(VendorStreet);
		    
		    JTextField StreetAddress = new JTextField ();
		    StreetAddress.setBounds(100, 275, 1000, 50);
		    panel.add(StreetAddress);
		    
		    JLabel State = new JLabel ("State:");
			State.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    //label.setBounds(left right,up down,width,height);
			State.setBounds(100,350,100,50);
		    panel.add(State);
		    
		    
		    Array.sort(CoreVariables.states);
		    JComboBox VendorState = new JComboBox(CoreVariables.states);
		    VendorState.setBounds(100, 400, 200, 50);
		    panel.add(VendorState);
		    
		    JLabel City = new JLabel ("City:");
			City.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    //label.setBounds(left right,up down,width,height);
			City.setBounds(350,350,100,50);
		    panel.add(City);
		    
		    JTextField VendorCity = new JTextField ();
		    VendorCity.setBounds(350,400, 200, 50);
		    panel.add(VendorCity);
		    
		    JLabel ZipCode = new JLabel ("Zip Code:");
		    ZipCode.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    //label.setBounds(left right,up down,width,height);
		    ZipCode.setBounds(600,350,200,50);
		    panel.add(ZipCode);
		    
		    JTextField VendorZipCode = new JTextField ();
		    VendorZipCode.setBounds(600, 400, 100, 50);
		    panel.add(VendorZipCode);
		    
		  //creates new phone label
		    JLabel phonelb = new JLabel("Enter Vendor Phone Number:");
		    phonelb.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    phonelb.setBounds(100,500,300,50);
		    panel.add(phonelb);
		    
		    //create new phone entry textbox
		    phoneformat = new MaskFormatter("(###) ###-####");
		    phoneentry = new JFormattedTextField(phoneformat);
		    phoneentry.setFont(new Font("Sans Serif", Font.PLAIN, 25));
		    phoneentry.setBounds(100,550,250,50);
		    panel.add(phoneentry);
		    
		    //creates new fax label
		    JLabel faxlb = new JLabel("Enter Vendor Fax Number:");
		    faxlb.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    faxlb.setBounds(400,500,300,50);
		    panel.add(faxlb);
		    
		    //create new fax entry textbox
		    faxentry = new JFormattedTextField(phoneformat);
		    faxentry.setFont(new Font("Sans Serif", Font.PLAIN, 25));
		    faxentry.setBounds(400,550,250,50);
		    panel.add(faxentry);
		    
		    JButton addbutton = new JButton("Add");
		    panel.add(addbutton);
		    addbutton.setBounds(800,850,100,50);
		    addbutton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    //adds action listener for button4
		    //addbutton.addActionListener (new ActionAdd());
		    
		    JButton backButton = new JButton("Back");
		    panel.add(backButton);
		    backButton.setBounds(650, 850, 100, 50);
		    backButton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    backButton.addActionListener(new Action11());
		}	
	static class Action11  implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			AddProduct.createPurchaseWindow();
		}
		
	
}
		

}
