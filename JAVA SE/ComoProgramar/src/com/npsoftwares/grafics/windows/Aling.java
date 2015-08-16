package com.npsoftwares.grafics.windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.SystemColor;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Aling extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JCheckBox chkSnap;
	private JCheckBox chkShow;
	private JLabel lbX;
	private JLabel lbY;
	private JTextField txtX;
	private JTextField txtY;
	private JButton btOk;
	private JButton btCancel;
	private JButton btHelp;
	private JPanel painelConteiner;
	private JPanel painel1;
	private JPanel painel2;
	private JPanel painel3;
	private JPanel painel4;
	private JPanel painel5;
	private Dimension buttonD; 
	
	public Aling()
	{
		super("Aligment");
        setButtonDimension(70, 25);
		add(getPanelConteiner());
	}
	
	public JPanel getPanelConteiner()
	{
		if(painelConteiner == null)
		{
			painelConteiner = new JPanel();
			painelConteiner.setLayout(new BorderLayout(5,5));
			painelConteiner.setBorder(new EmptyBorder(5,5,5,5));
			painelConteiner.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			painelConteiner.setBackground(SystemColor.activeCaptionBorder);

			
			painelConteiner.add(getPanel1(),BorderLayout.WEST);
			painelConteiner.add(getPanel2(),BorderLayout.CENTER);
			painelConteiner.add(getPanel5(),BorderLayout.EAST);
          

			painel1.add(getChkSnap(),BorderLayout.CENTER);
			painel1.add(getChkShow(),BorderLayout.CENTER);
			
			painel2.add(getPanel3());
			painel2.add(getPanel4());
			
			painel3.add(getLBX());
			painel3.add(getLBY());
			
			painel4.add(getTxtX());
			painel4.add(getTxtY());
			
			
			painel5.add(getBtOk());
			painel5.add(getBtCancel());
			painel5.add(getBtHelp());
			
			
		}
		
		return painelConteiner;
	}
	
	public JPanel getPanel1()
	{
		painel1 = new JPanel();
		painel1.setLayout(new BoxLayout(painel1,BoxLayout.PAGE_AXIS));
		painel1.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		painel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		painel1.setBackground(SystemColor.activeCaptionBorder);
		painel1.setSize(10, 20);
		return painel1;
	}
	
	public JPanel getPanel2()
	{
		painel2 = new JPanel();
		painel2.setLayout(new GridLayout(1,2,0,0));
		painel2.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		painel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		painel2.setBackground(SystemColor.activeCaptionBorder);
		return painel2;
	}
	
	public JPanel getPanel3()
	{
		painel3 = new JPanel();
		painel3.setLayout(new GridLayout(3,0,0,10));
		painel3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		painel3.setBackground(SystemColor.activeCaptionBorder);
		return painel3;
	}
	
	public JPanel getPanel4()
	{
		painel4 = new JPanel();
		painel4.setLayout(new FlowLayout(FlowLayout.TRAILING));
		painel4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		painel4.setBackground(SystemColor.activeCaptionBorder);
		return painel4;
	}
	
	public JPanel getPanel5()
	{
		painel5 = new JPanel();
		//painel5.setLayout(new BoxLayout(painel5,BoxLayout.Y_AXIS));
		//painel5.setLayout(null);
		painel5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		painel5.setBackground(SystemColor.activeCaptionBorder);
		return painel5;
	}
	
	public JCheckBox getChkSnap()
	{
		chkSnap = new JCheckBox("Snap to Grip",false);
		chkSnap.setBackground(SystemColor.activeCaptionBorder);
		chkSnap.setSize(1000, 1000);
		return chkSnap;
	}
	
	public JCheckBox getChkShow()
	{
		chkShow = new JCheckBox("Show grid",false);
		chkShow.setBackground(SystemColor.activeCaptionBorder);
		return chkShow;
	}
	
	
	public JLabel getLBX()
	{
		lbX = new JLabel("X:");
		lbX.setBackground(SystemColor.activeCaptionBorder);
		return lbX;
	}
	
	public JLabel getLBY()
	{
		lbY = new JLabel("Y:");
		lbY.setLocation(200, 50);
		lbY.setPreferredSize(new Dimension(100,100));
		lbY.setBackground(SystemColor.activeCaptionBorder);
		return lbY;
	}
	
	public JTextField getTxtX()
	{
		txtX = new JTextField("null");
		return txtX;
	}
	
	
	public JTextField getTxtY()
	{
		txtY = new JTextField("null");
		return txtY;
	}
	
	
	
	public JButton getBtOk()
	{
		btOk = new JButton("OK");
		btOk.setPreferredSize(getButtonDimension());
		return btOk;
	}
	

	public JButton getBtCancel()
	{
		btCancel = new JButton("Cancel");
		btCancel.setPreferredSize(getButtonDimension());
		return btCancel;
	}
	
	
	public JButton getBtHelp()
	{
		btHelp = new JButton("Help");
		btHelp.setPreferredSize(getButtonDimension());
		return btHelp;
	}
	
    public  void setButtonDimension(int width,int height)
    {
    
    	buttonD = new Dimension(width,height);
    }
	
  
    public  Dimension getButtonDimension()
    {   
    	return buttonD;
    }
    

	
	
	
	
}
