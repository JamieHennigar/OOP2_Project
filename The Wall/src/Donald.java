import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class Donald extends Character
{
	private int score;
	
	
	//no argument constructor
	public Donald(int topLeftXPosition, int topLeftYPosition, Image image, int width, int height)
	{
		super(topLeftXPosition, topLeftYPosition, height, width, image);
		score = 0;
	}
	
	//  multiple argument constructor
	public Donald(int score, int topLeftXPosition, int topLeftYPosition, Image image, int width, int height )
	{
		super(topLeftXPosition, topLeftYPosition, height, height, image);
		this.score = score;
		
	}
	
	
	//mutators
	public void setScore(int score)
	{
		this.score = score;
	}
	
	
	
	
	//accessors
	public int getScore()
	{
		return score;
	}
	
	public void drawDonald(Graphics gRef)
	{
		

	}
	
	
	
	public void move(int units)
	{
		
		//y += units;
	}
	
	/*public void keyPressed(KeyEvent e)
	{
		 int key = e.getKeyCode();
		 
		 
		 
		 
		 if(key == KeyEvent.VK_UP)
		 {
			// moveY = -1;
		 }
		 
		 if(key == KeyEvent.VK_DOWN)
		 {
			// moveY = 1;
		 }

	}
	
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
		 
		 
		
		 
		 if(key == KeyEvent.VK_UP)
		 {
			// moveY = 0;
		 }
		 
		 if(key == KeyEvent.VK_DOWN)
		 {
			 //moveY = 0;
		 }

	}*/
}
