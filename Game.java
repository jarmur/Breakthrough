package BreakthroughGame;

public class Game {
	private Player playerB, playerW, currentPlayer, winner;
	
	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	private int playerBPawns, playerWPawns;
	private boolean gameOver;
	
	public boolean isGameOver() {
		return gameOver;
	}

	private Board board;
	
	public Board getBoard() {
		return board;
	}

	public Game() {
		this.winner = null;
		this.playerBPawns = 16;
		this.playerWPawns = 16;
		this.gameOver = false;
	}
	
	public void addPlayers(Player pw, Player pb) {
		this.board = new Board(pw, pb);
		this.currentPlayer = pw;
		this.playerB = pb;
		this.playerW = pw;
	}

	public Object getOpposingPlayer() {
		return (playerW.equals(currentPlayer)) ? playerB : playerW;
	}
}
