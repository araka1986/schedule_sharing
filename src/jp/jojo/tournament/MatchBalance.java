package jp.jojo.tournament;

class MatchBalance {
	private final int won;
	private final int lost;
	private final int draw;

	MatchBalance(int won, int lost, int draw) {
		this.won = won;
		this.lost = lost;
		this.draw = draw;
	}

	int won() {
		return won;
	}

	int lost() {
		return lost;

	}

	int draw() {
		return draw;
	}

	int points() {
		return 3 * won + 1 * draw + 0 * lost;
	}

}
