package main_package;

import java.awt.Color;
import java.awt.Font;
import java.io.FileInputStream;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.text.ParseException;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class Add_Club {
	
	public static JFrame addClubFrame = new JFrame();
	public static JLabel error=new JLabel("*");
	public static JPanel errorPanel=new JPanel();
	
	public static void addClub() throws Exception{
		FileInputStream fstream = new FileInputStream(Main.clubfilepath);
		Workbook wb = new Workbook(fstream);
		Worksheet sheet = wb.getWorksheets().get(0);
		
		JPanel panel = new JPanel();
		addClubFrame.setBounds(500,500,500,500);
		addClubFrame.add(panel);
		addClubFrame.setExtendedState(addClubFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	    panel.setLayout(null);
	    addClubFrame.setVisible(false);
	    addClubFrame.setVisible(true);
	    
	    
	    JLabel clubNameLabel = new JLabel("Offical Club Name:");
		JTextField clubNameField = new JTextField();
		setFont(clubNameLabel, clubNameField);
		clubNameLabel.setBounds(100,100,250,50);
		clubNameField.setBounds(100,150,250,50);
		panel.add(clubNameLabel);
		panel.add(clubNameField);
		checkError(clubNameField);
		
		JLabel advisorNameLabel = new JLabel("Advisor Name:");
	    JTextField advisorNameField = new JTextField();
	    setFont(advisorNameLabel, advisorNameField);
	    advisorNameLabel.setBounds(400,100,250,50);
		advisorNameField.setBounds(400,150,250,50);
		panel.add(advisorNameLabel);
	    panel.add(advisorNameField);
	    checkError(advisorNameField); 
	    
	    JLabel advisorEmailLabel = new JLabel("Advisor Email:");
	    JTextField advisorEmailField = new JTextField("@issaquah.wednet.edu");
	    setFont(advisorEmailLabel, advisorEmailField);
	    advisorEmailLabel.setBounds(700,100,250,50);
	    advisorEmailField.setBounds(700,150,250,50);
	    panel.add(advisorEmailLabel);
	    panel.add(advisorEmailField); 
	    checkError(advisorEmailField);
	    
	    JLabel asbAccountNameLabel = new JLabel("ASB Account Name:");
	    JTextField asbAccountNameField = new JTextField();
	    setFont(asbAccountNameLabel, asbAccountNameField);
	    asbAccountNameLabel.setBounds(100,200,250,50);
	    asbAccountNameField.setBounds(100,250,250,50);
	    panel.add(asbAccountNameLabel);
	    panel.add(asbAccountNameField);
	    checkError(asbAccountNameField);
	    
	    JLabel asbAccountNumberLabel = new JLabel("ASB Account Number:");
	    JTextField asbAccountNumberField = new JTextField();
	    setFont(asbAccountNumberLabel, asbAccountNumberField);
	    asbAccountNumberLabel.setBounds(400,200,250,50);
	    asbAccountNumberField.setBounds(400,250,250,50);
	    panel.add(asbAccountNumberLabel);
	    panel.add(asbAccountNumberField);
	    checkClubInt(asbAccountNumberField);
	}
	
	
	public static void setFont(JLabel label, JTextField field){
		label.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		field.setFont(new Font("Sans Serif", Font.PLAIN, 15));
	}
	public static void checkClubInt(JTextField field){
		int integer;
		try{
			error.setVisible(false);
			integer=Integer.parseInt(field.getText());
		}catch(NumberFormatException e){
			error.setVisible(true);
			error.setFont(new Font("Sans Serif", Font.PLAIN, 40));
			error.setForeground(Color.red);
			error.setBounds(200,250,250,50);
			errorPanel.add(error);
		}
	}
	public static void checkError(JTextField field){
		Scanner input=new Scanner(field.getText());
		try{
			error.setVisible(false);
			input.nextLine();
		}catch (NumberFormatException e){
			error.setVisible(true);
			error.setFont(new Font("Sans Serif", Font.PLAIN, 40));
			error.setForeground(Color.red);
			error.setBounds(200,250,250,50);
			errorPanel.add(error);
		}
	}
}
