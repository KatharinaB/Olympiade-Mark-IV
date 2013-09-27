package ui.PlayerView;


import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TeamHistoryPanel extends JPanel{
	
	
	private String [] teamHistoryNames = {"team", "season", "assignment", "pps", "value"};
	private JLabel [] teamHistoryLabels;
	private JLabel [] teamHistoryValues;
	private JLabel team;
	private JLabel season;
	private JLabel assignment;
	private JLabel pps;
	private JLabel value;
	
	public TeamHistoryPanel(){
		initPanel();
		
		this.setPreferredSize(new Dimension(300,80));
		this.setBounds(400,200,300,80);
	}

	private void initPanel() {
		for(int i = 0; i < teamHistoryNames.length;i++){
			teamHistoryLabels[i] = new JLabel(teamHistoryNames[i]);
			teamHistoryValues[i] = new JLabel("dummy"); //TODO aus DB
			
			teamHistoryLabels[i].setPreferredSize(new Dimension(80,30));
			teamHistoryValues[i].setPreferredSize(new Dimension(80,30));
		}
		
		for(int i = 0; i < teamHistoryNames.length; i++){
			this.add(teamHistoryLabels[i]);
		}
		for(int i = 0; i < teamHistoryNames.length; i++){
			this.add(teamHistoryValues[i]);
		}
		
		
	}

}
