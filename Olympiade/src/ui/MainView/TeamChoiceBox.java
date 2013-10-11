package ui.mainView;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;

import ui.eventHandling.UiEvent;
import ui.eventHandling.UiEventDispatcher;
import ui.eventHandling.UiEventListener;

public class TeamChoiceBox extends JComboBox<String> {
	
	private ArrayList<UiEventListener> listeners = new ArrayList<UiEventListener>();
	private String selectedItem;
	
	public TeamChoiceBox(String[] teamArray){
		super(teamArray);
		this.setSelectedIndex(teamArray.length -1);
		this.setBackground(Color.PINK);
		this.setBounds(1010,50,250,30);
		
		setTeamname();
		this.setVisible(true);
	}
	
	public void setTeamname() {
		selectedItem =  (String) this.getSelectedItem();		
	}
	
	public String getTeamname(){
		return selectedItem;
	}
	

}
