package jp.jojo.tournament;

class Result {
	private final int homeTeamScore;
	private final int awayTeamScore;

	Result(int homeTeamScore, int awayTeamScore) {
		this.homeTeamScore = homeTeamScore;
		this.awayTeamScore = awayTeamScore;
	}

	int homeTeamScore() {
		return homeTeamScore;
	}

	int awayTeamScore() {
		return awayTeamScore;
	}

}
