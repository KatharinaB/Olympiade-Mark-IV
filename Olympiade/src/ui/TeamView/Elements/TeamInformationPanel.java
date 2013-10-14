package ui.TeamView.elements;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Hält Teaminformationen
 * @author Katy
 *
 */
public class TeamInformationPanel extends JPanel{
	
	private String [] attributesNames = {"Budget", "Income", "Salaries", "Transfers", "Bonus", "Prize Money", "Training", "Regeneration", "Forecast"};
	private JLabel [] attributes;
	private JLabel [] attributesVars;
	
	public TeamInformationPanel(){
		this.setBackground(Color.LIGHT_GRAY);
		this.setPreferredSize(new Dimension(200,360));
		initAttributePanels();
	}

	private void initAttributePanels() {
		attributes = new JLabel [attributesNames.length];
		attributesVars = new JLabel [attributesNames.length];
		
		for(int i = 0; i < attributesNames.length; i++){
			attributes[i] = new JLabel(attributesNames[i]);
			attributes[i].setPreferredSize(new Dimension(93,30));
			
			attributesVars[i] = new JLabel("dummy"); //TODO aus DB
			attributesVars[i].setPreferredSize(new Dimension(93,30));
			attributesVars[i].setHorizontalAlignment(JLabel.RIGHT);
			
			this.add(attributes[i]);
			this.add(attributesVars[i]);
			
		}
		
	}
	

}
