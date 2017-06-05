package BreakthroughGame;

import java.util.Scanner;

public class HumanPlayer extends Player{

	public HumanPlayer(Game game, String color) {
		super(game, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public PawnMove generateMove() {
		System.out.println("Wproawdz ruch gracza " + this.getColor());
		System.out.println("Format wejscia Xs Ys X fYf gdzie Xs i Ys to wspolrzedne pionka, a Xf i Yf to wspolrzedne pola na ktore pionek ma sie przeniesc");
		Scanner read = new Scanner(System.in);
		PawnMove m = null;
		while(!checkMove(m)) {
			if(m != null) System.out.println("Niedozwolony ruch");
			int xf, yf, xt, yt;
			xf = read.nextInt();
			yf = read.nextInt();
			xt = read.nextInt();
			yt = read.nextInt();
			Cords cFrom = new Cords(xf, yf);
			GameTile gtFrom = super.getGame().getBoard().getTile(cFrom);
			Cords cTo = new Cords(xt, yt);
			GameTile gtTo = super.getGame().getBoard().getTile(cTo);
			m = new PawnMove(gtFrom, gtTo);
			System.out.println(m.toString());
		}
		return m;
	}

}
