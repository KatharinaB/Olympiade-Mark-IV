package ui;


import gameContent.Player;
import ui.PlayerView.PlayerViewPanel;
import ui.PlayerView.PlayerViewPanelController;
import ui.TeamView.TeamViewPanel;
import ui.TeamView.TeamViewPanelController;
import ui.eventHandling.ShowPlayerEvent;
import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventListener;
import ui.loginView.LoginPanelController;
import ui.mainView.NavigationPanel;
import ui.mainView.NavigationPanelController;
import ui.mainView.TeamChoiceBoxController;
import ui.mainView.TeamNameLabel;
import ui.mainView.TickerPanel;
import db.Database;

/**
 * Kontrolliert welche View angezeigt wird und initalisiert sie
 * @author Katy
 *
 */
//TODO Inputcontroller schreiben
public class MainPanelController implements UiEventListener{
	
	private MainPanel view;
	
	//Werden nicht nur in einer Sicht gebraucht
	private NavigationPanelController naviController;
	private TeamChoiceBoxController teamChoiceController;//Teamauswahlbox
	private TeamNameLabel teamNameLabel;
	
	private TickerPanel tickerPanel;
	private TeamViewPanelController teamViewPanelController;
	private PlayerViewPanelController playerViewPanelController;
	private LoginPanelController loginPanelController;
	
	private MessagePanel messagePanel;
	
	private Database db;
	
	public MainPanelController(){
		db = new Database();
		
		view = new MainPanel();
		naviController = new NavigationPanelController();
		
		teamChoiceController = new TeamChoiceBoxController(db);
		teamNameLabel = new TeamNameLabel();
		tickerPanel = new TickerPanel();
		loginPanelController = new LoginPanelController(db);
		messagePanel = new MessagePanel();
		teamViewPanelController = new TeamViewPanelController(db);
		

		addLoginView();
		
		//Der Controller hört auf die Teamauswahl und die Playerpanel zum switchen der View
		teamChoiceController.addListener(this);
		loginPanelController.addListener(this);
		naviController.addListener(this);
		loginPanelController.addListener(messagePanel);
		
		view.addElement(messagePanel);
	}
	
	
	private void addLoginView() {
		view.addElement(loginPanelController.getView());
		updateView();
	}


	private void addMainView() {
		if(loginPanelController.getView() != null){
			view.removeElement(loginPanelController.getView());
		}
		if(teamViewPanelController.getView() != null){
			view.removeElement(teamViewPanelController.getView());
		}
		
		if(playerViewPanelController != null){
			view.removeElement(playerViewPanelController.getView());
		}
		view.addElement(naviController.getView());
		view.addElement(teamChoiceController.getView());
		view.addElement(teamNameLabel);
		view.addElement(tickerPanel);
		updateView();
	}
	
	private void addTeamView() {
		teamViewPanelController.setTeamName(teamChoiceController.getTeamname());
		teamViewPanelController.addListener(this);
		if(tickerPanel != null){
			view.removeElement(tickerPanel);
		}
		if(playerViewPanelController != null){
			view.removeElement(playerViewPanelController.getView());
		}
		
		view.add(teamViewPanelController.getView());
		teamNameLabel.setText(teamChoiceController.getTeamname());
		
		updateView();
	}
	
	private void addPlayerView(Player player) {
		playerViewPanelController = new PlayerViewPanelController(db, player, teamChoiceController.getTeamname());
		if(teamViewPanelController.getView() != null){
			view.remove(teamViewPanelController.getView());
		}
		if(teamChoiceController.getView() != null){
			view.removeElement(teamChoiceController.getView());
		}
		
		view.add(playerViewPanelController.getView());
		updateView();
	}

	public MainPanel getView(){
		return view;
	}

	//TODO nochmal anders lösen, nicht mit diesen Strings, mit events
	@Override
	public void onUiEventFired(UiEvent event) {
		if(event.getMessage() == "activateTeamView"){
			addTeamView();
		}else if(event.getMessage() == "activatePlayerView"){
			addPlayerView(((ShowPlayerEvent)event).getPlayer());
		}else if(event.getMessage() == "activateMainView"){
			
			if(!teamChoiceController.getIsInitialized()){
				teamChoiceController.initTeams(loginPanelController.getUser());
			}
			teamNameLabel.setText(teamChoiceController.getTeamname());
			addMainView();
		}else{
			
		}
	}
	

	public void updateView(){
		view.revalidate();
		view.repaint();
	}
}
