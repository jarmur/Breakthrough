package BreakthroughGame;

public class GameTile {
	private Cords cords;
	private Player player;

	public Player getPlayer() {
		return player;
	}


	public void setPlayer(Player player) {
		this.player = player;
	}


	public Cords getCords() {
		return cords;
	}


	public void setCords(Cords cords) {
		this.cords = cords;
	}


	public GameTile(Cords cords, Player player) {
		this.cords = cords;
		this.player = player;
	}
}
