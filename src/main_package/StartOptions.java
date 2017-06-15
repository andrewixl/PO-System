package main_package;

import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main_package.StartOptions.Action2.Action3;
import main_package.StartOptions.Action2.Action4.openSettings;

public class StartOptions {
	public static JFrame options = new JFrame();
	private static int oriWidth = 1920;
	private static int oriHeight = 1080;
	public static void startOptions(String clubname){
		options.setVisible(true);
		options.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		options.setExtendedState(options.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		
		Rectangle r = options.getBounds();
		int h = r.height/oriHeight;
		int w = r.width/oriWidth;
		//creates new panel
		JPanel panel = new JPanel();
		options.add(panel);
		panel.setLayout(null);
		//currentFrame = "frame";
			  
		JLabel welcome = new JLabel("Welcome " + clubname);
		welcome.setFont(new Font("Sans Serif", Font.PLAIN, 50));
		panel.add(welcome);
		welcome.setBounds(50,50,1000,50);
				
		//creates new button1
		JButton button1 = new JButton("Enter New Product for Purchase");
		button1.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		panel.add(button1);
		button1.setBounds(685,250,500,50);
		//adds action listener for button1
		button1.addActionListener (new Action1());
			  
		//creates new button2
		JButton button2 = new JButton("Edit / Check Current Status on Ordered Products");
		button2.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		panel.add(button2);
		button2.setBounds(685,315,500,50);
		//adds action listener for button2
		button2.addActionListener (new Action2());
			  
		//creates new button3
		JButton button3 = new JButton("Generate PO For Products");
		button3.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		panel.add(button3);
		button3.setBounds(685,380,500,50);
		//adds action listener for button3
		button3.addActionListener (new Action3());
			  
		//creates new settings button
		JButton settingsbutton = new JButton("Settings");
		settingsbutton.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		panel.add(settingsbutton);
		settingsbutton.setBounds(1700,25,175,50);
		//adds action listener for button3
		settingsbutton.addActionListener (new openSettings());
			  
		}
		static class Action1 extends StartOptions implements ActionListener {        
			  public void actionPerformed (ActionEvent e) { 
				//variables.addingvendor.dispose();
				try {
					AddProduct.createPurchaseWindow();
				} catch (Exception e1) {
				}
			  }
			}   
			static class Action2 extends StartOptions implements ActionListener {        
			  public void actionPerformed (ActionEvent e) { 
				StatusProducts.statusProducts();
			}  
			static class Action3 implements ActionListener {        
				  public void actionPerformed (ActionEvent e) { 
					GeneratePO.createPOWindow();
				  }
				} 
			static class Action4 implements ActionListener {        
				  public void actionPerformed (ActionEvent e) { 
					/*  if (currentFrame.equals("frame2"))
						  variables.frame2.dispose();
					  else if (currentFrame.equals("frame3"))
						  variables.frame3.dispose();
					  else if (currentFrame.equals("frame4"))
						  variables.frame4.dispose();
					  createWindow();
				  }*/
				} 
			static class openSettings implements ActionListener {        
				  public void actionPerformed (ActionEvent e) { 
					Settings.settings();
				  }
				} 
			}
	}
}
