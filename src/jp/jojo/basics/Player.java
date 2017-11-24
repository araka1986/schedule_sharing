package jp.jojo.basics;

class Player {

	private final String name;
	private final int speed;
	private final int dribbling;
	private final int power;

	Player(String name, int speed, int dribbling, int power) {
		this.name = name;
		this.speed = speed;
		this.dribbling = dribbling;
		this.power = power;
	}

	public String name() {
		return name;
	}

	public String toString() {
		return name + " -> speed:" + speed + ", dribbling:" + dribbling + ", power:" + power;
	}

}
