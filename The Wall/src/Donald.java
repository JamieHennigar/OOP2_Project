import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;


public class Donald extends Character
{
	private int score;
	//private int x;
	//private int y;
	//private int moveX;
	//private int moveY;
	//private Image image;
	
	//no argument constructor
	public Donald(int topLeftXPosition, int topLeftYPosition, Image image, int width, int height)
	{
		super(topLeftXPosition, topLeftYPosition, height, width, image);
		score = 0;
		//x = 40;
		//y = 40;
		//moveX = 0;
		//moveY = 0;
	}
	
	//  multiple argument constructor
	public Donald(int score, int topLeftXPosition, int topLeftYPosition, Image image, int width, int height )
	{
		super(topLeftXPosition, topLeftYPosition, height, height, image);
		this.score = score;
		
	}
	
	/*private void createDonald()
	{
		ImageIcon dt = new ImageIcon("C:/Users/jamie_000/Documents/OOP2_Project/The Wall/src/Donald.jpg");
		image = dt.getImage();
		x = 40;
		y = 40;
	}*/
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
	
	public void draw(Graphics gRef)
	{
		
	}
	
	
	
	public void move(int units)
	{
		
		//y += units;
	}
	
	public void keyPressed(KeyEvent e)
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

	}
}
