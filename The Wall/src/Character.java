import javax.swing.*;
import java.awt.*;




public class Character 
{
	private String name;
	//private Image mexicanImage;
	private Image image;
	//private Image flagImage;
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
	
	public int getHealth()
	{
		return health;
	}
	
	/*public Image donaldImage()
	{
		ImageIcon donald = new ImageIcon("Donald.png");
		
		return donaldImage;
	}
	
	public Image mexicanImage()
	{
		ImageIcon mexican = new ImageIcon("Mexican.png");
		return mexicanImage;
	}
	
	public Image flagImage()
	{
		ImageIcon flag = new ImageIcon("Flag.png");
		
		return flagImage;
	}*/
}


