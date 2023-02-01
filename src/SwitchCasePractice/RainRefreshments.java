package SwitchCasePractice;
public class RainRefreshments {
	static void rain() {
		String experience = null;
		String weather = "winter";
		
		switch (weather) {
		
		case "winter":
			experience = "tooCold";
			break;
		case "summer":
			experience = "pleasing";
			break;
		case "rainy":
			experience = "normal";
			break;
		default:
			experience = "noexperience";
			System.out.println("Wrong Weather Input");
		}
		
		if (experience.equalsIgnoreCase("tooCold") ) {
			kadha();
		}
		else if (experience.equalsIgnoreCase("pleasing")) {
			icecream();
		}
		else if(experience.equalsIgnoreCase("normal")) {
			tea();
		}
	}

	static void kadha() {
		System.out.println("As a precaution for cold, We should drink kadha.");
	}
	static void icecream() {
		System.out.println("Summer rains are best enjoyed with icecreams.");
	}
	static void tea() {
		System.out.println("Its raining, lets take some tea with pakodas.");
	}

	public static void main(String[] args) {
		rain();
	}
}
