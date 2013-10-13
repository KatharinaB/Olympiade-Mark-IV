package ui.mainView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventDispatcher;
import ui.eventHandling.UiEventListener;

/**
 * Enth�lt das Men�
 * @author Katy
 *
 */
public class NavigationPanel extends JPanel implements UiEventDispatcher{
	
	private JButton [] buttons;
	private String [] buttonNames = {"Overview", "Next Round", "Team", "Trainings-Camp", "Standings", "Top Players", "News", "Transfer", "Rumors", "Prize Money"}; 
	
	public NavigationPanel(){
		this.setVisible(true);
		this.setBounds(0,100,150,800);
		
		
		createNavigation();
	}
	
	//TODO ActionListener f�r Buttons + Funktionen
		/**
		 * Initialisiert die Navigationsleiste 
		 */
	public void createNavigation(){

		for(int i = 0; i < buttonNames.length; i++){
			buttons[i] = new JButton(buttonNames[i]);
			
			buttons[i].setPreferredSize(new Dimension(140,30));
			this.add(buttons[i]);
		}
		
		buttons[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispatch(new UiEvent("activateMainView"));
				
			}
		});
	}
	

	@Override
	public void addListener(UiEventListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeListener(UiEventListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispatch(UiEvent event) {
		// TODO Auto-generated method stub
		
	}

}
