package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;



/**
 * H�lt alle Panels f�r die Mainsite und die Teamansicht
 * @author Katy
 *
 */
public class MainPanel extends JPanel {

	public MainPanel(){
		//null-Layout -  alle Elemente sind frei positionierbar
		this.setLayout(null);
	}


	public void addElement(JComponent comp) {
		this.add(comp);
	}
	
	public void removeElement(JComponent comp) {
		this.remove(comp);
	}

}
