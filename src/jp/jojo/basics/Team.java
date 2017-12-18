package jp.jojo.basics;

import java.util.List;

class Team {

	// this class models a team (consisting of group of players)
	// first task is to finish this class (create fields and fill them in constructor) 
	// and publish the number of players to the outer world
	Player numberOne;
	Player numberTwo;
	
	Team(List<Player> players) {
		this.numberOne = players.get(0);
		this.numberTwo = players.get(1);
	}
	public Player getPlayer(int a){
		if (a == 1) {
			return numberOne;
		}
		else {
			return numberTwo;
		}
	}
	
}
