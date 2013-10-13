package ui.TeamView;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import db.Database;

import ui.TeamView.elements.PlayerPanelController;
import ui.TeamView.elements.TeamAttributePanel;
import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventDispatcher;
import ui.eventHandling.UiEventListener;

/**
 * H�lt alle Elemente f�r die Teamview
 * @author Katy
 *
 */
public class TeamViewPanel extends JPanel {
	
	private ArrayList<UiEventListener> listeners = new ArrayList<UiEventListener>();
	private TeamAttributePanel teamAttributePanel;
	
	
	public TeamViewPanel(){
		this.setLayout(null); //alle Elemente frei positionierbar
		this.setBorder(new LineBorder(Color.MAGENTA));
		this.setBounds(200,100,1300,800);
		
		initTeamView();
	}

	
	public void addPlayerPanel(JComponent playerPanel){
		this.add(playerPanel);
	}

	public void initTeamView(){
		teamAttributePanel = new TeamAttributePanel();
		this.add(teamAttributePanel);
	}
}
