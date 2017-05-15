package main_package;

import java.awt.Font;
import java.util.Arrays;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class AddVendor {
		public static JComboBox<String> EnterVendors;
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
		    
		    EnterVendors = new JComboBox(CoreVariables.vendors);
		    EnterVendors.setBounds(100, 150, 250, 50);
		    panel.add(EnterVendors);
		    
		    JLabel VendorStreet = new JLabel ("Vendor Street Address");
			VendorStreet.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    //label.setBounds(left right,up down,width,height);
			VendorStreet.setBounds(100,225,250,50);
		    panel.add(VendorStreet);
		    
		    JTextField StreetAddress = new JTextField ();
		    StreetAddress.setBounds(100, 275, 400, 50);
		    panel.add(StreetAddress);
		    
		    JLabel State = new JLabel ("State:");
			State.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    //label.setBounds(left right,up down,width,height);
			State.setBounds(100,350,100,50);
		    panel.add(State);
		    
		    Arrays.sort(CoreVariables.states);
		    JComboBox VendorState = new JComboBox(CoreVariables.states);
		    VendorState.setBounds(100, 400, 250, 50);
		    panel.add(VendorState);
		    
		}	

		

}
