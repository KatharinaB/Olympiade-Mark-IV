import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;


public class TeamAttributePanel extends JPanel{
	
	private TeamPanel teamPanel;
	private DisciplinePanel disciplinePanel;
	private TotalPanel totalPanel;
	
	/**
	 * Fasst alle AttributPanel des Teams zu einem Panel zusammen
	 */
	public TeamAttributePanel(){
		teamPanel = new TeamPanel();
		disciplinePanel = new DisciplinePanel();
		totalPanel = new TotalPanel();

		
		this.add(teamPanel);//Hält die allgemeinen Infos
		this.add(disciplinePanel);//Hält Infos zu den Disziplinen
		this.add(totalPanel);//Für den Gesamtwert
		
	}

}
