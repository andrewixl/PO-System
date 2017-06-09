package main_package;

<<<<<<< HEAD
=======
import javax.swing.JButton;
import javax.swing.JComboBox;
>>>>>>> 9c4bfdb0561d395787ff6e735ee6cd8f320599b4
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StatusProducts {
<<<<<<< HEAD
	public static JFrame productstatusframe = new JFrame();
	public static JPanel panel = new JPanel();
	
	public static void createPOWindow(){
		StartOptions.options.dispose();
		Main.currentFrame = "productstatusframe";
		productstatusframe.setVisible(true);
		productstatusframe.setSize(1925,1025);
		productstatusframe.add(panel);
	    panel.setLayout(null);
=======
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
>>>>>>> 9c4bfdb0561d395787ff6e735ee6cd8f320599b4
	}
}
