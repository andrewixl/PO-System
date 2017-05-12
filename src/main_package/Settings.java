package main_package;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import main_package.StartOptions.Action1;

public class Settings {
	private static String[] fonts = new String[] {"Arial","San Serif", "Verdana"};
    private static Integer[] sizes = new Integer[] {10, 20, 30, 40};
	private static JComboBox font = new JComboBox<String>(fonts);
	private static JComboBox fontsize = new JComboBox<Integer>(sizes);
	
	public static String fonttype = "Arial";
	public static int fsize = 20;
	
	public static void settings()
	{
		JFrame settingsframe = new JFrame();
		JPanel panel = new JPanel();
		settingsframe.setBounds(500,500,400,400);
		settingsframe.add(panel);
		settingsframe.setVisible(true);
	    panel.setLayout(null);
	    
	    font.setFont(new Font("Sans Serif", Font.PLAIN, 15));
	    font.setBounds(50,50,250,50);
	    panel.add(font);
	    
	    fontsize.setFont(new Font("Sans Serif", Font.PLAIN, 15));
	    fontsize.setBounds(50,150,250,50);
	    panel.add(fontsize);
	    
	    JButton apply = new JButton("Apply");
		apply.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		panel.add(apply);
		apply.setBounds(175,210,100,50);
		//adds action listener for button1
		apply.addActionListener (new applysettings());
	    
	}
	static class applysettings implements ActionListener {        
		  public void actionPerformed (ActionEvent e){ 
			fonttype = ((String) font.getSelectedItem());
			fsize = (int) (fontsize.getSelectedItem());
		  }
		}
	
}
