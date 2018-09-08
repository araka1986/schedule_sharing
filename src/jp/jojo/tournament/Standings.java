package jp.jojo.tournament;

import java.util.List;

class Standings {

	private final List<TeamStats> stats;

	Standings(List<TeamStats> stats) {
		this.stats = stats;
	}

	List<TeamStats> stats() {
		return stats;
	}
}
