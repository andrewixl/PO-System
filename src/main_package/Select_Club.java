package main_package;

import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.aspose.cells.Cell;
import com.aspose.cells.Cells;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;

public class Select_Club {
	public static JFrame selectclubframe = new JFrame("PO System");
	public static JComboBox<String> ClubList;
	public static int cellStartValue;
	//public static String fonttype2 = Main.fonttype;
	public static void selectClub() throws Exception
	{
		System.out.print(Main.fonttype);
		getClubs();
		JPanel panel = new JPanel();
		selectclubframe.setBounds(500,500,500,500);
		selectclubframe.add(panel);
		selectclubframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    panel.setLayout(null);
	    
		JLabel clublabel = new JLabel("Select Club:");
		clublabel.setFont(new Font(Main.fonttype, Font.PLAIN, 15));
		clublabel.setBounds(100,100,250,50);
		panel.add(clublabel);
		
		ClubList.setFont(new Font(Main.fonttype, Font.PLAIN, 15));
		ClubList.setBounds(100,150,250,50);
	    panel.add(ClubList);
	    
	    JButton addclub = new JButton("Add Club");
	    addclub.setFont(new Font(Main.fonttype, Font.PLAIN, 15));
	    addclub.setBounds(100, 210, 100, 50);
	    panel.add(addclub);
	    addclub.addActionListener (new addclub());
	    
	    JButton select = new JButton("Select");
	    select.setFont(new Font(Main.fonttype, Font.PLAIN, 15));
	    select.setBounds(220, 210, 100, 50);
	    panel.add(select);
	    select.addActionListener (new selectclub());
	    
	    JButton settings = new JButton("Settings");
	    settings.setFont(new Font(Main.fonttype, Font.PLAIN, 15));
	    settings.setBounds(370, 10, 100, 50);
	    panel.add(settings);
	    settings.addActionListener (new settings());
	   
	    selectclubframe.setVisible(false);
	    selectclubframe.setVisible(true);
	    
	}
	public static void getClubs() throws Exception
	{
		Select_Club.ClubList = new JComboBox<String>(SQLServer.clubs);
	}
	static class addclub implements ActionListener {        
		  public void actionPerformed (ActionEvent e){ 
			try {
				Add_Club.addClub();
				selectclubframe.dispose();
				//selectclubframe.setVisible(false);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		  }
		} 
	static class selectclub implements ActionListener {        
	  public void actionPerformed (ActionEvent e){ 
		StartOptions.startOptions((String) ClubList.getSelectedItem());
		selectclubframe.dispose();
	  }
	}
	static class settings implements ActionListener {        
		  public void actionPerformed (ActionEvent e){ 
			Settings.settings();
		  }
		}
}

