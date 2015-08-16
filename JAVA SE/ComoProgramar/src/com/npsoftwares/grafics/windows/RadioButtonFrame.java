package com.npsoftwares.grafics.windows;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class RadioButtonFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private Font plainFont;
	private Font italicFont;
	private Font boldItalicFont;
	private Font boldeFont;
	private JRadioButton plainRadioButton;
	private JRadioButton italicRadioButton;
	private JRadioButton boldRadioButton;
	private JRadioButton italicBoldRadioButton;

	private ButtonGroup radioGroup;
	
	//Construtor da classe
	public RadioButtonFrame()
	{
	    super("RadioButton Teste");
	    setLayout(new FlowLayout());
	    textField = new JTextField("Watch the font style change.",25);
	    add(textField);
	    
	    //Craição e definação se cada objeto
	    plainRadioButton  =new JRadioButton("Plain",true);
	    boldRadioButton = new JRadioButton("Bold",false);
	    italicRadioButton = new JRadioButton("Italic",false);
	    italicBoldRadioButton = new JRadioButton("Bold/Italic",false);
	    
	    //inclusão dos objetos no frame
	    add(plainRadioButton);
	    add(italicRadioButton);
	    add(boldRadioButton);
	    add(italicBoldRadioButton);
	    
	    //Adiciona oa Buttons ao Group
	    radioGroup = new ButtonGroup();
	    radioGroup.add(plainRadioButton);
	    radioGroup.add(boldRadioButton);
	    radioGroup.add(italicRadioButton);
	    radioGroup.add(italicBoldRadioButton);
	    
	    
	    //criação das fontes
	    plainFont = new Font("Serif",Font.PLAIN,14);
	    italicFont = new Font("Serif",Font.ITALIC,14);
	    boldeFont = new Font("Serif",Font.BOLD,14);
	    boldItalicFont = new Font("Serif",Font.BOLD + Font.ITALIC,14);
	    textField.setFont(plainFont);//configura a font especial como simples
	    
        //Registra eventos para JradioButtons
	    plainRadioButton.addItemListener(new RadioButtonHandler(plainFont));
	    italicRadioButton.addItemListener(new RadioButtonHandler(italicFont));
	    boldRadioButton.addItemListener(new RadioButtonHandler(boldeFont));
	    italicBoldRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont ));
	    
	 }
	
	 //Classe interna que trata os eventos de botão (RadioButton)
	 private class RadioButtonHandler implements ItemListener
	 {
        private Font font;
        
        //Contrutor define a font
		public RadioButtonHandler(Font f)
		{
		    font = f;
		}
		
		@Override //ouvinte troca a font do radio Button ao ser chamado.a
		public void itemStateChanged(ItemEvent e) 
		{
              textField.setFont(font);
		}
		 
	 }
	
}
