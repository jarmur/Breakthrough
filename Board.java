package BreakthroughGame;

import java.util.ArrayList;

public class Board {
	private ArrayList<GameTile> tiles = new ArrayList<>();
	
	public ArrayList<GameTile> getTiles() {
		return tiles;
	}

	public Board(Player playerW, Player playerB)
	{
		for(int i = 1; i <= 8; i++)
			for(int j = 1; j <= 8; j++) {
				Player tmp = null;
				if(i == 1 || i == 2) tmp = playerW;
				if(i == 7 || i == 8) tmp = playerB;
				tiles.add(new GameTile(new Cords(i, j), tmp));
			}
	}

	public GameTile getTile(Cords to) {
		for(GameTile gt: tiles) {
			if(gt.getCords().equals(to)) return gt;
		}
		return null;
	}	
	
	public void removePawn(Cords c) {
		GameTile gt = this.getTile(c);
		gt.setPlayer(null);
	}
	
	public void replacePawn(Cords c, Player newPlayer) {
		GameTile gt = this.getTile(c);
		gt.setPlayer(newPlayer);
	}
	
	public ArrayList<GameTile> getNeighbours(GameTile gt, String playerColor) {
		int tmp;
		if(playerColor.equals("W")) tmp = 1;
		else tmp = -1;
		ArrayList<GameTile> tiles = new ArrayList<>();
		int x = gt.getCords().getX();
		int y = gt.getCords().getY();
		x += tmp;
		tiles.add(getTile(new Cords(x, y)));
		tiles.add(getTile(new Cords(x, y-1)));
		tiles.add(getTile(new Cords(x, y+1)));
		return tiles;
	}
}

