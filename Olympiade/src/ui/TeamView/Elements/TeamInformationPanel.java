package ui.TeamView.elements;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * H�lt Teaminformationen
 * @author Katy
 *
 */
public class TeamInformationPanel extends JPanel{
	
	private String [] attributesNames = {"Budget", "Income", "Salaries", "Transfers", "Bonus", "Prize Money", "Training", "Regeneration", "Forecast"};
	private JLabel [] attributes;
	private JLabel [] attributesVars;
	
	public TeamInformationPanel(){
		this.setBackground(Color.LIGHT_GRAY);
		this.setPreferredSize(new Dimension(150,360));
		initAttributePanels();
	}

	private void initAttributePanels() {
		attributes = new JLabel [attributesNames.length];
		attributesVars = new JLabel [attributesNames.length];
		
		for(int i = 0; i < attributesNames.length; i++){
			attributes[i] = new JLabel(attributesNames[i]);
			attributesVars[i] = new JLabel("dummy"); //TODO aus DB
			attributes[i].setPreferredSize(new Dimension(80,30));
			this.add(attributes[i]);
			this.add(attributesVars[i]);
			
		}
		
	}
	

}
