package com.npsoftwares.grafics.windows;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<Object> imagesJComboBox;
	private JLabel label;
	private static final String[] names = 
		{"D:\\GitRepository\\Java\\programas java\\ComoProgramar\\src\\com\\npsoftwares\\grafics\\windows\\imagem1.jpg",
		 "D:\\GitRepository\\Java\\programas java\\ComoProgramar\\src\\com\\npsoftwares\\grafics\\windows\\imagem2.jpg",
		 "D:\\GitRepository\\Java\\programas java\\ComoProgramar\\src\\com\\npsoftwares\\grafics\\windows\\imagem3.jpg",
		 "D:\\GitRepository\\Java\\programas java\\ComoProgramar\\src\\com\\npsoftwares\\grafics\\windows\\imagem4.jpg"
		};

	private Icon[] icons = 
		{
			new ImageIcon(names[0]),
			new ImageIcon(names[1]),
			new ImageIcon(names[2]),
			new ImageIcon(names[3])
		};
	
	public ComboBoxFrame()
	{
	    super("Testing JCombobox");
	    setLayout(new FlowLayout());
	    imagesJComboBox = new JComboBox<Object>(names);
	    imagesJComboBox.setMaximumRowCount(3);//exibe no maximo tres linhas
	    
	    imagesJComboBox.addItemListener(
    		new ItemListener()//classe interna anônima
    		{
    			public void itemStateChanged(ItemEvent event)
    			{
    				if(event.getStateChange()== ItemEvent.SELECTED)
    				{
    					label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
    				}
    			}
    		}
	    );
	    
	    add(imagesJComboBox);
	    label = new JLabel(icons[0]);
	    add(label);
	}
	
}
