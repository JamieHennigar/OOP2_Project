
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class GameGui extends JFrame implements ActionListener {

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
		
		Container cPane = getContentPane();
		cPane.setLayout(new FlowLayout());
		JLabel donald = new JLabel();
		ImageIcon donaldImage = new ImageIcon(new ImageIcon(("C:/Users/jamie_000/Documents/OOP2_Project/The Wall/src/Donald.jpg")).getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
		donald.setIcon(donaldImage);
		cPane.add(donald);
		//set the size and location for donald
		
		//create mexican image and set size and location
		JLabel mexican = new JLabel();
		ImageIcon mexicanImage = new ImageIcon(new ImageIcon("C:/Users/jamie_000/Documents/OOP2_Project/The Wall/src/Mexican.jpg").getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT));
		mexican.setIcon(mexicanImage);
		cPane.add(mexican);
		
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
		
		
	}
	
	private void displayMexican()
	{
		
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

}
