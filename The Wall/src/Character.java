import javax.swing.*;

import java.awt.*;




public class Character extends GameComponent
{
	public Character(int topLeftXPosition, int topLeftYPosition, int width,int height, Image image) 
	{
		super(topLeftXPosition, topLeftYPosition, height, width, image);
	}


	//private String name;
	//private Image image;
	private int health;
	
	
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	
	
	public int getHealth()
	{
		return health;
	}
	
	
	
	
	
	
}


