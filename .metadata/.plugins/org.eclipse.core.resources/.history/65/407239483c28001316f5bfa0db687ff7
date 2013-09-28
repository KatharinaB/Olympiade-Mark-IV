package ui;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import ui.EventHandling.UiEvent;
import ui.EventHandling.UiEventListener;
import ui.MainView.NavigationPanel;
import ui.MainView.TeamChoiceBox;
import ui.MainView.TeamNameLabel;
import ui.MainView.TickerPanel;
import ui.PlayerView.IconStatPanel;
import ui.PlayerView.TeamHistoryPanel;
import ui.TeamView.PlayerPanel;
import ui.TeamView.PlayerPanelController;
import ui.TeamView.TeamAttributePanel;

public class MainPanelController implements UiEventListener{
	
	private MainPanel view;
	private NavigationPanel navi;
	private PlayerPanelController playerPanelController;
	private TeamChoiceBox teamChoice;//Teamauswahlbox
	private TeamNameLabel teamNameLabel;
	private TickerPanel tickerPanel;//Enthält News und Transferticker
	private TeamAttributePanel teamAttributePanel;
	private TeamHistoryPanel teamHistoryPanel;
	private IconStatPanel iconStatPanel;
	
	
	public MainPanelController(){
		view = new MainPanel();
		navi = new NavigationPanel();
		playerPanelController = new PlayerPanelController();
		teamChoice = new TeamChoiceBox();
		teamNameLabel = new TeamNameLabel();
		tickerPanel = new TickerPanel();
		
		
		
		addMainView();

		//Der Controller hört auf die Teamauswahl und die Playerpanel zum switchen der View
		teamChoice.addListener(this);
		playerPanelController.addListener(this);
		
		//Hier schleife, je nachdem wieviele playe rgebraucht werden
		playerPanelController.addPlayer();
		
	}
	
	
	private void addMainView() {
		view.addElement(navi);
		view.addElement(teamChoice);
		view.addElement(teamNameLabel);
		view.addElement(tickerPanel);
		view.revalidate();
		view.repaint();
	}
	
	private void addTeamView() {
		teamAttributePanel = new TeamAttributePanel();
		teamNameLabel.setText(teamChoice.getTeamname());
		
		view.addElement(playerPanelController.getPanel());
		view.addElement(teamAttributePanel);
		view.removeElement(tickerPanel);
		view.revalidate();
		view.repaint();
	}
	
	private void addPlayerView() {
		teamHistoryPanel = new TeamHistoryPanel();
		iconStatPanel = new IconStatPanel();
		
		view.removeElement(teamAttributePanel);
		view.removeElement(playerPanelController.getPanel());
		view.removeElement(teamChoice);
		view.removeElement(teamNameLabel);
		
		view.add(teamHistoryPanel);
		view.add(iconStatPanel);
		view.revalidate();
		view.repaint();
	}

	public MainPanel getView(){
		return view;
	}

	//TODO nochmal anders lösen, nicht mit diesen Strings
	@Override
	public void onUiEventFired(UiEvent event) {
		
		if(event.getMessage() == "activateTeamView"){
			addTeamView();
		}else if(event.getMessage() == "activatePlayerView"){
			addPlayerView();
		}
	}
}
