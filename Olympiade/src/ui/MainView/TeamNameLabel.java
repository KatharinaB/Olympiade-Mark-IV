package ui.mainView;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class TeamNameLabel extends JLabel{

	public TeamNameLabel() {
		this.setSize(200, 50);	
		this.setBounds(560, 50, 400, 30);
		
		this.setFont(new Font("Verdana", Font.BOLD, 30));
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setVisible(true);
		
		initTeamname();
	}
	
	public void initTeamname(){ 
		this.setText("");
	}

}
