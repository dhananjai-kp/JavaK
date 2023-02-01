package SwitchCasePractice;

public class practice1duplicate {

	static void practice2(){
		String controlPower = null ;
		String planet = "saturn";
		
		switch (planet) {
		case "earth":
			controlPower = "NASA";
			break;
		case "marse":
			controlPower = "Alien";
			break;
		default:
			controlPower = "Human";
			System.out.println("You are out of the galaxy");
		} 
		
		if (controlPower == "NASA") {
				earth(); 
		}
		else if (controlPower == "Alien") {
				marse();
		}	
		
	}

	static void earth() {
		System.out.println("Welcome to green Earth");
	}

	static void marse() {
		System.out.println("Welcome to red marse");
	}

	public static void main(String[] args) {
		practice2();

	}
}
