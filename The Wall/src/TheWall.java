
import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;


public class TheWall extends JFrame implements ActionListener {

	

	
	public TheWall()
	{
		setTitle("The Wall");
		setSize(600,500);
		setLocation(350,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		createFileMenu();
		

		
		
	}

	private void createPlayerMenu() {
		
		
	}


	private void createFileMenu() {
		
		JMenuItem item;
		JMenu fileMenu;
		JMenu PlayerMenu;
		
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


	public void actionPerformed(ActionEvent e) {
		
		
	}

}
