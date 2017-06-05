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
				tiles.add(new GameTile(new Cords(j, i), tmp));
			}
	}

	public GameTile getTile(Cords to) {
		for(GameTile gt: tiles) {
			if(gt.getCords().getX() == to.getX() && gt.getCords().getY() == to.getY()) return gt;
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
		y += tmp;
		tiles.add(getTile(x, y));
		if(x != 1) tiles.add(getTile(x-1, y));
		if(x != 8) tiles.add(getTile(x+1, y));
		return tiles;
	}

	private GameTile getTile(int x, int y) {
		for(GameTile gt: tiles) {
			if(gt.getCords().getX() == x && gt.getCords().getY() == y) return gt;
		}
		return null;
	}

	@Override
	public String toString() {
		String tmp = "    1 2 3 4 5 6 7 8\n---------------------\n";
		int row = 1;
		
		for(int i = 0; i < 64 ; i++) {
			if(i % 8 == 0) tmp += (row++) + " | ";
			GameTile gt = tiles.get(i);
			if(gt.getPlayer() == null) tmp += "- ";
			else tmp += gt.getPlayer().getColor() + " ";
			if (i % 8 == 7) tmp += "\n";
		}
		
		
		/*for(GameTile gt: tiles) {
			if(gt.getPlayer() == null) tmp += "-";
			else tmp += gt.getPlayer().getColor();
			if(i%8 == 0) tmp += "\n";
			i++;
		}*/
		return tmp;
	}
	
	
}

