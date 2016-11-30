
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class GameGui extends JFrame implements ActionListener {

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
		item = new JMenuItem("Scores");
		item.addActionListener(this);
		fileMenu.add(item);
		fileMenu.addSeparator();
		item = new JMenuItem("Quit");
		item.addActionListener(this);
		fileMenu.add(item);

		
		

	}
	
	private void displayDonald()
	{
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		JLabel donald = new JLabel();
		ImageIcon donaldImage = new ImageIcon(new ImageIcon(("C:/Users/jamie_000/Documents/OOP2_Project/The Wall/src/Donald.jpg")).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
		donald.setIcon(donaldImage);
		cPane.add(donald);
		
	}
	
	private void displayMexican()
	{
		Container mcPane = getContentPane();
		mcPane.setLayout(new FlowLayout());
		JLabel mexican = new JLabel();
		ImageIcon mexicanImage = new ImageIcon(new ImageIcon("C:/Users/jamie_000/Documents/OOP2_Project/The Wall/src/Mexican.jpg").getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
		mexican.setIcon(mexicanImage);
		mcPane.add(mexican);
	}


	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("New Game"))
		{
			JOptionPane.showMessageDialog(null,"You have started a new game");
		}
		
		if(e.getActionCommand().equals("Scores"))
		{
			JOptionPane.showMessageDialog(null,"About to show you the scores");
		}
		
		if(e.getActionCommand().equals("Quit"))
		{
			JOptionPane.showMessageDialog(null,"Quiting");
			System.exit(0);
		}

		


		
	}
	
	public void keyPressed(KeyEvent e)
	{
		 int key = e.getKeyCode();
		 
		 
		 if(key == KeyEvent.VK_LEFT)
		 {
			 moveX = -1;
		 }

	}

}
