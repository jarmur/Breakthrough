package BreakthroughGame;

import java.util.ArrayList;

public class Board {
	ArrayList<GameTile> board = new ArrayList<>();
	
	public Board(Player playerB, Player playerW)
	{
		for(int i = 1; i <= 8; i++)
			for(int j = 1; j <= 8; j++) {
				Player tmp = null;
				if(i == 1 || i == 2) tmp = playerW;
				if(i == 7 || i == 8) tmp = playerB;
				board.add(new GameTile(new Cords(i, j), tmp));
			}
	}	
}

