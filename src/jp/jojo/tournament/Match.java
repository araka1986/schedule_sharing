package jp.jojo.tournament;

class Match {

	private final Team homeTeam;
	private final Team awayTeam;
	private final Result result;

	Match(Team homeTeam, Team awayTeam, Result result) {
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.result = result;
	}

	Team homeTeam() {
		return homeTeam;
	}

	Team awayTeam() {
		return awayTeam;
	}

	Result result() {
		return result;
	}
}
