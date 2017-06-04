package BreakthroughGame;

public abstract class Player {
	public Player(Game game, String color) {
		this.game = game;
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public boolean checkMove(PawnMove m) {
		if(m.equals(null)) return false;
		if(m.getFrom().equals(m.getTo())) return false;
		Board b = game.getBoard();
		GameTile to = b.getTile(m.getTo());
		GameTile from = b.getTile(m.getFrom());
		if(to.getPlayer().equals(game.getCurrentPlayer())) return false;
		else if (to.getPlayer().equals(game.getOpposingPlayer())) { 
			if(from.getCords().getX() == to.getCords().getX()) return false;
			else return true;
		}
		
		return true;
	}
	
	public void makeMove(PawnMove m) {
		if()
	}
	
	public int checkWin() {
		return 0;
	}
	
	private String color;
	private Game game;
	public Game getGame() {
		return game;
	}

	public abstract PawnMove generateMove();
}
