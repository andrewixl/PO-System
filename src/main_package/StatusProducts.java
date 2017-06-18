package main_package;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class StatusProducts {
	public static JFrame statusProducts  = new JFrame();
	public static JPanel panel = new JPanel();
	
	public static JComboBox Vendors = new JComboBox<String>(SQLServer.vendors);
	
	public static UtilDateModel modelStart = new UtilDateModel();
	public static JDatePanelImpl datePanelStart = new JDatePanelImpl(modelStart);
	//public static JDatePickerImpl datePickerStart = new JDatePickerImpl(datePanelStart); 
	public static JDatePickerImpl datePickerStart = new JDatePickerImpl(datePanelStart);
	
	public static UtilDateModel modelEnd = new UtilDateModel();
	public static JDatePanelImpl datePanelEnd = new JDatePanelImpl(modelEnd);
	public static JDatePickerImpl datePickerEnd = new JDatePickerImpl(datePanelEnd); 
	
	public static void statusProducts(){
		
		statusProducts.setVisible(true);
		statusProducts.setExtendedState(statusProducts.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		statusProducts.add(panel);
		panel.setLayout(null);
		
		JButton back = new JButton("Back");
		back.setFont(new Font(Main.fonttype, Font.PLAIN, 15));
		back.setBounds(800,850,100,50);
		back.setVisible(true);
		panel.add(back);
		back.addActionListener (new back());
		
		JButton viewstatus = new JButton("View Status");
		viewstatus.setFont(new Font(Main.fonttype, Font.PLAIN, 15));
		viewstatus.setBounds(950,850,150,50);
		viewstatus.setVisible(true);
		panel.add(viewstatus);
		viewstatus.addActionListener (new viewstatus());
		
		Vendors.setFont(new Font(Main.fonttype, Font.PLAIN, 15));
		Vendors.setBounds(100,150,250,50);
		panel.add(Vendors);
		
		JLabel vendorlabel = new JLabel ("Select Vendor:");
		vendorlabel.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		//label.setBounds(left right,up down,width,height);
		vendorlabel.setBounds(100,100,250,50);
		panel.add(vendorlabel);
		
		JLabel startlabel = new JLabel ("Select Start Date:");
		startlabel.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		//label.setBounds(left right,up down,width,height);
		startlabel.setBounds(400,100,250,50);
		panel.add(startlabel);
		
		JLabel endlabel = new JLabel ("Select End Date:");
		endlabel.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		//label.setBounds(left right,up down,width,height);
		endlabel.setBounds(700,100,250,50);
		panel.add(endlabel);
		
		//Start
		modelStart.setDate(2017, 6, 1);
		modelStart.setSelected(true);
		datePickerStart.setBounds(400,150,250,50);
		panel.add(datePickerStart);
		
		//End
		modelEnd.setDate(2017, 6, 1);
		modelEnd.setSelected(true);
		datePickerEnd.setBounds(700,150,250,50);
		panel.add(datePickerEnd);
	}
	static class back  implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			statusProducts.dispose();
			StartOptions.startOptions((String) Select_Club.ClubList.getSelectedItem());
		}	
	}
	static class viewstatus  implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Date selectedDate = (Date) datePickerStart.getModel().getValue();
			String pattern  = "MM/dd/yyyy";
			DateFormat formatter = new SimpleDateFormat(pattern);
			String formatteddate = formatter.format(selectedDate);
			String[] datesplit = formatteddate.split("/");
			System.out.println(Arrays.toString(datesplit));
			
		}	
	}
}