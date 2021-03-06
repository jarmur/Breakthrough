package BreakthroughGame;

public class PawnMove {
	private Cords from, to;

	public PawnMove(GameTile gtFrom, GameTile gtTo) {
		this.from = gtFrom.getCords();
		this.to = gtTo.getCords();
	}

	public Cords getFrom() {
		return from;
	}

	public Cords getTo() {
		return to;
	}

	@Override
	public String toString() {
		return "(" + from.getX() + ", " + from.getY() + ")=>(" + to.getX() + ", " + to.getY() + ")";
	}
}
