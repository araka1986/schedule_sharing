package jp.jojo.basics;

import java.util.List;

class Team {

	// this class models a team (consisting of group of players)
	// first task is to finish this class (create fields and fill them in constructor) 
	// and publish the number of players to the outer world
	Player playerName;
	String name;
	List<Player> players;

	Team(String name, List<Player> players) {
		this.name = name;
		this.players = players;
	}
	
	public Player getPlayer(int a){
		a = a-1;
		playerName = players.get(a);
		return playerName;
	}
	public String name() {
		return name;
	}
}
