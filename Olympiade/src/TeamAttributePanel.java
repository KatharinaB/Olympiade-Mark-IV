import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class TeamAttributePanel extends JPanel{
	
	private TeamPanel teamPanel;
	private DisciplinePanel disciplinePanel;
	private TotalPanel totalPanel;
	
	public TeamAttributePanel(){
		teamPanel = new TeamPanel();
		disciplinePanel = new DisciplinePanel();
		totalPanel = new TotalPanel();

		this.add(teamPanel);
		this.add(disciplinePanel);
		this.add(totalPanel);
		
		this.setBorder(new LineBorder(Color.BLUE));
		
	}

}
