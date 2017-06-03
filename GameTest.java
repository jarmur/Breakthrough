package BreakthroughGame;

import java.awt.EventQueue;

public class GameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GameGUI();
			}
		});
	}
}
