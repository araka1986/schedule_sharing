//this is a comment, i will use these to provide explanations
//everything that is behind two slashes has no impact to the code execution

//for the first reading there will be things that you dont need to understand fully, just accept them for now
//i will mark such lines by three asterisks in the comment ***
package jp.jojo.basics; // ***

//ignore all the imports
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Basics {

	static class Player {
		String name;
		int speed;
		int dribbling;
		int power;

		/*
		 * Instead of using static method for creating objects, most often so called
		 * constructors are introduced. for simple objects they usually accept arguments
		 * that are assigned to their inner fields.
		 * 
		 * Note the use of word 'this'. For example 'this.name=name'. that is used to distinguish
		 * Players's 'name' and the 'name' as the argument of the constructor. if you write just
		 * 'name=name;' that command would have no effect.
		 * 
		 */
		Player(String name, int speed, int dribbling, int power) {
			this.name = name;
			this.speed = speed;
			this.dribbling = dribbling;
			this.power = power;
		}

		public String toString() {
			return name + " -> speed:" + speed + ", dribbling:" + dribbling + ", power:" + power;
		}

	}

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

	}

	//	private static Player newPlayer(String a, int b, int c, int d) {
	//		Player player = new Player();
	//		player.name = a;
	//		player.speed = b;
	//		player.dribbling = c;
	//		player.power = d;
	//		return player;
	//	}

}
