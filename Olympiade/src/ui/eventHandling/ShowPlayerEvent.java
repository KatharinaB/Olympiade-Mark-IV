package ui.eventHandling;

import gameContent.Player;

public class ShowPlayerEvent extends UiEvent{

	private Player player;
	
	public ShowPlayerEvent(String msg, Player player) {
		super(msg);
		this.player = player;
	}
	
	public Player getPlayer(){
		return player;
	}

}
