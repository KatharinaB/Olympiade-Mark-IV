package ui.PlayerView.elements;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Stellt die gespielten Spiele, die Troph�en sowie die Top 4,8 und 16 dar
 * @author Katy
 *
 */
public class PlayerTrophiesPanel extends JPanel{
	
	private JLabel [] trophyLabels;
	private String [] trophyLabelText;
	
	public PlayerTrophiesPanel(){
		this.setBounds(330,250,390,100);
		this.setBorder(new LineBorder(Color.CYAN));
		
		initlabelTexts();
		initTrophyLabels();
			
	}

	private void initTrophyLabels() {
		trophyLabels = new JLabel [14];
		
		for(int i = 0; i < trophyLabels.length; i++){
			trophyLabels[i] = new JLabel(trophyLabelText[i]);
			trophyLabels[i].setPreferredSize(new Dimension(90,20));
			
			if(trophyLabels[i] == trophyLabels[1]){
				trophyLabels[i].setPreferredSize(new Dimension(280,20));
			}
			
			
			this.add(trophyLabels[i]);
		}
		
	}
	//TODO aus DB
	private void initlabelTexts() {
		trophyLabelText = new String [14];
		
		trophyLabelText[0] = "Games Played";
		trophyLabelText[1] = "var"; 
		trophyLabelText[2] = "Gold Icon";
		trophyLabelText[3] = "var";
		trophyLabelText[4] = "Top 4";
		trophyLabelText[5] = "var";
		trophyLabelText[6] = "Silver Icon"; 
		trophyLabelText[7] = "var";
		trophyLabelText[8] = "Top 8";
		trophyLabelText[9] = "var";
		trophyLabelText[10] = "Bronze icon";
		trophyLabelText[11] = "var"; 
		trophyLabelText[12] = "Top 16";
		trophyLabelText[13] = "var";
	
		
	}

}
