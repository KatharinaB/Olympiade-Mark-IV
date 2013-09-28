package ui.PlayerView;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class TeamHistoryPanel extends JPanel{
	
	
	private String [] teamHistoryNames = {"team", "season", "assignment", "pps", "value"};
	private JLabel [] teamHistoryLabels;
	private JLabel [] teamHistoryValues;
	private JLabel titel;
	
	public TeamHistoryPanel(){
		this.setBounds(850,450,405,70);
		this.setBorder(new LineBorder(Color.RED));
		initPanel();
		
	}

	
	private void initPanel() {
		titel = new JLabel("Team-History");
		titel.setPreferredSize(new Dimension(410,20));
		titel.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		
		teamHistoryLabels = new JLabel[5];
		teamHistoryValues = new JLabel[5]; //TODO aus DB
		
		this.add(titel);
		
		for(int i = 0; i < teamHistoryNames.length; i++){
			teamHistoryLabels[i] = new JLabel(teamHistoryNames[i]);
			teamHistoryValues[i] = new JLabel("dummy"); 
			
			teamHistoryLabels[i].setPreferredSize(new Dimension(70, 15));
			teamHistoryValues[i].setPreferredSize(new Dimension(70, 15));
			
		}
		
		for(int i = 0; i < teamHistoryNames.length; i++){
			this.add(teamHistoryLabels[i]);
		}
		for(int i = 0; i < teamHistoryNames.length; i++){
			this.add(teamHistoryValues[i]);
		}
	}
}
