package jp.jojo.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basics {

	/*
	 * Now we have separated class Player in a different file.
	 */

	public static void main(String[] args) {
		Player honda = new Player("Keisuke Honda", 50, 60, 97);
		Player kagawa = new Player("Shinji Kagawa", 97, 95, 80);
		Player nagatomo = new Player("Yuto Nagatomo", 90, 80, 90);
		Player kawashima = new Player("Eigo Kawashima", 30, 30, 100);
		Player oosako = new Player("Yuya Oosako", 90, 99, 88);
		Player hasebe = new Player("Makoto Hasebe", 80, 80, 80);
		//System.out.println(honda);
		//let's put all the players in the list
		List<Player> players = Arrays.asList(honda, kagawa); // (***) 
		List<Player> players2 = Arrays.asList(nagatomo, kawashima); // (***) 		
		List<Player> players3 = Arrays.asList(oosako, hasebe); // (***) 
		List<Player> all = new ArrayList<>();
		all.addAll(players);
		all.addAll(players2);
		all.addAll(players3);

		Team verdy = new Team("Verdy", players);
		Team yokohama = new Team("Yokohama", players2);
		Team Kashima = new Team("Kashima", players3);
		Team allStars = new Team("All stars", all);

		System.out.println(verdy.name()); //expected output is Verdy
		System.out.println(allStars.getPlayer(5)); //expected output is oosako
		System.out.println(yokohama.name()); //Yokohama
		System.out.println(yokohama.getPlayer(2)); //Eigo Kawashima
		System.out.println(Kashima.name()); //Kashima
		System.out.println(Kashima.getPlayer(1)); //Yuya Oosako
		System.out.println();

		Player spy = new Player("Hideaki Higashi", 100, 100, 100);
		all.add(spy);
		System.out.println(allStars.getPlayer(7)); //who is this guy, how did he enter all stars????
		System.out.println();

		/*
		 * //now we can do various things, we can sort them by name
		 * Collections.sort(players, Comparator.comparing((Player x) -> x.name())); //(***)
		 * System.out.println(players);
		 * 
		 * //or by speed
		 * Collections.sort(players, Comparator.comparing((Player x) -> x.speed())); //(***)
		 * System.out.println(players);
		 * System.out.println();
		 * 
		 * 
		 * System.out.println(honda);
		 * 
		 * // sorting again by the speed, messi ends up at the last place!!!
		 * Collections.sort(players, Comparator.comparing((Player x) -> x.speed())); //(***)
		 * System.out.println(players);
		 * 
		 * // obviously it is not good if any part of the code can modify any object
		 * // what can we do to prevent this from happening?
		 */

	}

}
