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

	//let's start with classes. as the simplest role class can be used to collect the associated information.
	//in the below example we will track the properties of a football player. class represents features that represent a football player
	//we require it to have a name, and three integer values that show his abilities. note that below contstruct does not create a
	//football player, it just provides a form that each of them must fill
	static class Player {
		String name;
		int speed;
		int dribbling;
		int power;

		//toString is a special method that is used to display the information about player (or any other object)
		//when the user calls System.out.println(player) this information will be retrieved
		//see the example at the end
		public String toString() {
			return name + " -> speed:" + speed + ", dribbling:" + dribbling + ", power:" + power;
		}

	}

	//every Java program must 'start' from somewhere. starting point can be in any class
	//which includes method called main that looks just like the below one. the only thing that
	//can be modified is the name 'args'.

	//in eclipse the program is started by pressing Alt+Shift+X and then J. alternatively, right click on this window, 
	//choose Run As->Java Application
	public static void main(String[] args) {

		Player messi = new Player();
		//we create a new player. it is a completely empty player. it has no name, and all his features are set to zero
		//in terms of computer memory the above command has requested a small piece of that big field of RAM bytes in which it can 
		//memorize four items for that player
		messi.name = "Lionel Messi"; //we assign the name now
		messi.speed = 90; //and other features
		messi.dribbling = 99;
		messi.power = 95;
		System.out.println(messi); //now we print them on the screen

		Player ronaldo = new Player(); //now do the same thing for Ronaldo
		ronaldo.name = "Christiano Ronaldo";
		ronaldo.speed = 97;
		ronaldo.dribbling = 95;
		ronaldo.power = 98;
		System.out.println(ronaldo); // keyboard shortcut hint. in eclipse you can write syso and then press Ctrl+Space. it will expand to this line

		Player sivonjic = new Player();
		sivonjic.name = "Ilija Sivonjic";
		sivonjic.speed = 42;
		sivonjic.dribbling = 0;
		sivonjic.power = 23;
		System.out.println(sivonjic);

		//let's put all the players in the list
		List<Player> players = Arrays.asList(messi, ronaldo, sivonjic); // (***) 
		System.out.println(players); //we print all of them, in the same line

		//now we can do various things, we can sort them by name
		Collections.sort(players, Comparator.comparing((Player x) -> x.name)); //(***)
		System.out.println(players);

		//or by speed
		Collections.sort(players, Comparator.comparing((Player x) -> x.speed)); //(***)
		System.out.println(players);

		//now we want to add more players, but we are a bit annoyed by the amount of typing it takes to create onw player
		//do you have an idea how to do it in shorter and smarter way?

		//now exercise for you. try to make a class for the company employees. each employee has a name, a number of years spent in the company, and a boss (except for the highest one)
		//create several employees from your company that reflect the real state

	}

}
