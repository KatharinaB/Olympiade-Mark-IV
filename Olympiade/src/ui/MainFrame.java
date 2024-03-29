package ui;
import java.awt.Color;

import javax.swing.JFrame;



public class MainFrame extends JFrame{
	
	private MainPanel mainpanel;
	private MainPanelController mainController;
	
	public MainFrame(int height, int width){
		
		mainController = new MainPanelController();
		mainpanel = mainController.getView();
		initMainFrame(height, width);
		

		this.add(mainpanel);
		
	}
	
	private void initMainFrame(int height, int width) {
		this.setBackground(Color.YELLOW);
		this.setSize(height,width);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Olympiade");
		this.setVisible(true);
	}
}
