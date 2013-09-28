package ui.PlayerView;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import ui.PlayerView.Elements.IconStatPanelController;
import ui.PlayerView.Elements.PlayerClassPanel;
import ui.PlayerView.Elements.PlayerImageLabel;
import ui.PlayerView.Elements.PlayerPointPanel;
import ui.PlayerView.Elements.PlayerRelationshipPanel;
import ui.PlayerView.Elements.PlayerStoryTextArea;
import ui.PlayerView.Elements.PlayerTrophiesPanel;
import ui.PlayerView.Elements.PlayerValue;
import ui.PlayerView.Elements.PlayerteamNamePanel;
import ui.PlayerView.Elements.StaminaPanel;
import ui.PlayerView.Elements.TeamHistoryPanel;

public class PlayerViewPanel extends JPanel{
	
	private TeamHistoryPanel teamHistoryPanel;
	private IconStatPanelController iconStatPanelController;
	private PlayerStoryTextArea playerStory;
	private PlayerImageLabel playerImageLabel;
	private JLabel nameLabel;
	private PlayerteamNamePanel playerteamNamePanel;
	private PlayerValue playerValue;
	private PlayerPointPanel playerPointPanel;
	private PlayerTrophiesPanel playerTrophiesPanel;
	private PlayerRelationshipPanel playerRelationshipPanelFriends;
	private PlayerClassPanel playerClassPanel;
	private JLabel injuredLabel;
	private StaminaPanel staminaPanel;
	
	public PlayerViewPanel(){
		this.setLayout(null);
		this.setBorder(new LineBorder(Color.YELLOW));
		this.setBounds(160,50,1100,800);
		
		initElements();
		
	}

	private void initElements() {
		teamHistoryPanel = new TeamHistoryPanel();
		iconStatPanelController = new IconStatPanelController();
		playerStory = new PlayerStoryTextArea();
		playerImageLabel = new PlayerImageLabel();
		nameLabel = new JLabel("playername");
		playerteamNamePanel = new PlayerteamNamePanel();
		playerValue = new PlayerValue();
		playerPointPanel = new PlayerPointPanel();
		playerTrophiesPanel = new PlayerTrophiesPanel();
		playerRelationshipPanelFriends =  new PlayerRelationshipPanel();
		playerClassPanel = new PlayerClassPanel();
		injuredLabel = new JLabel("Injured");
		staminaPanel = new StaminaPanel();
		
		//nur wenn wirklich verletzt
		initInjuredLabel();
		initName();
		
		this.add(playerStory);
		this.add(teamHistoryPanel);
		this.add(iconStatPanelController.getView());
		this.add(playerImageLabel);
		this.add(nameLabel);
		this.add(playerteamNamePanel);
		this.add(playerValue);
		this.add(playerPointPanel);
		this.add(playerTrophiesPanel);
		this.add(playerRelationshipPanelFriends);
		this.add(playerClassPanel);
		this.add(injuredLabel);
		this.add(staminaPanel);
	}

	private void initInjuredLabel() {
		injuredLabel.setForeground(Color.RED);
		injuredLabel.setBounds(30,600,80,20);
		injuredLabel.setFont(new Font("Arial", Font.BOLD, 18));
		
	}

	private void initName() {
		//nameLabel.setText(); aus Db
		nameLabel.setBounds(350,0,150,30);
		nameLabel.setBackground(Color.GREEN);
		nameLabel.setFont(new Font("Arial", Font.BOLD, 18));
	}

}
