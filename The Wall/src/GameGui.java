
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class GameGui extends JFrame implements ActionListener {

	public static void main(String[]args)
	{
		
	}

	
	public GameGui()
	{
		setTitle("The Wall");
		setSize(600,500);
		setLocation(350,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		createFileMenu();
		

		
		
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