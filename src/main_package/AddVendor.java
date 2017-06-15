package main_package;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;


	public class AddVendor {
		public static JTextField EnterVendors = new JTextField();
		public static JTextField StreetAddress = new JTextField ();
		public static JComboBox VendorState;
		public static JTextField VendorCity = new JTextField ();
		public static JTextField VendorZipCode = new JTextField ();
		public static JFormattedTextField phoneentry;
	    public static JFormattedTextField faxentry;
	    public static MaskFormatter phoneformat;
	    public static JLabel error=new JLabel("*");
	    public static JLabel error2=new JLabel("*");
	    public static JPanel errorPanel=new JPanel();
	    public static JFrame Vendorframe = new JFrame();
	    public static void createVendorFrame() throws ParseException {
			
			
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
		    
		    
		    EnterVendors.setBounds(100, 150, 300, 50);
		    panel.add(EnterVendors);
		    checkVendor(EnterVendors);
		    
		    JLabel VendorStreet = new JLabel ("Vendor Street Address:");
			VendorStreet.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    //label.setBounds(left right,up down,width,height);
			VendorStreet.setBounds(100,225,250,50);
		    panel.add(VendorStreet);
		    
		    
		    StreetAddress.setBounds(100, 275, 1000, 50);
		    panel.add(StreetAddress);
		    checkIntVendor(StreetAddress);
		    
		    JLabel State = new JLabel ("State:");
			State.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    //label.setBounds(left right,up down,width,height);
			State.setBounds(100,350,100,50);
		    panel.add(State);
		    
		    Arrays.sort(CoreVariables.states);
		    String selectState = "Select State";
		    CoreVariables.states[0] = selectState;
		    VendorState = new JComboBox(CoreVariables.states);
		    VendorState.setBounds(100, 400, 200, 50);
		    panel.add(VendorState);
		    
		    JLabel City = new JLabel ("City:");
			City.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    //label.setBounds(left right,up down,width,height);
			City.setBounds(350,350,100,50);
		    panel.add(City);
		    
		    
		    VendorCity.setBounds(350,400, 200, 50);
		    panel.add(VendorCity);
		    checkVendor(VendorCity);
		    
		    JLabel ZipCode = new JLabel ("Zip Code:");
		    ZipCode.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    //label.setBounds(left right,up down,width,height);
		    ZipCode.setBounds(600,350,200,50);
		    panel.add(ZipCode);
		    
		    
		    VendorZipCode.setBounds(600, 400, 100, 50);
		    panel.add(VendorZipCode);
		    checkIntVendor(VendorZipCode);
		    
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
		    checkIntVendor(phoneentry);
		    
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
		    checkIntVendor(faxentry);
		    
		    JButton addbutton = new JButton("Add");
		    panel.add(addbutton);
		    addbutton.setBounds(800,850,100,50);
		    addbutton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    //adds action listener for button4
		    addbutton.addActionListener (new ActionAdd());
		    
		    JButton backButton = new JButton("Back");
		    panel.add(backButton);
		    backButton.setBounds(650, 850, 100, 50);
		    backButton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		    backButton.addActionListener(new Action11());

		}
	
	
	public static void checkVendor(JTextField field){
		error.setVisible(false);
		if(!field.getText().equals(null)){
			for(char check:field.getText().toCharArray()){
				if(Character.isDigit(check)){
					error.setVisible(true);
					error.setFont(new Font("Sans Serif", Font.PLAIN, 25));
					error.setForeground(Color.red);
					error.setBounds(field.getBounds());
					errorPanel.add(error);
				}
			}
		}if(field.getText().equals(null)){
			error.setVisible(true);
			error.setFont(new Font("Sans Serif", Font.PLAIN, 25));
			error.setForeground(Color.red);
			error.setBounds(field.getBounds());
			errorPanel.add(error);
		}
	}
	public static void checkIntVendor(JTextField field){
		error2.setVisible(false);
		if(!field.getText().equals(null)){
			for(char check:field.getText().toCharArray()){
				if(Character.isAlphabetic(check)){
					error2.setVisible(true);
					error2.setFont(new Font("Sans Serif", Font.PLAIN, 25));
					error2.setForeground(Color.red);
					error2.setBounds(field.getBounds());
					errorPanel.add(error2);
				}
			}
		}if(field.getText().equals(null)){
			error2.setVisible(true);
			error2.setFont(new Font("Sans Serif", Font.PLAIN, 25));
			error2.setForeground(Color.red);
			error2.setBounds(field.getBounds());
			errorPanel.add(error2);
		}
	}
	
	static class Action11  implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			AddProduct.createPurchaseWindow();
			Vendorframe.setVisible(false);
		}
		
}
	
	static class ActionAdd  implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
				SQLServer.updateVendorList();
				int n = JOptionPane.showConfirmDialog(
			            null,
			            "Would you like restart now? (Font may not show correctly otherwise)",
			            "Restart Required",
			            JOptionPane.YES_NO_OPTION);

			        if(true){
			        	CoreVariables.restartProgram();
			        }
			        else {
			            JOptionPane.showMessageDialog(null, "Restart Delayed");
			            Vendorframe.dispose();
			            AddProduct.createPurchaseWindow();
			        }     
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Bad Code");
			}
		}
	}
}
