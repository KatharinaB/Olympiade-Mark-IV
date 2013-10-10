package ui.loginView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class LoginPanel extends JPanel{
	
	private JPasswordField password;
	private JTextArea username;
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JButton loginButton;
	

	//TODO eingaben überprüfen
	//TODO mit tab weiter springen
	//TODO Fehlermeldung werfen bei falschem PW oder Namen
	public LoginPanel() {
		this.setLayout(null);
		this.setBounds(0,0,1000,800);
		

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
		loginButton.setBounds(400,380,150,20);
		
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
			
				
			}
		});
	}

	private void initFields() {
	
		usernameLabel = new JLabel("Username: ");
		passwordLabel = new JLabel("Password: ");
		password = new JPasswordField();
		username = new JTextArea();
		
		usernameLabel.setLabelFor(username);
		passwordLabel.setLabelFor(password);
		
		usernameLabel.setBounds(400,280,150,20);
		username.setBounds(400,300,150,20);
		passwordLabel.setBounds(400,330,150,20);
		password.setBounds(400,350,150,20);

	}
	

}
