package ui.PlayerView.elements;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class IconStatPanelController {

	//Ka ob IconImage f�r uns taugt
	//private ArrayList <ImageIcon> iconlist = new ArrayList<IconImage>();
	//private ArrayList <Integer> statList = new ArrayList<Integer>();
	private IconStatPanel iconStatPanel;
	
	public IconStatPanelController() {
		iconStatPanel = new IconStatPanel();
		
		//getIconsFromDB();
		//getStatsFromDB();
		initIconStatElement();
	}

	//Addet 12 Icons + wert+ skillupPoint
	private void initIconStatElement() {
		for(int i = 0; i < 12; i++){
			IconStatElement ele = new IconStatElement();
			//ele.setIconLabel(iconList[i]); //TODO so oder so �hnlich mit DB Infos f�ttern
			//ele.setstatLabels(valueList[i]);
			//ele.setSkillPointButton();
			iconStatPanel.addElement(ele);
			
		}
	}

	private void getIconsFromDB() {
		//Spricht mit der Db Klasse
		
	}
	
	private void getStatsFromDB() {
		//Spricht mit der Db Klasse
		
	}
	
	public IconStatPanel getView(){
		return iconStatPanel;
	}

}
