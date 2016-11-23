import java.awt.*;


public class GameComponent 
{
	private int topLeftXPosition;
	private int topLeftYPosition;
	private Image image;
	
	public GameComponent()
	{
		this.topLeftXPosition = topLeftXPosition;
		this.topLeftYPosition = topLeftYPosition;
		this.image = image;
	}
	
	public void setTopLeftXPosition(int topLeftXPosition)
	{
		this.topLeftXPosition = topLeftXPosition;
	}
	
	public void setTopLeftYPosition(int topLeftYPosition)
	{
		this.topLeftYPosition = topLeftYPosition;
	}
	
	public void setImage(Image image)
	{
		this.image = image;
	}
	
	public int getTopLeftXPosition()
	{
		return topLeftXPosition;
	}
	
	public int getTopLeftYPosition()
	{
		return topLeftYPosition;
	}
	
	public Image getImage()
	{
		return image;
	}
	
	public void draw()
	{
		
	}
}