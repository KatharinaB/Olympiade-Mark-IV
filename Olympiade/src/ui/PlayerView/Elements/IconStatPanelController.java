package ui.PlayerView.elements;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import db.Database;

public class IconStatPanelController {

	//Ka ob IconImage f�r uns taugt
	private String [] iconList = {"Strength-Icon.png", "Health.png", "Stamina.png", "Intelligence.png", "Awareness.png", "Determination.png", "Speed.png", "Dexterity.png", "Charisma.png", "Will.png", "Teamspirit.png", "Torment.png"};
	private ArrayList <Integer> statList = new ArrayList<Integer>();
	private IconStatPanel iconStatPanel;
	private Database db;
	
	public IconStatPanelController(Database db) {
		this.db = db;
		
		iconStatPanel = new IconStatPanel();
		
		getStatsFromDB();
		initIconStatElement();
	}

	//Addet 12 Icons + wert+ skillupPoint
	private void initIconStatElement() {
		for(int i = 0; i < iconList.length; i++){
			IconStatElement ele = new IconStatElement();
			
			
			ele.setIconLabel(iconList[i]); 
			//ele.setstatLabels(statList.get(i));
			
			iconStatPanel.addElement(ele);
			
		}
	}
	
	private void getStatsFromDB() {
		statList = db.getPlayerStats();
		
	}
	
	public IconStatPanel getView(){
		return iconStatPanel;
	}

}
