package main_package;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Settings {
	public static int fsize = 
	public static void settings()
	{
		JFrame settingsframe = new JFrame();
		JPanel panel = new JPanel();
		settingsframe.setBounds(500,500,400,400);
		settingsframe.add(panel);
		settingsframe.setVisible(true);
	    panel.setLayout(null);
	    
	    String[] fonts = new String[] {"Arial","San Serif", "Verdana"};
	    String[] sizes = new String[] {"10", "20", "30", "40"};
	   
	    JComboBox font = new JComboBox<String>(fonts);
	    font.setFont(new Font("Sans Serif", Font.PLAIN, 15));
	    font.setBounds(50,50,250,50);
	    panel.add(font);
	    
	    JComboBox fontsize = new JComboBox<String>(sizes);
	    fontsize.setFont(new Font("Sans Serif", Font.PLAIN, 15));
	    fontsize.setBounds(50,150,250,50);
	    panel.add(fontsize);
	    
	}
}
