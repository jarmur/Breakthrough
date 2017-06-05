package BreakthroughGame;

public class Game {
	private Player playerB, playerW, currentPlayer, winner;
	
	public Player getCurrentPlayer() {
		return currentPlayer;
	}

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
		this.gameOver = false;
	}
	
	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
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

	public void changeCurrentPlayer() {
		if(currentPlayer.equals(playerW)) currentPlayer = playerB;
		else currentPlayer = playerW;
		
	}
}
