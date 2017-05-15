package main_package;

public class CoreVariables {
	public static String[] vendors = {"AndyMark", "Amazon", "Vex"};
	
	public static void restartProgram(){
		Select_Club.selectclubframe.dispose();
		Add_Club.addclubframe.dispose();
		StartOptions.options.dispose();
		Settings.settingsframe.dispose();
		AddProduct.addproductframe.dispose();		
	}
}
