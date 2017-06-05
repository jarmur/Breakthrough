package BreakthroughGame;

public abstract class Player {
	public Player(Game game, String color) {
		this.game = game;
		this.color = color;
		this.pawns = 16;
	}

	public String getColor() {
		return color;
	}

	public boolean checkMove(PawnMove m) {
		if(m == null) return false;
		if(m.getFrom().equals(m.getTo())) return false;
		Board b = game.getBoard();
		GameTile to = b.getTile(m.getTo());
		GameTile from = b.getTile(m.getFrom());
		if(from.getPlayer().getColor() == "W") {
			if(to.getCords().getY() - from.getCords().getY()!= 1) return false;
		}
		else {
			if(from.getCords().getY()-to.getCords().getY() != 1) return false;
		}
		int maxX = Math.max(from.getCords().getX(), to.getCords().getX()), 
				minX = Math.min(from.getCords().getX(), to.getCords().getX());
		if(maxX - minX > 1) return false;
		if(to.getPlayer() == null) return true;
		if(from.getPlayer() == null) return false;
		if(to.getCords().getX() == from.getCords().getX()) {
			if(from.getPlayer().equals(to.getPlayer())) return false;
		}
		if(to.getPlayer().equals(game.getCurrentPlayer())) return false;
		else if (to.getPlayer().equals(game.getOpposingPlayer())) { 
			if(from.getCords().getX() == to.getCords().getX()) return false;
			else return true;
		}
		
		return true;
	}
	
	public void makeMove(PawnMove m) {
		System.out.println(this.getColor() + ": " + m.toString());
		GameTile from = game.getBoard().getTile(m.getFrom());
		GameTile to = game.getBoard().getTile(m.getTo());
		if(to.getPlayer() == null) {
			to.setPlayer(from.getPlayer());
			from.setPlayer(null);
		}
		else {
			to.setPlayer(from.getPlayer());
			from.getPlayer().reducePawns();
			from.setPlayer(null);
			
		}
		to.getPlayer().checkWin();
		game.changeCurrentPlayer();
	}
	
	private void reducePawns() {
		this.pawns--;	
	}

	public void checkWin() {
		if(game.getCurrentPlayer().getPawns() == 0)
		{
			game.setGameOver(true);
			game.setWinner(this);
		}
		for(int i = 0; i < 8; i++) {
			GameTile tmp = game.getBoard().getTiles().get(i);
			if(tmp.getPlayer() != null){
				if(tmp.getPlayer().getColor().equals("B")) {
					game.setGameOver(true);
					game.setWinner(this);
				}
			}
			tmp = game.getBoard().getTiles().get(63-i);
			if(tmp.getPlayer() != null) {
				if(tmp.getPlayer().getColor().equals("W")) {
					game.setGameOver(true);
					game.setWinner(this);
				}
			}
		}
	}
	
	private String color;
	private Game game;
	private int pawns;
	public int getPawns() {
		return pawns;
	}

	public Game getGame() {
		return game;
	}

	public abstract PawnMove generateMove();
}
