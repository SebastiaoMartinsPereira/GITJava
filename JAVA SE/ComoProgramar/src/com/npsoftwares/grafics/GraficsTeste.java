package com.npsoftwares.grafics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GraficsTeste {

	public static void main(String[] args) {
		
		String input;
		int choiceuser;
		
		
        JFrame form = new JFrame();
	
        input= JOptionPane.showInputDialog(null,"Enter 1 to draw rectangles \n"
        		                         +"Enter 2 to piramide:\n"
        		                         +"Enter 3 To circulos e quadrados:\n"
        		                         +"Enter 4 para : Circulos\n"
        		                         +"Enter 5 para : Smiles \n"
        		                         +"Enter 6 para : Cone \n"
        		                         +"Enter 7 para : Circulos coloridos \n");
        choiceuser=Integer.parseInt(input);
           
		
		DrawPanel panel =  new DrawPanel();		
	     panel.choice = choiceuser;

		form.add(panel);
		if (choiceuser==5){
			form.setSize(250, 500);
		}else if (choiceuser==6){
			form.setSize(500, 500);
		}else if (choiceuser==7){
			form.setSize(500, 500);
		}else{
			form.setSize(250, 250);
		}

		form.setVisible(true);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}

}
