package ui.PlayerView.elements;

import helper.IconCreator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Hält Die Stats mit Ihren Bildchen und Werten
 * @author Katy
 *
 */
public class IconStatPanel extends JPanel{
	
	public IconStatPanel(){
		this.setBounds(0,330,295,350);
	}

	
	public void addElement(JComponent comp){	
		this.add(comp);
	
	}

}
