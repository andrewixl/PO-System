package main_package;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StatusProducts {
	public static JFrame statusProducts  = new JFrame();
	public static JPanel panel = new JPanel();
	public static JButton back = new JButton("back");
	public static JButton Generate = new JButton("Generate PO");
	public static JComboBox Vendors = new JComboBox();
	public static void GeneratePO(){
		statusProducts.setVisible(true);
		statusProducts.setExtendedState(statusProducts.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		statusProducts.add(panel);
		panel.setLayout(null);
		
		back.setVisible(true);
		back.setBounds(400, 600, 75, 50);
		panel.add(back);
		
		Generate.setVisible(true);
		Generate.setBounds(600, 600, 125, 50);
		panel.add(Generate);
		
		Vendors.setVisible(true);
		Vendors.setBounds(200, 200, 200, 75);
		panel.add(Vendors);
	}
}
