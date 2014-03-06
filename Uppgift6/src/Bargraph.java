

import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JComponent;


public class Bargraph extends JComponent {
	private int women;
	private int men;
	private float total;
	
	private int menHeight;
	private int womenHeight;
	
	@Override
	protected void paintComponent(Graphics g){
		int x = getWidth()/2;
		int w = getWidth()/4;
		
		g.setColor(Color.BLUE);
		g.fillRect(x/2, getHeight()-menHeight, w, menHeight);
		g.setColor(Color.RED);
		g.fillRect(x+1, getHeight()-womenHeight,w, womenHeight);
		g.setColor(Color.BLACK);
		g.drawString(""+(men+women)+" sökande.",1,10);
		g.drawString(""+Math.floor((men/total)*10000)/100+"% män. ", 1, 35);
		g.drawString(""+Math.floor((women/total)*10000)/100+"% kvinnor.",1,50);
		
		
	}
	
	public void updateValues(int women, int men){
		this.women = women;
		this.men = men;
		total = women+men;
		
		menHeight = Math.round(getHeight()*(men/total));
		womenHeight = Math.round(getHeight()*(women/total));

		
		System.out.println("Men: "+Math.floor((men/total)*10000)/100+"%");
		System.out.println("Women: "+Math.floor((women/total)*10000)/100+"%");
		repaint();

	
	}
	
	
	
	
	

}
