package ui;


import db.Database;
import ui.PlayerView.PlayerViewPanel;
import ui.TeamView.TeamViewPanel;
import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventListener;
import ui.loginView.LoginPanel;
import ui.loginView.LoginPanelController;
import ui.mainView.NavigationPanel;
import ui.mainView.TeamChoiceBox;
import ui.mainView.TeamChoiceBoxController;
import ui.mainView.TeamNameLabel;
import ui.mainView.TickerPanel;

/**
 * Kontrolliert welche View angezeigt wird und initalisiert sie
 * @author Katy
 *
 */
//TODO Inputcontroller schreiben
public class MainPanelController implements UiEventListener{
	
	private MainPanel view;
	
	//Werden nicht nur in einer Sicht gebraucht
	private NavigationPanel navi;
	private TeamChoiceBoxController teamChoiceController;//Teamauswahlbox
	private TeamNameLabel teamNameLabel;
	
	private TickerPanel tickerPanel;
	private TeamViewPanel teamViewPanel;
	private PlayerViewPanel playerViewPanel;
	private LoginPanelController loginPanelController;
	
	private MessagePanel messagePanel;
	
	private Database db;
	
	public MainPanelController(){
		db = new Database();
		
		view = new MainPanel();
		navi = new NavigationPanel();
		
		teamChoiceController = new TeamChoiceBoxController(db);
		teamNameLabel = new TeamNameLabel();
		tickerPanel = new TickerPanel();
		loginPanelController = new LoginPanelController(db);
		messagePanel = new MessagePanel();

		//addMainView();
		addLoginView();
		
		//Der Controller h�rt auf die Teamauswahl und die Playerpanel zum switchen der View
		teamChoiceController.addListener(this);
		loginPanelController.addListener(this);
		loginPanelController.addListener(messagePanel);
		
		
		view.addElement(messagePanel);
	}
	
	
	private void addLoginView() {
		view.addElement(loginPanelController.getView());
		updateView();
	}


	private void addMainView() {
		view.removeElement(loginPanelController.getView());
		
		view.addElement(navi);
		view.addElement(teamChoiceController.getView());
		view.addElement(teamNameLabel);
		view.addElement(tickerPanel);
		updateView();
	}
	
	private void addTeamView() {
		teamViewPanel = new TeamViewPanel();
		teamViewPanel.addListener(this);
		
		teamNameLabel.setText(teamChoiceController.getTeamname());
		
		view.removeElement(tickerPanel);
		view.add(teamViewPanel);
		
		updateView();
	}
	
	private void addPlayerView() {
		playerViewPanel = new PlayerViewPanel();
		
		view.remove(teamViewPanel);
		view.removeElement(teamChoiceController.getView());
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
		}else if(event.getMessage() == "activateMainView"){
			teamChoiceController.initTeams(loginPanelController.getUser());
			addMainView();
		}else{
			
		}
	}
	

	public void updateView(){
		view.revalidate();
		view.repaint();
	}
}
