package BreakthroughGame;

public class GameTile {
	private Cords cords;
	private Player player;

	public Cords getCords() {
		return cords;
	}


	public void setCords(Cords cords) {
		this.cords = cords;
	}


	public String getPawn() {
		return pawn;
	}


	public void setPawn(String pawn) {
		this.pawn = pawn;
	}


	public GameTile(Cords cords, Player player) {
		this.cords = cords;
		this.player = player;
	}
	
	
}
