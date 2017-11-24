package jp.jojo.basics;

class Player {

	String name;
	int speed;
	int dribbling;
	int power;
	
	Player(final String name, final int speed, final int dribbling, final int power) {
		this.name = name;
		this.speed = speed;
		this.dribbling = dribbling;
		this.power = power;
	}

	public String toString() {
		return name + " -> speed:" + speed + ", dribbling:" + dribbling + ", power:" + power;
	}

}
