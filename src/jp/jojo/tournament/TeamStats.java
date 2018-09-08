package jp.jojo.tournament;

class TeamStats implements Comparable<TeamStats> {

	private final Team team;
	private final MatchBalance matchBalance;
	private final GoalBalance goalBalance;

	TeamStats(Team team, MatchBalance matchBalance, GoalBalance goalBalance) {
		this.team = team;
		this.matchBalance = matchBalance;
		this.goalBalance = goalBalance;
	}

	Team team() {
		return team;
	}

	int won() {
		return matchBalance.won();
	}

	int lost() {
		return matchBalance.lost();
	}

	int draw() {
		return matchBalance.draw();
	}

	int goalsFor() {
		return goalBalance.goalsFor();
	}

	int goalsAgainst() {
		return goalBalance.goalsAgainst();
	}

	int goalDifference() {
		return goalBalance.goalDifference();
	}

	int points() {
		return matchBalance.points();
	}

	@Override
	public int compareTo(TeamStats other) {
		if (points() > other.points())
			return -1;
		if (points() < other.points())
			return 1;
		if (goalDifference() > other.goalDifference())
			return -1;
		if (goalDifference() < other.goalDifference())
			return 1;
		if (goalsFor() > other.goalsFor())
			return -1;
		if (goalsFor() < other.goalsFor())
			return 1;
		return 0;
	}

}
