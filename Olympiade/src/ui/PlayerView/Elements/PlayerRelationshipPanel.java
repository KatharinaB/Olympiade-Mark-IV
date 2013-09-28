package ui.PlayerView.Elements;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Stellt Freunde und Feinde dar
 * @author Katy
 *
 */
public class PlayerRelationshipPanel extends JPanel{
	
	private JLabel relationshipFriendsLabel;
	private JLabel relationshipRivalsLabel;
	private JLabel relationshipMembersLabelFriends;
	private JLabel relationshipMembersLabelRivals;
	
	public PlayerRelationshipPanel() {
		
		this.setBounds(330,550,400,100);
		this.setBorder(new LineBorder(Color.MAGENTA));
		
		initRelationShipLabels();
		
		
		this.add(relationshipFriendsLabel);
		this.add(relationshipMembersLabelFriends);
		this.add(relationshipRivalsLabel);
		this.add(relationshipMembersLabelRivals);
	}

	private void initRelationShipLabels() {
		relationshipFriendsLabel =  new JLabel("Friends:");
		relationshipRivalsLabel =  new JLabel("Rivals:");
		relationshipFriendsLabel.setPreferredSize(new Dimension(80,35));
		relationshipRivalsLabel.setPreferredSize(new Dimension(80,35));
		
		//TODO aus Db String zusammen bauen und einf�gen
		relationshipMembersLabelFriends = new JLabel("vars mit Links");
		relationshipMembersLabelFriends.setPreferredSize(new Dimension(300,35));
		
		relationshipMembersLabelRivals = new JLabel("vars mit Links");
		relationshipMembersLabelRivals.setPreferredSize(new Dimension(300,35));
	}

}
