package BreakthroughGame;

public class Field {
	private Cords cords;
	private String pawn;

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


	public Field(Cords cords, String pawn) {
		this.cords = cords;
		this.pawn = pawn;
	}
	
	
}
