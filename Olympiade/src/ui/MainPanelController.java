package ui;


import javax.swing.JTextArea;

import ui.EventHandling.UiEvent;
import ui.EventHandling.UiEventListener;
import ui.MainView.NavigationPanel;
import ui.MainView.TeamChoiceBox;
import ui.MainView.TeamNameLabel;
import ui.MainView.TickerPanel;
import ui.PlayerView.PlayerViewPanel;
import ui.PlayerView.Elements.IconStatPanelController;
import ui.PlayerView.Elements.PlayerImageLabel;
import ui.PlayerView.Elements.PlayerStoryTextArea;
import ui.PlayerView.Elements.TeamHistoryPanel;
import ui.TeamView.TeamViewPanel;
import ui.TeamView.Elements.PlayerPanelController;
import ui.TeamView.Elements.TeamAttributePanel;

public class MainPanelController implements UiEventListener{
	
	private MainPanel view;
	
	//Werden nicht nur in einer Sicht gebraucht
	private NavigationPanel navi;
	private TeamChoiceBox teamChoice;//Teamauswahlbox
	private TeamNameLabel teamNameLabel;
	
	private TickerPanel tickerPanel;
	
	private TeamViewPanel teamViewPanel;
	private PlayerViewPanel playerViewPanel;
	
	
	
	public MainPanelController(){
		view = new MainPanel();
		navi = new NavigationPanel();
		
		teamChoice = new TeamChoiceBox();
		teamNameLabel = new TeamNameLabel();
		tickerPanel = new TickerPanel();

		addMainView();

		//Der Controller h�rt auf die Teamauswahl und die Playerpanel zum switchen der View
		teamChoice.addListener(this);
	}
	
	
	private void addMainView() {
		view.addElement(navi);
		view.addElement(teamChoice);
		view.addElement(teamNameLabel);
		view.addElement(tickerPanel);
		updateView();
	}
	
	private void addTeamView() {
		teamViewPanel = new TeamViewPanel();
		teamViewPanel.addListener(this);
		
		teamNameLabel.setText(teamChoice.getTeamname());
		
		view.removeElement(tickerPanel);
		view.add(teamViewPanel);
		
		updateView();
	}
	
	private void addPlayerView() {
		playerViewPanel = new PlayerViewPanel();
		
		view.remove(teamViewPanel);
		view.removeElement(teamChoice);
		view.removeElement(teamNameLabel);
		view.add(playerViewPanel);
		
		updateView();
	}

	public MainPanel getView(){
		return view;
	}

	//TODO nochmal anders l�sen, nicht mit diesen Strings
	@Override
	public void onUiEventFired(UiEvent event) {
		
		if(event.getMessage() == "activateTeamView"){
			addTeamView();
		}else if(event.getMessage() == "activatePlayerView"){
			addPlayerView();
		}
	}
	

	public void updateView(){
		view.revalidate();
		view.repaint();
	}
}
