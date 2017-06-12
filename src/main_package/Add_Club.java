package main_package;

import java.awt.Color;
import java.awt.Font;
import java.io.FileInputStream;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicSliderUI.ChangeHandler;
import java.text.ParseException;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class Add_Club {
	
	public static JFrame addClubFrame = new JFrame();
	public static JLabel error=new JLabel("*");
	public static JLabel error2=new JLabel("*");
	public static JPanel errorPanel=new JPanel();
	
	public static void addClub() throws Exception{
		//FileInputStream fstream = new FileInputStream(Main.clubfilepath);
		//Workbook wb = new Workbook(fstream);
		//Worksheet sheet = wb.getWorksheets().get(0);
		
		JPanel panel = new JPanel();
		addClubFrame.setBounds(500,500,500,500);
		addClubFrame.add(panel);
		addClubFrame.setExtendedState(addClubFrame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	    panel.setLayout(null);
	    addClubFrame.setVisible(false);
	    addClubFrame.setVisible(true);
	    
	    //Creates label and field to enter name of club
	    JLabel clubNameLabel = new JLabel("Offical Club Name:");
		JTextField clubNameField = new JTextField();
		setFont(clubNameLabel, clubNameField);
		clubNameLabel.setBounds(100,100,250,50);
		clubNameField.setBounds(100,150,250,50);
		panel.add(clubNameLabel);
		panel.add(clubNameField);
		checkError(clubNameField);
		
		//Creates label and field to enter name of advisor
		JLabel advisorNameLabel = new JLabel("Advisor Name:");
	    JTextField advisorNameField = new JTextField();
	    setFont(advisorNameLabel, advisorNameField);
	    advisorNameLabel.setBounds(400,100,250,50);
		advisorNameField.setBounds(400,150,250,50);
		panel.add(advisorNameLabel);
	    panel.add(advisorNameField);
	    checkError(advisorNameField); 
	    
	    //Creates label and field to enter email of advisor
	    JLabel advisorEmailLabel = new JLabel("Advisor Email:");
	    JTextField advisorEmailField = new JTextField("@issaquah.wednet.edu");
	    setFont(advisorEmailLabel, advisorEmailField);
	    advisorEmailLabel.setBounds(700,100,250,50);
	    advisorEmailField.setBounds(700,150,250,50);
	    panel.add(advisorEmailLabel);
	    panel.add(advisorEmailField); 
	    checkError(advisorEmailField);
	    
	    //Creates label and field to enter asb account name
	    JLabel asbAccountNameLabel = new JLabel("ASB Account Name:");
	    JTextField asbAccountNameField = new JTextField();
	    setFont(asbAccountNameLabel, asbAccountNameField);
	    asbAccountNameLabel.setBounds(100,200,250,50);
	    asbAccountNameField.setBounds(100,250,250,50);
	    panel.add(asbAccountNameLabel);
	    panel.add(asbAccountNameField);
	    checkError(asbAccountNameField);
	    
	    //Creates label and field to enter the asb account number
	    JLabel asbAccountNumberLabel = new JLabel("ASB Account Number:");
	    JTextField asbAccountNumberField = new JTextField();
	    setFont(asbAccountNumberLabel, asbAccountNumberField);
	    asbAccountNumberLabel.setBounds(400,200,250,50);
	    asbAccountNumberField.setBounds(400,250,250,50);
	    panel.add(asbAccountNumberLabel);
	    panel.add(asbAccountNumberField);
	    checkIntError(asbAccountNumberField);
	}
	
	
	public static void setFont(JLabel label, JTextField field){
		label.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		field.setFont(new Font("Sans Serif", Font.PLAIN, 15));
	}
	
	public static void checkError(JTextField field){
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
	public static void checkIntError(JTextField field){
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
}
