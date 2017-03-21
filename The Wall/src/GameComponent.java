
import java.awt.*;
import java.awt.image.ImageObserver;

/** A class called GameComponent which is the super class
 * of the classes in this project
 * 
 * @author Jamie Hennigar
 *
 */
public class GameComponent 
{	
	// declare attributes
	private int topLeftXPosition;
	private int topLeftYPosition;
	private int width;
	private int height;
	private Image image;
	
	/**
	 * multiple argument constructor
	 * @param topLeftXPosition
	 * @param topLeftYPosition
	 * @param width
	 * @param height
	 * @param image
	 */
	// multiple argument constructor
	public GameComponent(int topLeftXPosition, int topLeftYPosition, int width, int height, Image image)
	{
		this.topLeftXPosition = topLeftXPosition;
		this.topLeftYPosition = topLeftYPosition;
		this.width = width;
		this.height = height;
		this.image = image;
	}
	
	/**
	 * multiple argument constructor for use in the Wall class
	 * @param topLeftXPosition
	 * @param topLeftYPosition
	 * @param width
	 * @param height
	 */
	//multiple argument constructor for the Wall class
	public GameComponent(int topLeftXPosition, int topLeftYPosition, int width, int height)
	{
		this.topLeftXPosition = topLeftXPosition;
		this.topLeftYPosition = topLeftYPosition;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * mutator for topLeftXPosition
	 * @param topLeftXPosition
	 */
	//mutators
	public void setTopLeftXPosition(int topLeftXPosition)
	{
		this.topLeftXPosition = topLeftXPosition;
	}
	
	/**
	 * mutator for topLeftYPosition
	 * @param topLeftYPosition
	 */
	public void setTopLeftYPosition(int topLeftYPosition)
	{
		this.topLeftYPosition = topLeftYPosition;
	}
	
	/**
	 * mutator for width
	 * @param width
	 */
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	/**
	 * mutator for height
	 * @param height
	 */
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	/**
	 * mutator for image
	 * @param image
	 */
	public void setImage(Image image)
	{
		this.image = image;
	}
	
	
	/**
	 * accessor for topLeftXPosition
	 * @return int topLeftXPosition
	 */
	//accessors
	public int getTopLeftXPosition()
	{
		return topLeftXPosition;
	}
	
	/**
	 * accessor for topLeftYPosition 
	 * @return int topLeftYPosition
	 */
	public int getTopLeftYPosition()
	{
		return topLeftYPosition;
	}
	
	/**
	 * accessor for width
	 * @return int width
	 */
	public int getWidth()
	{
		return width;
	}
	
	/**
	 * accessor for height
	 * @return int height
	 */
	public int getHeight()
	{
		return height;
	}
	
	/**
	 * accessor for image
	 * @return returns an image
	 */
	public Image getImage()
	{
		return image;
	}
	
	
	/**
	 * the draw method that the other classes will use to draw the characters
	 * @param gRef
	 */
	public void draw(Graphics gRef)
	{
		ImageObserver a = null;
		
		gRef.drawImage(image, topLeftXPosition , topLeftYPosition , image.getWidth(a), image.getHeight(a), 
					   0, 0, image.getWidth(a) , image.getHeight(a), null);
		
		
		
		
		
		
	
	}
}
