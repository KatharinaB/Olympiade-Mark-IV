package ui;

import java.awt.Dimension;

import javax.swing.JLabel;


//TODO Alle Daten aus DB
/**
 * Stellt die Playerdetailansicht dar
 * @author Katy
 *
 */
public class PlayerView {
	
	private JLabel playerImage;
	private IconStatPanel iconStatPanel;
	private PlayerDetailPanel playerDetailPanel;
	
	public PlayerView(){
		
		initPlayerViewComponents();
		
	}

	private void initPlayerViewComponents() {
		playerImage = new JLabel("DummyBild"); 
		playerImage.setPreferredSize(new Dimension(295,295));
		
	}

}
