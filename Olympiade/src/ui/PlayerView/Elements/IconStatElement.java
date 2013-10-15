package ui.PlayerView.elements;

import helper.IconCreator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Packt Skillicon, skillwert, und skillupm�glichkeit zusammen
 * @author Katy
 *
 */
public class IconStatElement extends JPanel{
	
	private JLabel iconLabel;
	private JLabel statLabel;
	private JLabel skillPointLabel;
	
	public IconStatElement(){
		initIconStatElement();
	}

	private void initIconStatElement() {
		iconLabel = new JLabel();
		statLabel = new JLabel();
		skillPointLabel = new JLabel();
		
		//�ber iconStatPanel aufrufen, mit db infos f�ttern
		
		setstatLabels(42);
		setSkillButtons();
		//
		
		this.add(iconLabel);
		this.add(statLabel);
		this.add(skillPointLabel);
		this.setPreferredSize(new Dimension(140,50));
		
	}
	
	//Wei� nich ob der Typ ImageIcon f�r uns funktioniert, dann mal testen
	public void setIconLabel(String iconName){
	
		ImageIcon icon = IconCreator.createImageIcon("../../../res/icons/"+iconName,"");
		icon.setImage(icon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		iconLabel.setIcon(icon);
		iconLabel.setPreferredSize(new Dimension(40,40));
	}
	
	public void setSkillButtons(){
		
		ImageIcon icon = IconCreator.createImageIcon("../../../res/icons/lvlup.png","");
		skillPointLabel.setIcon(icon);
		icon.setImage(icon.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
		skillPointLabel.setPreferredSize(new Dimension(25, 25));
		skillPointLabel.addMouseListener(new MouseListener() {
			
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
				skillPointLabel.setVisible(false);
				
			}
		});
		
		this.add(skillPointLabel);
		
		//skillPointLabel.setVisible(false);
	}
	
	public void setstatLabels(int value){
		statLabel.setText(Integer.toString(value));
		statLabel.setPreferredSize(new Dimension(40,15));
		statLabel.setHorizontalAlignment(JLabel.RIGHT);
	}
	
	public void changeSkillUpVisibility(Boolean bool){
		skillPointLabel.setVisible(bool);
	}


}
