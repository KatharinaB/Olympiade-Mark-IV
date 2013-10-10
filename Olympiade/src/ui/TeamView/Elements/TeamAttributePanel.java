package ui.TeamView.elements;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;



/**
 * H�lt alles zusammen was f�r die Teamansicht gebraucht wird
 * @author Katy
 *
 */
public class TeamAttributePanel extends JPanel{
	
	private TeamInformationPanel teamPanel;
	private DisciplinePanel disciplinePanel;
	private TotalPanel totalPanel;
	
	
	public TeamAttributePanel(){
		
		initTeamAttributePanel();

		this.setBorder(new LineBorder(Color.BLACK));
		this.setBounds(0, 0, 150, 650);	
	}
	
	private void initTeamAttributePanel() {
		teamPanel = new TeamInformationPanel();
		disciplinePanel = new DisciplinePanel();
		totalPanel = new TotalPanel();
		
		this.add(teamPanel);//H�lt die allgemeinen Infos
		this.add(disciplinePanel);//H�lt Infos zu den Disziplinen
		this.add(totalPanel);//F�r den Gesamtwert
	}
}