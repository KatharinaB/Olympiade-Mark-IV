package ui.PlayerView.elements;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import db.Database;

public class IconStatPanelController {

	//Ka ob IconImage für uns taugt
	private String [] iconList = {"Strength-Icon.png", "Speed.png", "Health.png", "Dexterity.png", "Stamina.png", "Charisma.png","Intelligence.png","Will.png", "Awareness.png","Teamspirit.png", "Determination.png", "Torment.png"};
	private ArrayList <Integer> statList = new ArrayList<Integer>();
	private IconStatPanel iconStatPanel;
	
	public IconStatPanelController() {
		
		iconStatPanel = new IconStatPanel();
		
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
	
	public void setStatsFromDB(ArrayList<Integer> list) {
		statList = list;
		
	}
	
	public IconStatPanel getView(){
		return iconStatPanel;
	}

}
