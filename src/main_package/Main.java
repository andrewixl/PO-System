	package main_package;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static String currentFrame = "addclub";
	public static String fonttype;
	public static JFrame loadingframe = new JFrame("PO System");
	public static JFrame loadingframe2 = new JFrame("PO System");
	
	//Andrew's Path Code for Resources
	public static String expensesfilepath = ("C:\\Program Files (x86)\\PO-System\\Expenses.ods");
	public static String localfilepath = ("C:\\Program Files (x86)\\PO-System\\local.ods");
	public static String licensefilepath = ("C:\\Program Files (x86)\\PO-System\\License.txt");
		
	public static void main(String[] args) throws Exception
	{
		StartUp.startprogram(); 
	}
	public static void start() throws Exception
	{
		//label.setBounds(left right,up down,width,height);
		Spreadsheets instance = new Spreadsheets();
		instance.createSpreadsheet();
		
		Select_Club.selectClub();
	}
	public static void loadingframe(){
		JPanel panel = new JPanel();
		loadingframe.setBounds(500,500,500,500);
		loadingframe.add(panel);
		loadingframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loadingframe.setVisible(true);
	    panel.setLayout(null);
		
		JLabel loadinglabel4 = new JLabel("Please Wait");
	    loadinglabel4.setFont(new Font(Main.fonttype, Font.PLAIN, 15));
	    loadinglabel4.setBounds(200,200,250,50);
	    loadinglabel4.setVisible(true);
		panel.add(loadinglabel4);
	}
	
	public static void nointernetframe(){
		JPanel panel = new JPanel();
		loadingframe2.setBounds(500,500,500,500);
		loadingframe2.add(panel);
		loadingframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loadingframe2.setVisible(true);
	    panel.setLayout(null);
		
	    JButton retry = new JButton("Retry");
		retry.setFont(new Font(Main.fonttype, Font.PLAIN, 15));
		retry.setBounds(180, 200, 100, 50);
	    panel.add(retry);
	    retry.addActionListener (new retryconnection());
	    
		JLabel loadinglabel = new JLabel("No Connection Availible");
	    loadinglabel.setFont(new Font(Main.fonttype, Font.PLAIN, 20));
	    loadinglabel.setBounds(135,100,250,100);
	    loadinglabel.setVisible(true);
		panel.add(loadinglabel);
		
		JLabel loadinglabel2 = new JLabel("Please Check Internet Connection");
	    loadinglabel2.setFont(new Font(Main.fonttype, Font.PLAIN, 20));
	    loadinglabel2.setBounds(90,130,350,100);
	    loadinglabel2.setVisible(true);
		panel.add(loadinglabel2);
	
	}
	static class retryconnection  implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			loadingframe2.dispose();
			try {
				StartUp.testConnection();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
}

}