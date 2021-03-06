
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.*;


public class GameGui extends JFrame implements KeyListener,ActionListener {
	
	
	
	public int score = 0;
	boolean gameOn = false;
	Thread gameThread;
	Image gameImage;
	Graphics gRef;
	
	
	Donald theDonald;
	Mexican[][] theMexicans;
	Wall theWall;
	ArrayList<Flag> theFlags = new ArrayList<Flag>();
	Flag theFlag;
	
	//main method
	public static void main(String[]args)
	{
		GameGui frame = new GameGui();	
		frame.setVisible(true);
		
	}

	
	public GameGui()
	{
		setTitle("The Wall");
		setSize(1200,1000);
		setLocation(150,0);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		createFileMenu();
		displayDonald();
		displayMexican();
		//initialiseGame(); 
		//start(); 
		
		
		
	}

	
	


	private void createFileMenu() {
		
		JMenuItem item;
		JMenu fileMenu;
	
		
		JMenuBar meh = new JMenuBar();
		setJMenuBar(meh);
		meh.setBackground(Color.blue);
		fileMenu = new JMenu("File");
		meh.add(fileMenu);
		item = new JMenuItem("New Game");
		item.addActionListener(this);
		fileMenu.add(item);
		item = new JMenuItem("Save");
		item.addActionListener(this);
		fileMenu.add(item);
		item = new JMenuItem("Scores");
		item.addActionListener(this);
		fileMenu.add(item);
		fileMenu.addSeparator();
		item = new JMenuItem("Quit");
		item.addActionListener(this);
		fileMenu.add(item);

		
		

	}
	
		/*private void initialiseGame() 
		{
			//this is where you'll create the Donald object and 
			//the Mexican objects + wall to begin with
			
			
			
			gameOn = true;
		}
	
	public void run()
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Graphics g = getGraphics();
		
		while(gameOn)
		{
			try
			{//use draw methods in here
				
				
				
				paint(g);
				Thread.sleep(20);
			}
			catch(InterruptedException e)
			{
				break;
			}
		}
	}

	private void start()
	{
		if(gameThread == null)
		{
			gameThread = new Thread(this);
			gameThread.start();
		}
		
		
	}*/
	
	private void displayDonald()
	{
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		ImageIcon dt = new ImageIcon(new ImageIcon(("C:/Users/jamie_000/Documents/OOP2_Project/The Wall/src/Donald.jpg")).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
		JLabel donald = new JLabel(dt);
		cPane.add(donald);
		
	}
	
	private void displayMexican()
	{
		Container mcPane = getContentPane();
		mcPane.setLayout(new FlowLayout());
		
		ImageIcon mexicanImage = new ImageIcon(new ImageIcon("C:/Users/jamie_000/Documents/OOP2_Project/The Wall/src/Mexican.jpg").getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
		JLabel mexican = new JLabel(mexicanImage);
		mcPane.add(mexican);
	}
	/*public void paint(Graphics g)
	{
		if (gRef==null)
			{
				gameImage = createImage(1200, 1000);
				gRef = gameImage.getGraphics(); 
			}
		if (gRef==null || gameImage==null)
		{
			return;
		}
	}*/
	
	


	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("New Game"))
		{
			JOptionPane.showMessageDialog(null,"You have started a new game");
		}
		
		if(e.getActionCommand().equals("Save"))
		{
			JOptionPane.showMessageDialog(null, "Saving score");
			try{
				
			
			File myFile = new File("Scores.dat");
			FileOutputStream fos = new FileOutputStream(myFile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.write(score);
			oos.close();
			}
			
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
		if(e.getActionCommand().equals("Scores"))
		{
			JOptionPane.showMessageDialog(null,"About to show you the scores");
			
			try{
				FileInputStream fis = new FileInputStream("Scores.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				ois.read();
				ois.close();
			}
			
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
		if(e.getActionCommand().equals("Quit"))
		{
			JOptionPane.showMessageDialog(null,"Quiting");
			System.exit(0);
		}

		


		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		int x = 0;
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			JOptionPane.showMessageDialog(null, "you have hit a mexican" + score);
			score = x++;
			theDonald.setScore(score);
			System.out.println(score);
			
		}
		 if(key == KeyEvent.VK_UP)
		 {
			 theDonald.move(2);
		 }
		 
		 if(key == KeyEvent.VK_DOWN)
		 {
			 theDonald.move(2);
		 }
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_UP)
		 {
			 theDonald.move(0);
		 }
		
		if(key == KeyEvent.VK_DOWN)
		 {
			 theDonald.move(0);
		 }
	}


	@Override
	public void keyTyped(KeyEvent e) {
		
		
		
	}


	
	
	

}
