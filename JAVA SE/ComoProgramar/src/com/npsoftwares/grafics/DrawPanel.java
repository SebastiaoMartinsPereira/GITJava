package com.npsoftwares.grafics;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel; 

@SuppressWarnings("serial")
public class DrawPanel extends JPanel {
     
	int choice = 0;

	public void paintComponent(Graphics g){
	
		int i=0;
		super.paintComponent(g);
		int expan=0,count=0;
		
	    switch (choice) {
	    
		case 1:
			
			while (i<getWidth()){
				
				//linhas formando um espaço em branco no centro 
				g.setColor(Color.BLACK);
				g.drawLine(0,0+i,0+i,getHeight());
				g.drawRect(0,0,getWidth(),50);
				
				g.setColor(Color.green);
				g.drawLine(0+i,0,0,getHeight()-i);
				
				g.setColor(Color.BLUE);
				g.drawLine(getWidth(),0+i,getWidth()-i,getHeight());
				
				g.setColor(Color.YELLOW);
				g.drawLine(getWidth()-i,0,getWidth(),getHeight()-i);
				
						i=i+10;
	
			}
			break;
		case 2:
			
			while (i<getWidth()){
				

				//formação de uma piramide
				g.setColor(Color.BLACK);
				g.drawLine(0,0,0+i,getWidth()-i);
				
				//g.setColor(Color.gray);
			    g.drawLine(getWidth(),0,getWidth()-i,getHeight()-i);
			    
				//g.setColor(Color.CYAN);
				g.drawLine(getWidth(),getHeight(),0+i,getWidth()-i);
				
				//g.setColor(Color.RED);		
				g.drawLine(0,getHeight(),(getWidth()-i),getHeight()-i);

                 i=i+10;
						
			}
			
			break;
		case 3:
			
			while (i<getWidth()){  //circulos e quadrados 
                
				g.setColor(Color.YELLOW);
				g.drawRect(getWidth()/2-i,getHeight()/2-i,10+i*2,10+i*2);
				g.setColor(Color.blue);
				g.drawOval(getWidth()/2-i,getHeight()/2-i,10+i*2,10+i*2);
				i=i+10;
						
			}
			
			break;
			
		case 4:
			while (i<200){ //circulos

			    g.fillOval(i, i, 50+ i* 10, 50+i*10);
		
				i=i+10;
						
			}
			break;
		case 5:  //rostos

			//desenha o rosto
			g.setColor(Color.YELLOW);
			g.fillOval(10, 10, 200, 200);
			
			//desenha os olhos
			g.setColor(Color.black);
			g.fillOval(55, 65, 30, 30);
			g.fillOval(135, 65, 30, 30);
			
			//desenha a boca
			g.fillOval(50, 110, 120, 60);
			
			//retoca a boca
			g.setColor(Color.YELLOW);
			g.fillRect(50, 110, 120, 30);
			g.fillOval(50, 120, 120, 40);
			
	
			
			//desenha o rosto
			g.setColor(Color.YELLOW);
			g.fillOval(10, 210, 200, 200);
			
			//desenha os olhos
			g.setColor(Color.black);
			g.fillOval(55, 265, 30, 30);
			g.fillOval(135, 265, 30, 30);

			//desenha a boca
			g.fillOval(50, 310, 120, 60);
			
		case 6:  //cone 
			
			while (expan<500){
				
				if (count%2==0){
					g.setColor(Color.GRAY);
				}else{
					g.setColor(Color.CYAN);
					
				}
				
				g.fillOval(expan, expan,500-expan,500-expan);
				expan+=20;
				count++;	
			}
		
		case 7:  //circulos cooloridos dentro um do outro
            int nasc=0;
			while (expan<500){
				
				if (count%2==0){
					g.setColor(Color.GRAY);
				}else{
					g.setColor(Color.CYAN);
					
				}
				
				g.fillOval(nasc, nasc,500-expan,500-expan);
				expan+=20;
				count++;
				nasc+=10;
			}
		}		
	}
}
