
import java.awt.*;



public class GameComponent 
{	
	// declare attributes
	private int topLeftXPosition;
	private int topLeftYPosition;
	private int width;
	private int height;
	private Image image;
	
	// multiple argument constructor
	public GameComponent(int topLeftXPosition, int topLeftYPosition, int width, int height, Image image)
	{
		this.topLeftXPosition = topLeftXPosition;
		this.topLeftYPosition = topLeftYPosition;
		this.width = width;
		this.height = height;
		this.image = image;
	}
	
	//multiple argument constructor for the Wall class
	public GameComponent(int topLeftXPosition, int topLeftYPosition, int width, int height)
	{
		this.topLeftXPosition = topLeftXPosition;
		this.topLeftYPosition = topLeftYPosition;
		this.width = width;
		this.height = height;
	}
	
	//mutators
	public void setTopLeftXPosition(int topLeftXPosition)
	{
		this.topLeftXPosition = topLeftXPosition;
	}
	
	public void setTopLeftYPosition(int topLeftYPosition)
	{
		this.topLeftYPosition = topLeftYPosition;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public void setImage(Image image)
	{
		this.image = image;
	}
	
	
	//accessors
	public int getTopLeftXPosition()
	{
		return topLeftXPosition;
	}
	
	public int getTopLeftYPosition()
	{
		return topLeftYPosition;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	public Image getImage()
	{
		return image;
	}
	
	
	
	public void draw(Graphics gRef)
	{
		
		
		gRef.drawImage(image, topLeftXPosition , topLeftYPosition , image.getWidth(), image.getHeight(), 
					   0, 0, image.getWidth(), image.getHeight(), null);
		
		
		
		
		
		
	
	}
}
