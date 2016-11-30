
public class Donald extends Character
{
	private int score;
	private int x;
	private int y;
	private int moveX;
	private int moveY;
	
	//no argument constructor
	public Donald()
	{
		score = 0;
		x = 0;
		y = 0;
		moveX = 0;
		moveY = 0;
	}
	
	//  multiple argument constructor
	public Donald(int score, int x, int y, int moveX, int moveY)
	{
		this.score = score;
		this.x = x;
		this.y = y;
		this.moveX = moveX;
		this.moveY = moveY;
	}
	
	//mutators
	public void setScore(int score)
	{
		this.score = score;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	public void setMoveX(int moveX)
	{
		this.moveX = moveX;
	}
	
	public void setMoveY(int moveY)
	{
		this.moveY = moveY;
	}
	
	//accessors
	public int getScore()
	{
		return score;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	public int getMoveX()
	{
		return moveX;
	}
	
	public int getMoveY()
	{
		return moveY;
	}
}
