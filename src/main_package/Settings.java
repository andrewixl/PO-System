package main_package;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Settings {
	public static void settings()
	{
		JFrame settingsframe = new JFrame();
		JPanel panel = new JPanel();
		settingsframe.setBounds(500,500,250,250);
		settingsframe.add(panel);
		settingsframe.setVisible(true);
	    panel.setLayout(null);
	}
}
