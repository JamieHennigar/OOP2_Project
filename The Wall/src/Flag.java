import java.awt.Graphics;
import java.awt.Image;


public class Flag extends GameComponent
{
	
	public Flag(int topLeftXPosition, int topLeftYPosition, int width, int height,  Image image) {
		super(topLeftXPosition, topLeftYPosition, width, height, image);
	}
	public boolean collidesWith(Mexican m)
	{
		
		return true;
	}
	public void move()
	{
		
	}
	
	public void drawFlag(Graphics gRef)
	{
		
	}
}
