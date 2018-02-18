package jp.jojo.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TournamentSketch {

	private static class Player {

		Player(String name, String lastName) {
		}
	}

	private static class Team {
		Team(String name, List<Player> players) {
		}
	}

	private static class Tournament {

		Tournament(String name, List<Team> teams) {
		}

		void register(Team first, Team second, int score1, int score2) {

		}

		Standings currentStandings() {
			return null;
		}
	}

	private static class Standings {

		/**
		 * Returns the team that is on the queried position.
		 * 
		 * @param position
		 *            the position
		 * @return the team at the given position
		 */
		Team team(int position) { //we use this to find out which team is on the 3rd position 
			return null;
		}

		int points(int position) { //we use this when we want to know how many points does 5th team have
			return -1;
		}

		int points(Team team) { // we use this when we want to know how many points does bayern have
			return -1;
		}

	}

	public static void main(String[] args) {

		//let's register few of the players from the early 90s period
		Player baresi = new Player("Franco", "Baresi");
		Player vanBasten = new Player("Marco", "van Basten");
		Player baggio = new Player("Roberto", "Baggio");
		Player gullit = new Player("Ruud", "Gullit");
		Player klinsmann = new Player("Jurgen", "Klinsmann");
		Player matthaus = new Player("Lothar", "Matthaus");

		//let's make teams out of them
		Team milan = new Team("Milan", Arrays.asList(baresi, vanBasten, gullit));
		Team juventus = new Team("Juventus", Arrays.asList(baggio));
		Team inter = new Team("Inter", Arrays.asList(klinsmann, matthaus));
		Team bayern = new Team("Bayern", Collections.emptyList());//to make the example shorter only ghosts play!
		Team barcelona = new Team("Barcelona", Collections.emptyList());

		//we can also reuse them for the national teams
		Team holland = new Team("Netherlands", Arrays.asList(vanBasten, gullit));
		Team italy = new Team("Italy", Arrays.asList(baresi, baggio));
		Team germany = new Team("Germany", Arrays.asList(klinsmann, matthaus));

		//now let's create some competitions
		Tournament itChamp = new Tournament("Serie A", Arrays.asList(milan, juventus, inter));
		Tournament gerChamp = new Tournament("Bundesliga", Arrays.asList(bayern));
		//after national leagues it is time for continental club competition
		Tournament champCup = new Tournament("Champions Cup", Arrays.asList(barcelona, milan, bayern));
		//and world cup!
		Tournament worldCup = new Tournament("World Cup 1990", Arrays.asList(holland, italy, germany));

		//now let's play some matches
		itChamp.register(milan, inter, 2, 0); //milan-inter 2:0
		itChamp.register(inter, juventus, 1, 1);

		champCup.register(milan, barcelona, 4, 0);
		//note that tournament is the only of our classes that has mutable state. with every match 
		//registered something inside changes (in other words, match is memorized somehow). all the 
		//other classes remain the same since they were created
		worldCup.register(holland, germany, 1, 2);

		//now we are interested in the standings
		Standings italyStandings = itChamp.currentStandings();
		//this class can be crafted to show the snapshot of the standings in one moment and to remain
		//unmodified if additional matches are added. the other option is to reflect all of the subsequent matches.
		//first approach is simpler, the second one is more flexible. it is up to the user's needs to choose 
		//one that is more appropriate

		//let's find out who is the leader
		Team first = italyStandings.team(0); //start with zero
		//let's see how many points does this team have
		int points1 = italyStandings.points(first);
		int points2 = italyStandings.points(0);//last two values should be the same
	}
}
