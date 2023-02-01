package SwitchCasePractice;

public class practice1 {

	static void practice1() {
		String controlPower = null;
		String planet = "saturn";

		switch (planet) {

		case "Earth":
			controlPower = "NASA";
			break;

		case "Marse":
			controlPower = "Alien";
			break;

		default:
			controlPower = "Human";
			System.out.println("You are out of the universe");
		}
		
		if (controlPower.equalsIgnoreCase("NASA")) {
			earth();
		} 
		else if (controlPower.equalsIgnoreCase("Alien")) {
			marse();
		}

	}

	static void earth() {
		System.out.println("Welcome to green earth");
	}

	static void marse() {
		System.out.println("Welcome to red planet");
	}

	public static void main(String[] args) {
		practice1();
	}
}
