package BreakthroughGame;

import java.util.ArrayList;
import java.util.Random;

public class AIRandomPlayer extends Player{
	public AIRandomPlayer(Game game, String color) {
		super(game, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PawnMove generateMove() {
		// TODO Auto-generated method stub
		PawnMove m = null;
		Board b = super.getGame().getBoard();
		ArrayList<PawnMove> possibleMoves = new ArrayList<>();
		for(GameTile gtFrom: b.getTiles()) {
			if(gtFrom.getPlayer() == null) continue;
			if(gtFrom.getPlayer().equals(this)) {
				ArrayList<GameTile> tiles;
				if(gtFrom.getPlayer().getColor().equals("W")) tiles = b.getNeighbours(gtFrom, "W");
				else tiles = b.getNeighbours(gtFrom, "B");
				for(GameTile gtTo: tiles) {
					if(!gtFrom.getPlayer().equals(gtTo.getPlayer())) possibleMoves.add(new PawnMove(gtFrom, gtTo));
				}
			}
		}
		while(!super.checkMove(m)) {
			Random rng = new Random();
			if(possibleMoves.size() == 0) {
				super.getGame().setWinner((Player) super.getGame().getOpposingPlayer());
				super.getGame().setGameOver(true);
			}
			m = possibleMoves.get(rng.nextInt(possibleMoves.size()));
		}
		return m;
	}
}
