package BreakthroughGame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton newGameButton, settingsButton, quitButton; 
	public static final int HEIGHT = 100, WIDTH = 200;

	public ButtonPanel() {
		newGameButton = new JButton("New game");
		settingsButton = new JButton("Settings");
		quitButton = new JButton("Quit");
		newGameButton.addActionListener(this);
		settingsButton.addActionListener(this);
		quitButton.addActionListener(this);
		setLayout(new FlowLayout());
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		add(newGameButton);
		add(settingsButton);
		add(quitButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == newGameButton);
		if(source == settingsButton) ;
		if(source == quitButton) ;
		
		
	}

}
