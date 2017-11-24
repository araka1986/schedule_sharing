package jp.jojo.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Basics {

	/*
	 * Now we have separated class Player in a different file.
	 */

	public static void main(String[] args) {
		Player messi = new Player("Lionel Messi", 96, 96, 97);
		Player ronaldo = new Player("Christiano Ronaldo", 97, 95, 98);
		Player sivonjic = new Player("Ilija Sivonjic", 42, 0, 23);

		//let's put all the players in the list
		List<Player> players = Arrays.asList(messi, ronaldo, sivonjic); // (***) 
		System.out.println(players); //we print all of them, in the same line

		//now we can do various things, we can sort them by name
		Collections.sort(players, Comparator.comparing((Player x) -> x.name)); //(***)
		System.out.println(players);

		//or by speed
		Collections.sort(players, Comparator.comparing((Player x) -> x.speed)); //(***)
		System.out.println(players);
		System.out.println();

		messi.dribbling = 0;
		messi.power = 0;
		messi.speed = 0;

		//somebody took away messi's abilities!!!

		System.out.println(messi);

		// sorting again by the speed, messi ends up at the last place!!!
		Collections.sort(players, Comparator.comparing((Player x) -> x.speed)); //(***)
		System.out.println(players);

		// obviously it is not good if any part of the code can modify any object
		// what can we do to prevent this from happening? 

	}

}
