package main_package;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Add_Club {
	
	public static JFrame addClubFrame = new JFrame();
	public static JLabel error=new JLabel("*");
	public static JLabel error2=new JLabel("*");
	public static JPanel errorPanel=new JPanel();
	
	public static JTextField clubNameField = new JTextField();
	public static JTextField advisorNameField = new JTextField();
	public static JTextField advisorEmailField = new JTextField("@issaquah.wednet.edu");
	public static JTextField asbAccountNameField = new JTextField();
	public static JTextField asbAccountNumberField = new JTextField();
	
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
		
		setFont(clubNameLabel, clubNameField);
		clubNameLabel.setBounds(100,100,250,50);
		clubNameField.setBounds(100,150,250,50);
		panel.add(clubNameLabel);
		panel.add(clubNameField);
		checkError(clubNameField);
		
		//Creates label and field to enter name of advisor
		JLabel advisorNameLabel = new JLabel("Advisor Name:");
	    setFont(advisorNameLabel, advisorNameField);
	    advisorNameLabel.setBounds(400,100,250,50);
		advisorNameField.setBounds(400,150,250,50);
		panel.add(advisorNameLabel);
	    panel.add(advisorNameField);
	    checkError(advisorNameField); 
	    
	    //Creates label and field to enter email of advisor
	    JLabel advisorEmailLabel = new JLabel("Advisor Email:");
	    setFont(advisorEmailLabel, advisorEmailField);
	    advisorEmailLabel.setBounds(700,100,250,50);
	    advisorEmailField.setBounds(700,150,250,50);
	    panel.add(advisorEmailLabel);
	    panel.add(advisorEmailField); 
	    checkError(advisorEmailField);
	    
	    //Creates label and field to enter asb account name
	    JLabel asbAccountNameLabel = new JLabel("ASB Account Name:");
	    setFont(asbAccountNameLabel, asbAccountNameField);
	    asbAccountNameLabel.setBounds(100,200,250,50);
	    asbAccountNameField.setBounds(100,250,250,50);
	    panel.add(asbAccountNameLabel);
	    panel.add(asbAccountNameField);
	    checkError(asbAccountNameField);
	    
	    //Creates label and field to enter the asb account number
	    JLabel asbAccountNumberLabel = new JLabel("ASB Account Number:");
	    setFont(asbAccountNumberLabel, asbAccountNumberField);
	    asbAccountNumberLabel.setBounds(400,200,250,50);
	    asbAccountNumberField.setBounds(400,250,250,50);
	    panel.add(asbAccountNumberLabel);
	    panel.add(asbAccountNumberField);
	    checkIntError(asbAccountNumberField);
	    
	    JButton addbutton = new JButton("Add");
	    panel.add(addbutton);
	    addbutton.setBounds(950,850,100,50);
	    addbutton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    //adds action listener for button4
	    addbutton.addActionListener (new addclub());
	    
	    JButton backbutton = new JButton("Back");
	    panel.add(backbutton);
	    backbutton.setBounds(800,850,100,50);
	    backbutton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
	    //adds action listener for button4
	    backbutton.addActionListener (new back());
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
	
	static class back implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
				addClubFrame.dispose();
				Select_Club.selectClub();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
}
	static class addclub implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
				SQLServer.updateClubList();
				addClubFrame.dispose();
				Select_Club.selectClub();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
}
}

