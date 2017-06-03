package BreakthroughGame;

public class Game {
	private Player playerB, playerW, currentPlayer, winner;
	private int playerBPawns, playerWPawns;
	boolean gameOver;
	private Board board;
	
	public Game(Player playerB, Player playerW) {
		this.playerB = playerB;
		this.playerW = playerW;
		this.board = new Board(playerB, playerW);
		this.currentPlayer = playerW;
		this.winner = null;
		this.playerBPawns = 16;
		this.playerWPawns = 16;
		this.gameOver = false;
	}
	
	
}
