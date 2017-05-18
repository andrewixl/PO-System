package main_package;

import java.util.*;
import java.awt.Font;
import java.io.FileInputStream;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class Add_Club {
	public static JFrame addclubframe = new JFrame();
	public static void addClub() throws Exception
	{
		FileInputStream fstream = new FileInputStream(Main.clubfilepath);
		Workbook wb = new Workbook(fstream);
		Worksheet sheet = wb.getWorksheets().get(0);
		
		
		JPanel panel = new JPanel();
		addclubframe.setBounds(500,500,500,500);
		addclubframe.add(panel);
		addclubframe.setExtendedState(addclubframe.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	    panel.setLayout(null);
	    
	    addclubframe.setVisible(false);
	    addclubframe.setVisible(true);
	    
	    JLabel clubnamelabel = new JLabel("Offical Club Name:");
	    clubnamelabel.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		clubnamelabel.setBounds(100,100,250,50);
		panel.add(clubnamelabel);
		
		JTextField clubnamefield = new JTextField();
		clubnamefield.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		clubnamefield.setBounds(100,150,250,50);
		panel.add(clubnamefield);
		checkClub(clubnamefield);
		
		JLabel advisornamelabel = new JLabel("Advisor Name:");
		advisornamelabel.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		advisornamelabel.setBounds(400,100,250,50);
	    panel.add(advisornamelabel);
	    
	    JTextField advisornamefield = new JTextField();
	    advisornamefield.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		advisornamefield.setBounds(400,150,250,50);
	    panel.add(advisornamefield);
	    checkClub(advisornamefield);
	    
	    JLabel advisoremaillabel = new JLabel("Advisor Email:");
	    advisoremaillabel.setFont(new Font("Sans Serif", Font.PLAIN, 15));
	    advisoremaillabel.setBounds(700,100,250,50);
	    panel.add(advisoremaillabel);
	    
	    JTextField advisoremailfield = new JTextField("@issaquah.wednet.edu");
	    advisoremailfield.setFont(new Font("Sans Serif", Font.PLAIN, 15));
	    advisoremailfield.setBounds(700,150,250,50);
	    panel.add(advisoremailfield); 
	    checkClub(advisoremailfield);
	    
	    JLabel asbaccountnamelabel = new JLabel("ASB Account Name:");
	    asbaccountnamelabel.setFont(new Font("Sans Serif", Font.PLAIN, 15));
	    asbaccountnamelabel.setBounds(100,200,250,50);
	    panel.add(asbaccountnamelabel);
	    
	    JTextField asbaccountnamefield = new JTextField();
	    asbaccountnamefield.setFont(new Font("Sans Serif", Font.PLAIN, 15));
	    asbaccountnamefield.setBounds(100,250,250,50);
	    panel.add(asbaccountnamefield);
	    checkClub(asbaccountnamefield);
	    
	    JLabel asbaccountnumberlabel = new JLabel("ASB Account Number:");
	    asbaccountnumberlabel.setFont(new Font("Sans Serif", Font.PLAIN, 15));
	    asbaccountnumberlabel.setBounds(400,200,250,50);
	    panel.add(asbaccountnumberlabel);
	    
	    JTextField asbaccountnumberfield = new JTextField();
	    asbaccountnumberfield.setFont(new Font("Sans Serif", Font.PLAIN, 15));
	    asbaccountnumberfield.setBounds(400,250,250,50);
	    panel.add(asbaccountnumberfield);
	    checkClubInt(asbaccountnumberfield);
	}
	
	
	public static void checkClub(JTextField field){
		String str=field.getText();
		Scanner input=new Scanner (str);
		do{
			if(input.hasNextInt()||input.toString().isEmpty()){
				field.setText("*ERROR*");
			}
		}while(input.hasNext());
	}
	
	
	public static void checkClubInt(JTextField field){
		String str=field.getText();
		Scanner input=new Scanner (str);
		do{
		   if(!input.hasNextInt()||input.toString().isEmpty()){
			   field.setText("*ERROR*");
		   }
		}while(input.hasNext());
	}
}
