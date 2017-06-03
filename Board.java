package BreakthroughGame;

import java.util.ArrayList;

public class Board {
	ArrayList<Field> board = new ArrayList<>();
	
	public Board()
	{
		for(int i = 1; i <= 8; i++)
			for(int j = 1; j <= 8; j++) {
				String pawn = "E";
				if(i == 1 || i == 2) pawn = "W";
				else if(i == 7 || i == 7) pawn = "B";
				board.add(new Field(new Cords(i, j), pawn));
			}
	}

	@Override
	public String toString() {
		String tmp = "";
		for(Field f: board){
			tmp += f.getPawn() + " ";
		}
		return tmp;
	}
	
}

