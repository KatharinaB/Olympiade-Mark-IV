package ui.PlayerView.elements;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

//TODO evt nochmal schön machen ohne soviel redundanten Code
public class PlayerValue extends JPanel{

	private JLabel valueLabel;
	private JLabel salaryLabel;
	private JLabel contractLabel;
	
	private JLabel valueVarLabel;
	private JLabel salaryVarLabel;
	private JLabel contractVarLabel;
	
	private JLabel valueCurrencyLabel;
	private JLabel salaryCurrencyLabel;
	private JLabel contractCurrencyLabel;
	
	public PlayerValue(String [] values) {
		this.setBounds(330,80,170,70);
		
		initLabels();
		initVars(values);
		
		this.add(valueLabel);
		this.add(valueVarLabel);
		this.add(valueCurrencyLabel);
		
		this.add(salaryLabel);
		this.add(salaryVarLabel);
		this.add(salaryCurrencyLabel);
		
		this.add(contractLabel);
		this.add(contractVarLabel);
		this.add(contractCurrencyLabel);
		
	}

	/**
	 * Setzt mit Daten aus DB
	 */
	private void initVars(String [] values) {
		valueVarLabel.setText(values[0]);
		salaryVarLabel.setText(values[1]);
		contractVarLabel.setText(values[2]);
		
	}

	private void initLabels() {
		valueLabel = new JLabel("Value:");
		salaryLabel = new JLabel("Salary:");
		contractLabel = new JLabel("Contract:");
		
		valueVarLabel = new JLabel();
		salaryVarLabel = new JLabel();
		contractVarLabel = new JLabel();
		
		valueCurrencyLabel = new JLabel("Mio");
		salaryCurrencyLabel = new JLabel("Mio");
		contractCurrencyLabel = new JLabel("Games");
		
		valueLabel.setPreferredSize(new Dimension(70,15));
		salaryLabel.setPreferredSize(new Dimension(70,15));
		contractLabel.setPreferredSize(new Dimension(70,15));
		
		valueCurrencyLabel.setPreferredSize(new Dimension(55,15));
		salaryCurrencyLabel.setPreferredSize(new Dimension(55,15));
		contractCurrencyLabel.setPreferredSize(new Dimension(55,15));
		
		valueVarLabel.setPreferredSize(new Dimension(25,15));
		salaryVarLabel.setPreferredSize(new Dimension(25,15));
		contractVarLabel.setPreferredSize(new Dimension(25,15));
		
		valueVarLabel.setHorizontalAlignment(JLabel.RIGHT);
		salaryVarLabel.setHorizontalAlignment(JLabel.RIGHT);
		contractVarLabel.setHorizontalAlignment(JLabel.RIGHT);
		
	}

}
