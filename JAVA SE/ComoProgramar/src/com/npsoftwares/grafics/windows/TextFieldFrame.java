package com.npsoftwares.grafics.windows;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame {
	
     /**
	 * 
	 */
	 private static final long serialVersionUID = 1L;
     private JTextField textField1;
	 private JTextField textField2;
	 private JTextField textField3;
	 private JPasswordField  passawordField;
     
     
     public TextFieldFrame()
     {
    	 super("Testing JTextField and JPasswordField");
    	 setLayout(new FlowLayout((int) CENTER_ALIGNMENT));
    	 
    	 
    	 textField1 = new JTextField(10);
    	 add(textField1);
    	 
    	 
    	 textField2 = new JTextField("Enter text here");
    	 add(textField2);
    	 
    	 
    	 textField3 = new JTextField("Uneditable text Field",21);
    	 textField3.setEditable(false);
    	 add(textField3);
    	 
    	 
    	 passawordField = new JPasswordField("Hidden text");
    	 add(passawordField);
    	 
    	 
    	 TextFieldHandler handler = new TextFieldHandler();
    	 textField1.addActionListener(handler);
    	 textField2.addActionListener(handler);
    	 textField3.addActionListener(handler);
    	 passawordField.addActionListener(handler);
     }
     
     
     private class TextFieldHandler implements ActionListener
     {
    	 public void actionPerformed(ActionEvent event)
    	 {
    		 String string = "";
    		 
    		 if(event.getSource() == textField1)
    		 {
    			 string = String.format("textField1 : %s",event.getActionCommand());
    		 }
    		 else
    		 if(event.getSource() == textField2)
    		 {
    			 string = String.format("textField2 : %s",event.getActionCommand());
    		 }
    		 else
    		 if(event.getSource() == textField3)
    		 {
    			 string = String.format("textField3 : %s",event.getActionCommand());
    		 }
    		 else
    		 if(event.getSource() == passawordField)
    		 {
    			 string = String.format("passwordField : %s",event.getActionCommand());
    		 }
    		 
    		 JOptionPane.showMessageDialog(null, string);
    	 }
     }
  }


