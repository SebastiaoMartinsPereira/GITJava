package com.npsoftwares.grafics.windows;

import java.awt.FlowLayout;    //especifica como os componentes são organizados
import javax.swing.JFrame;     //fornecee recursos básicos as janelas
import javax.swing.JLabel;     //exibe textos e imagens
import javax.swing.SwingConstants;   //constantes comuns utilazadas com Swing
import javax.swing.Icon;     //interface utilizada para manipular imagens
import javax.swing.ImageIcon;  //carregar imagens

public class LabelFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	
	public LabelFrame()
	{
	    super("Testing JLabel");	
	    setLayout( new FlowLayout());  //configura o layout de frame
	    
	    label1 = new JLabel("Label with text");
	    label1.setToolTipText("This is label1");
	    add(label1);            //adiciona o label ao frame
 
	    
	    Icon bug = new ImageIcon(getClass().getResource("GUItip.gif.gif"));
	    label2 = new JLabel("Label with text and icon",bug,SwingConstants.LEFT);
	    label2.setToolTipText("This is label2");
	    add(label2);
	    
	    
	    label3 = new JLabel();
	    label3.setText("Label with icob and text at bottom");
	    label3.setIcon(bug);
	    label3.setHorizontalTextPosition(SwingConstants.CENTER);
	    label3.setToolTipText("This is label3");
	    add(label3);
	    
	}
	
	

}
