package jp.jojo.tournament;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Tournament {

	private final List<Team> teams;
	private final List<Match> matches;

	Tournament(List<Team> teams) {
		this.teams = teams;
		this.matches = new ArrayList<>();
	}

	void play(Match match) {
		matches.add(match);
	}

	List<Team> teams() {
		return teams;
	}

	TeamStats stats(Team team) {
		int won = 0;
		int lost = 0;
		int draw = 0;
		int gf = 0;
		int ga = 0;

		for (Match match : matches) {
			int scored;
			int received;
			if (match.homeTeam().equals(team)) {
				scored = match.result().homeTeamScore();
				received = match.result().awayTeamScore();
			} else if (match.awayTeam().equals(team)) {
				scored = match.result().homeTeamScore();
				received = match.result().awayTeamScore();
			} else
				continue;
			gf += scored;
			ga += received;

			if (scored > received)
				won++;
			else if (scored < received)
				lost++;
			else
				draw++;
		}

		GoalBalance goals = new GoalBalance(gf, ga);
		MatchBalance match = new MatchBalance(won, lost, draw);
		return new TeamStats(team, match, goals);
	}

	Standings standings() {
		List<TeamStats> allStats = new ArrayList<>();
		for (Team team : teams) {
			TeamStats stats = stats(team);
			allStats.add(stats);
		}
		Collections.sort(allStats);
		Standings standings = new Standings(allStats);
		return standings;
	}
}
