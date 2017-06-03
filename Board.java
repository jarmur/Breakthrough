package BreakthroughGame;

import java.util.ArrayList;

public class Board {
	ArrayList<GameTile> board = new ArrayList<>();
	
	public Board()
	{
		for(int i = 1; i <= 8; i++)
			for(int j = 1; j <= 8; j++) {
				board.add(new GameTile(new Cords(i, j), null));
			}
	}

	@Override
	public String toString() {
		String tmp = "";
		for(GameTile f: board){
			tmp += f.getPawn() + " ";
		}
		return tmp;
	}
	
}

