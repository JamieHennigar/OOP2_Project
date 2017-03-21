import java.awt.*;



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
		
		units =0;
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
