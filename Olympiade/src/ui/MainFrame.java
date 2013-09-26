package ui;
import java.awt.Color;

import javax.swing.JFrame;



public class MainFrame extends JFrame{
	
	private MainPanel mainpanel;
	
	public MainFrame(){
		
		initMainPanel();
		initMainFrame();
		
		this.add(mainpanel);
		this.setVisible(true);
	}
	
	private void initMainFrame() {
		this.setBackground(Color.YELLOW);
		this.setSize(1280,960);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Olympiade");
		
	}

	private void initMainPanel() {
		mainpanel = new MainPanel();
	}

}
