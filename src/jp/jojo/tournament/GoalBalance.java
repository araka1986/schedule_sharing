package jp.jojo.tournament;

class GoalBalance {

	private final int goalsFor;
	private final int goalsAgainst;

	GoalBalance(int goalsFor, int goalsAgainst) {
		this.goalsFor = goalsFor;
		this.goalsAgainst = goalsAgainst;
	}

	int goalsFor() {
		return goalsFor;
	}

	int goalsAgainst() {
		return goalsAgainst;
	}

	int goalDifference() {
		return goalsFor - goalsAgainst;
	}

}
