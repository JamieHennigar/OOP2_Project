import javax.swing.*;
import java.awt.*;




public class Character 
{
	private String name;
	private Image image;
	private int health;
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	
	public void setImage(Image image)
	{
		this.image = image;
	}
	
	
	public int getHealth()
	{
		return health;
	}
	
	
	public Image getImage()
	{
		return image;
	}
	
	
	
	
}


