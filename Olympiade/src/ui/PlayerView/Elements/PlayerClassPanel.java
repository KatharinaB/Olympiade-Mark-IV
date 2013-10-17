package ui.PlayerView.elements;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Hält Informationen über die Klasse und die Ausrichtung des Spielers
 * @author Katy
 *
 */
public class PlayerClassPanel extends JPanel{
	
	private JLabel alignmentLabel;
	private JLabel classLabel;
	private JLabel alignmentVarLabel;
	private JLabel classVarLabel;
	
	public PlayerClassPanel(String alignment, String heroClass){
		this.setBounds(330,480,200,70);
		
		initLabels(alignment, heroClass);
		
		this.add(alignmentLabel);
		this.add(alignmentVarLabel);
		this.add(classLabel);
		this.add(classVarLabel);
	}

	private void initLabels(String alignment, String heroClass) {
		alignmentLabel = new JLabel("Alignment");
		classLabel = new JLabel("Class");
		alignmentLabel.setPreferredSize(new Dimension(70,20));
		classLabel.setPreferredSize(new Dimension(70,20));
		
		//TODO aus Db
		alignmentVarLabel = new JLabel(alignment);
		classVarLabel = new JLabel(heroClass);
		alignmentVarLabel.setPreferredSize(new Dimension(110,20));
		classVarLabel.setPreferredSize(new Dimension(110,20));
		
	}

}
