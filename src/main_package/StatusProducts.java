package main_package;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class StatusProducts {
	public static JFrame productstatusframe = new JFrame();
	public static JPanel panel = new JPanel();
	
	public static void createPOWindow(){
		StartOptions.options.dispose();
		Main.currentFrame = "productstatusframe";
		productstatusframe.setVisible(true);
		productstatusframe.setSize(1925,1025);
		productstatusframe.add(panel);
	    panel.setLayout(null);
	}
}
