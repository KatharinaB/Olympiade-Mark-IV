package ui;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventListener;

public class MessagePanel extends JPanel implements UiEventListener{

	private JButton button;
	private JTextArea area;
	
	public MessagePanel() {
		this.setLayout(null);
		this.setBounds(450,200,300,160);
		this.setBackground(Color.LIGHT_GRAY);
		this.setBorder(new LineBorder(Color.BLACK));
		
		initButton();
		initLabel();
		
		this.add(area);
		this.add(button);
		
		this.setVisible(false);
	}

	private void initLabel() {
		area = new JTextArea();
		area.setBounds(20,20,260,100);
		this.setVisible(true);
		
	}

	private void initButton() {
		button = new JButton("Schlie�en");
		button.setBounds(50,130,100,20);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisibly();
				
			}
		});
		
	}
	
	public void setVisibly(){
		this.setVisible(false);
	}

	@Override
	public void onUiEventFired(UiEvent event) {
		if(event.getMessage() != "activateTeamView" && event.getMessage() != "activatePlayerView" && event.getMessage() != "activateMainView" ){
			area.setText(event.getMessage());
		}
		setVisible(true);
	}

}
