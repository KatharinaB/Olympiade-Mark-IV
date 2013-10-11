package ui.loginView;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;

import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventDispatcher;
import ui.eventHandling.UiEventListener;
import db.Database;

public class LoginPanelController  implements UiEventDispatcher{

	
	private LoginPanel loginPanel;
	private Database db;
	private ArrayList<UiEventListener> listeners = new ArrayList<UiEventListener>();
	private JButton button;
	private String user;
	
	
	public LoginPanelController(Database db) {
		this.db = db;
		
		loginPanel = new LoginPanel();
		button = loginPanel.getButton();
		
		
		button.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String inputPW = getPW(loginPanel.getPW().getPassword());
				
				if(loginPanel.getUsername().getText() != "" && inputPW != "" ){
					if(checkLoginData(loginPanel.getUsername().getText(), inputPW)){
						user = loginPanel.getUsername().getText();
						dispatch(new UiEvent("activateMainView"));
						
					}else{
						dispatch(new UiEvent("Passwort oder Benutzername falsch"));
						
					}
				}else{
					dispatch(new UiEvent("bitte beide Fehler ausf�llen"));
				}	
			}
		});
	}
	
	private boolean checkLoginData(String text, String inputPW) {
		return db.checkLoginData(loginPanel.getUsername().getText(), inputPW);
	
	}
	
	private String getPW(char[] password) {
		String pw = "";
		
		for(int i = 0; i < password.length; i++){
			pw += password[i];
		}
		
		return pw;
	}
	
	public String getUser(){
		return user;
	}

	
	public LoginPanel getView(){
		return loginPanel;
		
	}
	
	@Override
	public void addListener(UiEventListener listener) {
		listeners.add(listener);
		
	}

	@Override
	public void removeListener(UiEventListener listener) {
		listeners.remove(listener);
		
	}

	@Override
	public void dispatch(UiEvent event) {
		for(UiEventListener lis: listeners){
			lis.onUiEventFired(event);
		}
		
	}
}
