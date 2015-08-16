package com.npsoftwares.grafics.windows;

import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("unused")
public class Demo {
	
	
	public static void main(String[] args) {
	
	
		
		Printer printer = new Printer();
		printer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		printer.setSize(350,150);
		printer.setVisible(true);
		
		
/*		Aling  aling = new Aling();
		aling.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aling.setSize(350,150);
		aling.setVisible(true);*/
		
		
/*		Dimension size;
		size = new Dimension(330,20);
		
		ColorSelect colorSelect = new ColorSelect(size);
		colorSelect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		colorSelect.setSize(350,150);
		colorSelect.setVisible(true);
		*/
		
/*		ComboBoxFrame cbFrame = new ComboBoxFrame();
		cbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cbFrame.setSize(350,150);
		cbFrame.setVisible(true);
		*/
		
/*		
		RadioButtonFrame rbFrame = new RadioButtonFrame();
		rbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rbFrame.setSize(300,100);
		rbFrame.setVisible(true);*/
		
/*		CheckBoxFrame cbFrame = new CheckBoxFrame();
		cbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cbFrame.setSize(270,170);
		cbFrame.setVisible(true);*/
		
		
/*		ButtonFrame btFrame = new ButtonFrame();
		btFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btFrame.setSize(27,170);
		btFrame.setVisible(true);*/
		
/*		LabelFrame labelFram = new LabelFrame();
		labelFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		labelFram.setSize(260,180);
		labelFram.setVisible(true);*/
		
		
/*		TextFieldFrame textFram = new TextFieldFrame();
		textFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textFram.setSize(260,180);
		textFram.setVisible(true);*/
		
/*		
		//Criar alguns Labels
		JLabel northlabel = new JLabel("North");
		
		//Cria um objeto para inclusão de imagens.
		ImageIcon labelIcon = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\lpa.jpg");
		labelIcon.setDescription("Deu certo ");

		JLabel centerLabel = new JLabel(labelIcon);
		
		JLabel southLabel = new JLabel(labelIcon);
		
		southLabel.setText("South" + 123);
		
		JFrame application = new  JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Adiciona os labels ao JFrame.
		application.add(northlabel,BorderLayout.NORTH);
		application.add(centerLabel,BorderLayout.CENTER);
		application.add(southLabel,BorderLayout.BEFORE_LINE_BEGINS);
		
		application.setSize(300, 300);
		application.setVisible(true);*/
		
	}

}
