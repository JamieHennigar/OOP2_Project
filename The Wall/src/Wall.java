import java.awt.*;


public class Wall extends GameComponent
{
	
	
	

	public Wall(int topLeftXPosition, int topLeftYPosition, int width,int height) 
	{
		super(topLeftXPosition, topLeftYPosition, width,height);
	}

	public void drawWall(Graphics gRef)
	{
		gRef.setColor(Color.blue);
		gRef.fillRect(getTopLeftXPosition(), getTopLeftYPosition(), getWidth(), getHeight());
	}
}
