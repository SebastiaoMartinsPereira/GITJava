package com.npsoftwares.grafics.windows;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton plainButton;
	private JButton fancyButton;
	
	public ButtonFrame()
	{
		super("Testing Buttons");
		setLayout(new FlowLayout());
		
		plainButton = new JButton("plainButton");
		add(plainButton);   //add ao Frame
		
		 Icon bug1 = new ImageIcon(getClass().getResource("GUItip.gif.gif"));
		 Icon bug2 = new ImageIcon(getClass().getResource("Copy of GUItip.gif.gif"));
		 
		 fancyButton = new JButton("fancyButton",bug1);
		 fancyButton.setRolloverIcon(bug2);
		 add(fancyButton); 
		 
		 ButtonHandler handler = new ButtonHandler();
		 fancyButton.addActionListener(handler);
		 plainButton.addActionListener(handler);
		 
	}
		 	 
	private class ButtonHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{
	
	        JOptionPane.showMessageDialog(ButtonFrame.this, 
	        		String.format("You Pressed: %s ", event.getActionCommand()));
		} 
	} 
} 
