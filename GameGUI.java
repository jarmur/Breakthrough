package BreakthroughGame;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameGUI extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameGUI() {
		super("Breakthrough");
		JPanel buttonPanel = new ButtonPanel();
		add(buttonPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		//setLayout(new BorderLayout());
		setPreferredSize(new Dimension(1000, 1000));
		//frame.add(new GameGUI(), BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
