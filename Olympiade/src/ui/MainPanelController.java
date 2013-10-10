package ui;


import ui.PlayerView.PlayerViewPanel;
import ui.TeamView.TeamViewPanel;
import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventListener;
import ui.loginView.LoginPanel;
import ui.mainView.NavigationPanel;
import ui.mainView.TeamChoiceBox;
import ui.mainView.TeamNameLabel;
import ui.mainView.TickerPanel;

/**
 * Kontrolliert welche View angezeigt wird und initalisiert sie
 * @author Katy
 *
 */
public class MainPanelController implements UiEventListener{
	
	private MainPanel view;
	
	//Werden nicht nur in einer Sicht gebraucht
	private NavigationPanel navi;
	private TeamChoiceBox teamChoice;//Teamauswahlbox
	private TeamNameLabel teamNameLabel;
	
	private TickerPanel tickerPanel;
	
	private TeamViewPanel teamViewPanel;
	private PlayerViewPanel playerViewPanel;
	private LoginPanel loginPanel;
	
	
	
	public MainPanelController(){
		view = new MainPanel();
		navi = new NavigationPanel();
		
		teamChoice = new TeamChoiceBox();
		teamNameLabel = new TeamNameLabel();
		tickerPanel = new TickerPanel();
		loginPanel = new LoginPanel();

		//addMainView();
		addLoginView();
		
		//Der Controller h�rt auf die Teamauswahl und die Playerpanel zum switchen der View
		teamChoice.addListener(this);
	}
	
	
	private void addLoginView() {
		view.addElement(loginPanel);
		updateView();
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
