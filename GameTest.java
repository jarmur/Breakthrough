package BreakthroughGame;

public class GameTest {
	public static void main(String[] args) {
		Game g = new Game();
		Player p1 = new HumanPlayer(g, "W"), p2 = new AIRandomPlayer(g, "B");
		g.addPlayers(p1, p2);
		while(!g.isGameOver()) {
			PawnMove nextMove = g.getCurrentPlayer().generateMove();
			g.getCurrentPlayer().makeMove(nextMove);
		}
	}
}
