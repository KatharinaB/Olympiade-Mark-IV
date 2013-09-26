package ui.TeamView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EventListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import ui.EventHandling.UiEvent;
import ui.EventHandling.UiEventDispatcher;
import ui.EventHandling.UiEventListener;


/**
 * H�lt die Spielerdaten
 * @author Katy
 *
 */
public class PlayerPanel extends JPanel{
	
	
	
	private String []  attributeNames= {"games", "pps", "stamina", "value", "salary", "contract"};
	
	private ArrayList<UiEventListener> listeners = new ArrayList<UiEventListener>();
	
	/**
	 * Enth�lt alle Infos zu einem Spieler
	 */
	public PlayerPanel(){
		this.setBackground(Color.blue);
		this.setVisible(true);
		this.setBorder(new LineBorder(Color.ORANGE));
		this.setBounds(310,50,320,160);
	}

	public void addElement(JComponent comp) {
		this.add(comp);
		
	}
	

	

//	/**
//	 * Initialisiert das ProfilPanel
//	 */
//	private void initProfilPanel() {
//		profilPanel = new JPanel();
//		
//		playerImage = new JLabel("dummyimage"); //TODO Aus DB
//		playerImage.setPreferredSize(new Dimension(100,100));
//		playerImage.addMouseListener( new MouseListener() {
//			
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				dispatch();
//				System.out.println("clicked");
//			}
//		});
//		
//	
//		playerName = new JLabel("dummyspieler"); //TODO Aus DB
//		
//		
//		profilPanel.add(playerName);
//		profilPanel.add(playerImage);
//		profilPanel.setPreferredSize(new Dimension(100,150));
//	}
//
//
//	/**
//	 * Erstellt das StatsPanel mit den Spielerattributen
//	 */
//	private void initStatsPanel() {
//		statsPanel = new JPanel();
//		statsPanel.setPreferredSize(new Dimension(200,150));
//		
//		
//		/*Um jeweils erst 3 Werte aus der einen Liste zu bekommen
//		*dann 3 aus der zweiten Liste, dann wieder 3 aus der ersten 
//		*und zum Schluss 3 aus der zweiten, dienen diese 3 Schleifen
//		*/
//		int j = 0;
//		for(int i = 0; i < attributeNames.length; i++){
//			statsPanel.add(attributes[i]);
//			if(i == 2){
//				for(; j < attributeNames.length; j++){
//					statsPanel.add(attributesVars[j]);
//					if(j == 3){
//						break;
//					}
//				}
//				
//			}
//			
//		}
//		for(; j < attributeNames.length; j++){
//			statsPanel.add(attributesVars[j]);
//		}
//		
//	}
//
//	/**
//	 * Erstellt alle Labels f�r die Stats des Players und setzt sie auf die richtige Gr��e
//	 */
//	private void initPlayerPanel() {
//		attributes = new JLabel[6];
//		attributesVars = new JLabel[6];
//		
//		
//		for(int i = 0; i < attributeNames.length; i++){
//			attributes[i] = new JLabel(attributeNames[i]); 
//			attributesVars[i] = new JLabel("dummy"); //TODO aus der DB
//			
//			attributes[i].setPreferredSize(new Dimension(50,30));
//			attributesVars[i].setPreferredSize(new Dimension(50,30));
//		}
//		
//	}
//	
	


}