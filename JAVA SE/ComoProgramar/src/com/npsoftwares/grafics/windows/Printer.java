package com.npsoftwares.grafics.windows;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Printer extends JFrame {
	
	private JPanel pnConteiner;
	private JLabel lbPrinter;
	private JLabel lbprintQuality;
	private JCheckBox cbImage;
	private JCheckBox cbText;
	private JCheckBox cbCode;
	private JCheckBox cbPrintFile;
	private JComboBox<String> cbSize;
	private JButton btOk;
	private JButton btCancel;
	private JButton btSetup;
	private JButton btHelp;
	private JPanel  pnEsquerdo;
	private JPanel pnCentro;
	private JPanel pnDireito;
	
	
	public Printer()
	{
		super("Printer");
		
	}
	
	public JPanel getPainelConteiner()
	{
		if(pnConteiner == null)
		{
			pnConteiner = new JPanel();
			pnConteiner.setLayout(null);
			//pnConteiner.setBorder(new EmptyBorder(5,5,5,5));
			pnConteiner.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			
			
		}
		return pnCentro;
		
	}

}
