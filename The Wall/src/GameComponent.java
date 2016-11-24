import java.awt.*;
import java.awt.image.ImageObserver;

import javax.swing.*;


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
	
	public void draw(Graphics gRef)
	{
		Image donaldImage;
		Image mexicanImage;
		Image flagImage;
		
		//donaldImage.getHeight();
		//donaldImage.getWidth();
		/*donaldImage = new Image();
		gRef.drawImage(donaldImage, topLeftXPosition , topLeftYPosition , image.getWidth(), image.getHeight(), 
					   0, 0, donaldImage.getWidth(), donaldImage.getHeight(), null);
		
		
		
		mexicanImage.getHeight();
		mexicanImage.getWidth();
		
		
		
		flagImage.getHeaight();
		flagImage.getWidth();*/
	}
}
