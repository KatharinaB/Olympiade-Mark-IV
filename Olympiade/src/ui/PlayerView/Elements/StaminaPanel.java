package ui.PlayerView.elements;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * H�lt die Stamina-Daten des Players
 * @author Katy
 *
 */
public class StaminaPanel extends JPanel{
	
	private JLabel staminaNameLabel;
	private JLabel staminaVarLabel;
	private JLabel staminaMaxLabel;
	
	public StaminaPanel(){
		this.setBounds(0,550,120,20);
		this.setBorder(new LineBorder(Color.MAGENTA));
		
		initLabels();
		
		this.add(staminaNameLabel);
		this.add(staminaVarLabel);
		this.add(staminaMaxLabel);
	}

	private void initLabels() {
		staminaNameLabel = new JLabel("Endurance");
		staminaVarLabel = new JLabel("42"); //TODO DB
		staminaMaxLabel = new JLabel("/30");
	}

}
