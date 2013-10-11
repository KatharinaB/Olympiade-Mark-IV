package ui.loginView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventDispatcher;
import ui.eventHandling.UiEventListener;

import db.Database;

public class LoginPanel extends JPanel implements UiEventDispatcher{
	
	private ArrayList<UiEventListener> listeners = new ArrayList<UiEventListener>();
	
	private JPasswordField password;
	private JTextArea username;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JButton loginButton;
	private Database db;

	//TODO eingaben �berpr�fen
	//TODO mit tab weiter springen
	//TODO Fehlermeldung werfen bei falschem PW oder Namen
	public LoginPanel(Database db) {
		this.db = db;
		
		this.setLayout(null);
		this.setBounds(500,400,150,130);
	
		
		initFields();
		initButton();
		
		this.add(usernameLabel);
		this.add(passwordLabel);
		this.add(username);
		this.add(password);
		this.add(loginButton);
		
		this.setVisible(true);
	}

	private void initButton() {
		loginButton = new JButton("Einloggen");
		loginButton.setBounds(0,100,150,20);
		
		loginButton.addMouseListener(new MouseListener() {
			
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
				String inputPW = getPW(password.getPassword());
				
				if(username.getText() != "" && inputPW != "" ){
					if(db.checkLoginData(username.getText(), inputPW)){
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
	
	private String getPW(char[] password) {
		String pw = "";
		
		for(int i = 0; i < password.length; i++){
			pw += password[i];
		}
		
		return pw;
	}

	private void initFields() {
	
		usernameLabel = new JLabel("Username: ");
		passwordLabel = new JLabel("Password: ");
		password = new JPasswordField();
		username = new JTextArea();
		
		usernameLabel.setLabelFor(username);
		passwordLabel.setLabelFor(password);
		
		usernameLabel.setBounds(0,0,150,20);
		username.setBounds(0,20,150,20);
		passwordLabel.setBounds(0,50,150,20);
		password.setBounds(0,70,150,20);

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
