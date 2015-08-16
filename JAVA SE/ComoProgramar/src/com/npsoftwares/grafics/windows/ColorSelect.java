package com.npsoftwares.grafics.windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ColorSelect extends JFrame{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> cbColor;
	private Dimension sizeCBColor;
	private JCheckBox chbBackground;
	private JCheckBox chbForeground;
	private JButton   btOk;
	private JButton   btCancel;
	private JPanel panelCima;
	private JPanel panelMeio;
	private JPanel panelBaixo;
	private static final String[]  colorName={"Black","Yellow","Blue","Cyan"};
	Color[] colors = {Color.black,Color.YELLOW,Color.blue,Color.CYAN};
	
	public ColorSelect(Dimension size)
	{
		
		super("ColorSelect");
		setLayout(new BorderLayout());
		
		panelCima = new JPanel();
		panelMeio = new JPanel();
		panelMeio.setBorder(BorderFactory.createTitledBorder("Meio"));
		
		panelBaixo= new JPanel();
		panelBaixo.setBorder(BorderFactory.createTitledBorder("Baixo"));
		
		cbColor = new JComboBox<String>(colorName);
		cbColor.setPreferredSize(size);
		cbColor.setMaximumRowCount(3);
		cbColor.setAlignmentX(CENTER_ALIGNMENT);
		
        chbBackground = new JCheckBox("Background");
        chbForeground = new JCheckBox("Foreground");

		btOk = new JButton("OK");
		btCancel = new JButton("Cancel");
		
		panelCima.add(cbColor);
		panelMeio.add(chbBackground);
		panelMeio.add(chbForeground);
		panelBaixo.add(btOk);
		panelBaixo.add(btCancel);

        add(panelCima,BorderLayout.NORTH);
        add(panelMeio,BorderLayout.CENTER);
        add(panelBaixo,BorderLayout.SOUTH);
        
		cbColor.addItemListener(
			new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) 
				{
					if(e.getStateChange()== ItemEvent.SELECTED)
    				{
    					JOptionPane.showMessageDialog(null, "Daniela te amo!");
    				}
				}
			}
			
		);
	
	}
	
	public void setSizeCBColor(Dimension _sizeCBColor)
	{
		 this.sizeCBColor = _sizeCBColor;
	}
    
	public Dimension getSizeCBColor()
	{
		return sizeCBColor;
	}
}
