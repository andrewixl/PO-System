package main_package;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Settings {
	private static JFrame settingsframe = new JFrame();
	private static String[] fonts = new String[] {"Arial","San Serif", "Verdana", "Wingdings 3"};
    private static Integer[] sizes = new Integer[] {10, 20, 30, 40};
	private static JComboBox font = new JComboBox<String>(fonts);
	private static JComboBox fontsize = new JComboBox<Integer>(sizes);
	
	public static String fonttype = "Arial";
	public static int fsize = 20;
	
	public static void settings()
	{
		JPanel panel = new JPanel();
		settingsframe.setBounds(500,500,400,400);
		settingsframe.add(panel);
		settingsframe.setVisible(true);
	    panel.setLayout(null);
	    
	    font.setFont(new Font(fonttype, Font.PLAIN, 15));
	    font.setBounds(50,50,250,50);
	    panel.add(font);
	    
	    fontsize.setFont(new Font(fonttype, Font.PLAIN, 15));
	    fontsize.setBounds(50,150,250,50);
	    panel.add(fontsize);
	    
	    JButton apply = new JButton("Apply");
		apply.setFont(new Font(fonttype, Font.PLAIN, 20));
		panel.add(apply);
		apply.setBounds(200,230,100,50);
		//adds action listener for apply button
		apply.addActionListener (new applysettings());
		
		JButton cancel = new JButton("Cancel");
		cancel.setFont(new Font(fonttype, Font.PLAIN, 20));
		panel.add(cancel);
		cancel.setBounds(50,230,100,50);
		//adds action listener for apply button
		cancel.addActionListener (new cancelsettings());
	    
	}
	static class applysettings implements ActionListener {        
		  public void actionPerformed (ActionEvent e){ 
			fonttype = ((String) font.getSelectedItem());
			fsize = (int) (fontsize.getSelectedItem());	
			int n = JOptionPane.showConfirmDialog(
			            null,
			            "Would you like restart now? (Font may not show correctly otherwise)",
			            "Restart Required",
			            JOptionPane.YES_NO_OPTION);

			        if(true){
			        	settingsframe.dispose();
			        }
			        else {
			            JOptionPane.showMessageDialog(null, "Restart Delayed");
			            settingsframe.dispose();
			        } 
			    }
			}    
	static class cancelsettings implements ActionListener {        
		  public void actionPerformed (ActionEvent e){ 
			  settingsframe.dispose();
		  }
		}
}       
		
	

