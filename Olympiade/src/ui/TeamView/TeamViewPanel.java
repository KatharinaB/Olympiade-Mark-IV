package ui.TeamView;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

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
public class TeamViewPanel extends JPanel implements UiEventListener, UiEventDispatcher{
	
	private ArrayList<UiEventListener> listeners = new ArrayList<UiEventListener>();
	private TeamAttributePanel teamAttributePanel;
	private PlayerPanelController playerPanelController;
	
	public TeamViewPanel(){
		this.setLayout(null); //alle Elemente frei positionierbar
		this.setBorder(new LineBorder(Color.MAGENTA));
		this.setBounds(150,50,850,800);
		
		initPlayerPanelController();
		initTeamView();
	}
	
	private void initPlayerPanelController() {
		playerPanelController = new PlayerPanelController();
		playerPanelController.addListener(this);
		
		//Hier schleife, je nachdem wieviele playe rgebraucht werden
		playerPanelController.addPlayer();
		playerPanelController.addPlayer();
		playerPanelController.addPlayer();
		playerPanelController.addPlayer();
		playerPanelController.addPlayer();
		playerPanelController.addPlayer();
		
	}

	public void initTeamView(){
		teamAttributePanel = new TeamAttributePanel();
		this.add(playerPanelController.getPanel());
		this.add(teamAttributePanel);
	}
	

	@Override
	public void onUiEventFired(UiEvent event) {
		System.out.println("kam an");
		dispatch(event);
		
	}

	@Override
	public void addListener(UiEventListener listener) {
		listeners.add(listener);
		
	}

	@Override
	public void removeListener(UiEventListener listener) {
		listeners.remove(listener);
		
	}

	@Override
	public void dispatch(UiEvent event) {
		for(UiEventListener lis: listeners){
			System.out.println("dispatch");
			lis.onUiEventFired(event);
			
		}
		
	}
	

}
