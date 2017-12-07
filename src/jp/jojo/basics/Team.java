package jp.jojo.basics;

import java.util.List;

class Team {

	// this class models a team (consisting of group of players)
	// first task is to finish this class (create fields and fill them in constructor) 
	// and publish the number of players to the outer world
	private final int playerCount;
	
	Team(List<Player> players) {
		playerCount = players.size();
	}
	public int size() {
		return playerCount;
	}

}
