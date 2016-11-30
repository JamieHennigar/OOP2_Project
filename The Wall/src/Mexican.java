import java.awt.*;



public class Mexican extends Character
{
	//declare attributes
	private int health;
	private int points;
	
	
	
	//multiple argument constructor
	public Mexican(int topLeftXPosition, int topLeftYPosition, Image image, int width, int height)
	{
		super(topLeftXPosition, topLeftYPosition, height, width, image);
		this.health = health;
		this.points = points;
	}
	
	//mutators
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public void setPoints(int points)
	{
		this.points = points;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public int getPoints()
	{
		return points;
	}
	
	public void move()
	{
		
	}
	
	public void draw(Graphics gRef)
	{
		
	}
}
