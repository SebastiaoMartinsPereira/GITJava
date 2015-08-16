package com.npsoftwares.grafics.windows;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JCheckBox boldJCheckBox;
	private JCheckBox italiJCheckBox;

	public CheckBoxFrame() {
		super("JCheckBox Test!!!");

		setLayout(new FlowLayout()); // configura o layout do frame

		textField = new JTextField("Watch the font style change", 20);
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textField);

		boldJCheckBox = new JCheckBox("Boldic");
		italiJCheckBox = new JCheckBox("Italy");
		add(boldJCheckBox);
		add(italiJCheckBox);
		
		//Registradores
		CheckBoxHandler handler = new CheckBoxHandler();
		boldJCheckBox.addItemListener(handler);
		italiJCheckBox.addItemListener(handler);

	}

	private class CheckBoxHandler implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent event) {
			Font font = null;

			// determina o checkBox Marcado
			if (boldJCheckBox.isSelected() && italiJCheckBox.isSelected()) {
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			} else if (boldJCheckBox.isSelected()) {
				font = new Font("Serif", Font.BOLD, 14);
			} else if (italiJCheckBox.isSelected()) {
				font = new Font("Serif", Font.ITALIC, 14);
			} else {
				font = new Font("Serif", Font.PLAIN, 14);
			}
			textField.setFont(font);
		}
	}
}