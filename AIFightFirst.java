package BreakthroughGame;

import java.util.ArrayList;
import java.util.Random;

public class AIFightFirst extends Player{

	public AIFightFirst(Game game, String color) {
		super(game, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PawnMove generateMove() {
		// TODO Auto-generated method stub
		PawnMove m = null;
		Board b = super.getGame().getBoard();
		ArrayList<PawnMove> possibleMoves = new ArrayList<>();
		ArrayList<PawnMove> fightFirstPossibleMoves = new ArrayList<>();
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
		for(PawnMove move: possibleMoves) {
			Player currentPlayer= super.getGame().getCurrentPlayer();
			Player opponent = (Player) super.getGame().getOpposingPlayer();
			GameTile from = super.getGame().getBoard().getTile(move.getFrom());
			GameTile to = super.getGame().getBoard().getTile(move.getTo());
			if(to.getPlayer() == null) continue;
			if(from.getPlayer().getColor() != to.getPlayer().getColor() && from.getCords().getX() != to.getCords().getX()) fightFirstPossibleMoves.add(move);
		}
		while(!super.checkMove(m)) {
			Random rng = new Random();
			if(fightFirstPossibleMoves.size() != 0) m = fightFirstPossibleMoves.get(rng.nextInt(fightFirstPossibleMoves.size()));
			else m = possibleMoves.get(rng.nextInt(possibleMoves.size()));
		}
		return m;
	}
	
}
