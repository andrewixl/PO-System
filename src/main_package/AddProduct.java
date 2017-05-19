package main_package;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main_package.StartOptions.Action2.Action4;

public class AddProduct {
	public static JPanel panel = new JPanel();

	public static double quantity;
	public static double unitcost;
	public static double subtotal;
	public static double shipping;
	public static double tax;
	public static double finalcost;
	
	public static String currentVendor;
	public static String productNumber;
	public static String productDescription;
	
	public static JFrame addproductframe = new JFrame();
	public static JComboBox selectVendor = new JComboBox<String>(CoreVariables.vendors);
	public static JTextField textfield = new JTextField(" ", 2);
	public static JTextField pntf = new JTextField(" ", 2);
	public static JTextField pdtf = new JTextField(" ", 2);
	public static JTextField unitcosttb = new JTextField(" ", 2);
	public static JTextField shippingtb = new JTextField(" ", 2);
	public static JTextField subtotaltb = new JTextField(" ", 2);
	public static JTextField taxtb = new JTextField(" ", 2);
	public static JTextField finalcosttb = new JTextField(" ", 2);
	
	public static JLabel invalid = new JLabel("*");
	public static JLabel invalid2 = new JLabel("*");
	public static JLabel invalid3 = new JLabel("*");
	
	public static BigDecimal shippingval;
	public static BigDecimal taxval;
	public static BigDecimal finalcostval;
	

	public static void createPurchaseWindow()
	{
		//creates new window
		StartOptions.options.dispose();
		Main.currentFrame = "addproductframe";
		addproductframe.setVisible(true);
	    addproductframe.setSize(1925,1025);
	    addproductframe.add(panel);
	    panel.setLayout(null);
	    
	    //creates vendor label
	    JLabel vendorlabel = new JLabel ("Select Product Vendor:");
	    vendorlabel.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    //label.setBounds(left right,up down,width,height);
	    vendorlabel.setBounds(100,100,250,50);
	    panel.add(vendorlabel);
	    
	    //creates new JComboBox
	    selectVendor.setFont(new Font("Sans Serif", Font.PLAIN, 15));
	    selectVendor.setBounds(100,150,250,50);
	    panel.add(selectVendor);	    
	    
	    //creates product label
	    JLabel label = new JLabel("Add Product:");
	    label.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    label.setBounds(100,250,250,50);
	    panel.add(label);
	    
	    //creates new backbutton
	    JButton backbutton = new JButton("Back");
	    panel.add(backbutton);
	    backbutton.setBounds(800,850,100,50);
	    backbutton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    //adds action listener for button4
	    backbutton.addActionListener (new Action4());
	    
	    //creates quantity label
	    JLabel label2 = new JLabel("QTY:");
	    label2.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    label2.setBounds(200,300,50,50);
	    panel.add(label2);
	    
	    //creates quantity text box
	    textfield.setBounds(200,350,50,50);
	    textfield.setFont(new Font("Sans Serif", Font.PLAIN, 17));
	    panel.add(textfield);
	    
	    //creates product number label
	    JLabel prnl = new JLabel("Product Number:");
	    prnl.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    prnl.setBounds(300,300,250,50);
	    panel.add(prnl);
	    
	    //creates product number text box 
	    pntf.setBounds(300,350,250,50);
	    pntf.setFont(new Font("Sans Serif", Font.PLAIN, 17));
	    panel.add(pntf);
	    
	  //creates product description label
	    JLabel prdl = new JLabel("Product Description:");
	    prdl.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    prdl.setBounds(600,300,250,50);
	    panel.add(prdl);
	    
	    //creates product description text box
	    pdtf.setBounds(600,350,850,50);
	    pdtf.setFont(new Font("Sans Serif", Font.PLAIN, 17));
	    panel.add(pdtf);
	    
	    //creates unit cost label
	    JLabel unitcostl = new JLabel("Unit Cost:");
	    unitcostl.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    unitcostl.setBounds(200,400,100,50);
	    panel.add(unitcostl);
	    
	    //creates unit cost text box
	    unitcosttb.setBounds(200,450,100,50);
	    unitcosttb.setFont(new Font("Sans Serif", Font.PLAIN, 17));
	    panel.add(unitcosttb);
	    
	    //creates Subtotal label
	    JLabel subtotall = new JLabel("Subtotal:");
	    subtotall.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    subtotall.setBounds(350,400,100,50);
	    panel.add(subtotall);
	    
	    //creates Subtotal text box
	    subtotaltb.setBounds(350,450,100,50);
	    panel.add(subtotaltb);
	    subtotaltb.setEditable(false);
	    
	    //creates tax label
	    JLabel taxl = new JLabel("Tax:");
	    taxl.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    taxl.setBounds(500,400,100,50);
	    panel.add(taxl);
	    
	    //creates tax text box
	    taxtb.setBounds(500,450,100,50);
	    taxtb.setFont(new Font("Sans Serif", Font.PLAIN, 17));
	    panel.add(taxtb);
	    taxtb.setEditable(false);
	    
	    //creates shipping label
	    JLabel shippingl = new JLabel("Shipping:");
	    shippingl.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    shippingl.setBounds(650,400,100,50);
	    panel.add(shippingl);
	    
	    //creates shipping text box
	    shippingtb.setBounds(650,450,100,50);
	    panel.add(shippingtb);
	    shippingtb.setEditable(false);
	    
	    //creates final cost label
	    JLabel finalcostl = new JLabel("Final Cost:");
	    finalcostl.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    finalcostl.setBounds(800,400,100,50);
	    panel.add(finalcostl);
	    
	    //creates final cost text box
	    finalcosttb.setBounds(800,450,100,50);
	    panel.add(finalcosttb);
	    finalcosttb.setEditable(false);
	    
	    //creates new calculate button
	    JButton calcbutton = new JButton("Calculate");
	    panel.add(calcbutton);
	    calcbutton.setBounds(950,850,150,50);
	    calcbutton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    //adds action listener for calcbutton
	    calcbutton.addActionListener (new Action5());
	    //will need to be fixed in the future (relates to invalid try catch creating invalid(2) jlabel)
	    calcbutton.addActionListener (new Action5());
	    
	    //creates add vendor button
	    JButton addVendor = new JButton("Add Vendor");
	    panel.add(addVendor);
	    addVendor.setBounds(400,150,150,50);
	    addVendor.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    addVendor.addActionListener (new Action7());
	    
	    //creates confirm button
	    JButton confirm = new JButton("Confirm");
	    panel.add(confirm);
	    confirm.setBounds(1150,850,150,50);
	    confirm.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    confirm.addActionListener (new Action6());
	}
	private static BigDecimal truncateDecimal(double x,int numberofDecimals)
	{
	    if ( x > 0) {
	        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
	    } else {
	        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
	    }
	}
	
	public static void calculateSubtotal()
	{
		try {
			invalid.setVisible(false);
			quantity = Double.parseDouble(textfield.getText());
		} catch (NumberFormatException e) {
			invalid.setVisible(true);
			invalid.setForeground(Color.red);
			invalid.setFont(new Font("Sans Serif", Font.PLAIN, 40));
			invalid.setBounds(170,355,100,50);
			panel.add(invalid);
		}
		try {
			invalid2.setVisible(false);
			unitcost = Double.parseDouble(unitcosttb.getText());
		} catch (NumberFormatException e) {
			invalid2.setVisible(true);
			invalid2.setForeground(Color.red);
			invalid2.setFont(new Font("Sans Serif", Font.PLAIN, 40));
			invalid2.setBounds(170,455,100,50);
			panel.add(invalid2);
		}	
		subtotal = (quantity*unitcost);
		subtotaltb.setVisible(false);
		JTextField subtotaltb = new JTextField(("$" + String.valueOf(subtotal)),2);
		subtotaltb.setBounds(350,450,100,50);
		subtotaltb.setFont(new Font("Sans Serif", Font.PLAIN, 17));
		panel.add(subtotaltb);
		subtotaltb.setEditable(false);
	}
	public static void calculateTax()
	{
		tax = (subtotal+shipping)*0.095;
		taxval = truncateDecimal((subtotal+shipping)*0.095,2);
		String tax2 = "$" + String.valueOf(taxval);
		taxtb.setVisible(false);
		 
		//Calculates Tax Text Box
		 JTextField taxtb = new JTextField(tax2,2);
		 taxtb.setBounds(500,450,100,50);
		 taxtb.setFont(new Font("Sans Serif", Font.PLAIN, 17));
		 panel.add(taxtb);
		 taxtb.setEditable(false);
	}
	public static void calculateShipping()
	{
		shipping = subtotal*0.1;
		shippingval = truncateDecimal(subtotal*0.1,2);
		String shipping2 = "$" + String.valueOf(shippingval);
		shippingtb.setVisible(false);
		
		//Calculates Shipping Text Box
		JTextField shippingtb = new JTextField(shipping2, 2);
	    shippingtb.setBounds(650,450,100,50);
	    shippingtb.setFont(new Font("Sans Serif", Font.PLAIN, 17));
	    panel.add(shippingtb);
	    shippingtb.setEditable(false);
	}
	public static void calculateFinalCost()
	{
		finalcost = subtotal + tax + shipping;
		finalcostval = truncateDecimal(finalcost, 2);
		String finalcost2 = "$" + String.valueOf(finalcostval);
		finalcosttb.setVisible(false);
		JTextField finalcosttb = new JTextField(finalcost2, 2);
		finalcosttb.setBounds(800,450,100,50);
	    finalcosttb.setFont(new Font("Sans Serif", Font.PLAIN, 17));
	    panel.add(finalcosttb);
	    finalcosttb.setEditable(false);
	}
	public static void setCurrentVendor(String str)
	{
		currentVendor = str;
	}
	public static void checkVendor()
	{
		String currentVendor = String.valueOf(selectVendor.getSelectedItem());
		setCurrentVendor(currentVendor);
		invalid3.setVisible(false);
		if (currentVendor.equals("Select Vendor"))
		{
			invalid3.setVisible(true);
			invalid3.setForeground(Color.red);
			invalid3.setFont(new Font("Sans Serif", Font.PLAIN, 40));
			invalid3.setBounds(75,160,250,50);
			panel.add(invalid3);
		}
	}
	public static void setProductNumberAndDescription()
	{
		productNumber = pntf.getText();
		productDescription = pdtf.getText();
	}
	/*public static void addToSpreadsheet() throws Exception
	{
		FileInputStream fstream = new FileInputStream(variables.filepath);
		Workbook wb = new Workbook(fstream);
		Worksheet sheet = wb.getWorksheets().get(0);
		
		Cell cellA2 = sheet.getCells().get("A2");
		cellA2.setValue(currentVendor);
		wb.save(variables.filepath , SaveFormat.ODS);
		
		Cell cellB2 = sheet.getCells().get("B2");
		cellB2.setValue(quantity);
		wb.save(variables.filepath , SaveFormat.ODS);
		
		Cell cellC2 = sheet.getCells().get("C2");
		cellC2.setValue(productNumber);
		wb.save(variables.filepath , SaveFormat.ODS);
		
		Cell cellD2 = sheet.getCells().get("D2");
		cellD2.setValue(productDescription);
		wb.save(variables.filepath , SaveFormat.ODS);
		
		Cell cellE2 = sheet.getCells().get("E2");
		cellE2.setValue(unitcost);
		wb.save(variables.filepath , SaveFormat.ODS);
		
		Cell cellF2 = sheet.getCells().get("F2");
		cellF2.setValue(subtotal);
		wb.save(variables.filepath , SaveFormat.ODS);
		
		Cell cellG2 = sheet.getCells().get("G2");
		cellG2.setValue(tax);
		wb.save(variables.filepath , SaveFormat.ODS);
		
		Cell cellH2 = sheet.getCells().get("H2");
		cellH2.setValue(shipping);
		wb.save(variables.filepath , SaveFormat.ODS);
		
		Cell cellI2 = sheet.getCells().get("I2");
		cellI2.setValue(finalcost);
		wb.save(variables.filepath , SaveFormat.ODS);
	}*/
	static class Action5 implements ActionListener {        
		  public void actionPerformed (ActionEvent e) { 
			  checkVendor();
			  calculateSubtotal();	
			  calculateShipping();
			  calculateTax();
			  calculateFinalCost();
			  checkVendor();
			  setProductNumberAndDescription();
			  try {
				//createSpreadsheet.createSpreadsheet();
			} catch (Exception e1) {
				System.out.print("Bad Code");
			}
		  }
		} 
	static class Action6 implements ActionListener {        
		  public void actionPerformed (ActionEvent e){ 
			  try {
				//addToSpreadsheet();
			} catch (Exception exc) {
				System.out.print("Code Failure");
			}
		  }
		} 
	static class Action7 implements ActionListener {        
		  public void actionPerformed (ActionEvent e){ 
			//VendorManagement.createVendorFrame();
			  try {
				AddVendor.createVendorFrame();
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		  }
		} 
}
