import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Hält die Summe der Teamattribute
 * @author Katy
 *
 */
public class TotalPanel extends JPanel{
	
	private JLabel totalLabel;
	private JLabel totalVarLabel;
	
	public TotalPanel(){
		this.setBackground(Color.GRAY);

		this.setPreferredSize(new Dimension(150,30));
		initTotalPanel();
	}

	public void initTotalPanel(){
		totalLabel = new JLabel("Total:");
		totalVarLabel = new JLabel("dummy"); //TODO aus DB
		totalLabel.setPreferredSize(new Dimension(80,20));
		this.add(totalLabel);
		this.add(totalVarLabel);
	}
}
