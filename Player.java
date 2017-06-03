package BreakthroughGame;

public abstract class Player {
	public void checkMove();
	public void makeMove();
	public int checkWin();
	private String color;
	private Game game;
}
