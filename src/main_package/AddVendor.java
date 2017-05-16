package main_package;

import java.awt.Font;
import java.util.Arrays;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class AddVendor {
	public static void createVendorFrame() {
			
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
		    
		    JLabel VendorStreet = new JLabel ("Vendor Street Address");
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
		    
		    Arrays.sort(CoreVariables.states);
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
		    
		    JLabel ZipCode = new JLabel ("Zip Code");
		    ZipCode.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    //label.setBounds(left right,up down,width,height);
		    ZipCode.setBounds(800,350,100,50);
		    panel.add(ZipCode);
		    
		    JTextField VendorZipCode = new JTextField ();
		    VendorZipCode.setBounds(700, 400, 100, 50);
		    panel.add(VendorZipCode);
		    
		}	

		

}
