package JavaBasics;

public class ScoreBoard {
public static void main(String[] args) {
	
	int score = 100;
	
	if (score <= 0 & score <=30 ) {
		System.out.println("You have failed this time, Better luck next time");
	}

	else if (score <=30 & score <40 ) {
		System.out.println("Your grade is : C");
	}

	else if (score <=40 & score <50 ) {
		System.out.println("Your grade is : B");
	}

	else if (score <=50 & score <60 ) {
		System.out.println("Your grade is : B1");
	}

	else if (score <=60 & score <70 ) {
		System.out.println("Your grade is : A");
	}
	else if (score <=70 & score <80 ) {
		System.out.println("Your grade is : A+");
	}

	else if (score <=80 & score <90 ) {
		System.out.println("Your grade is : A*");
	}

	else if (score <=90 & score <=100 ) {
		System.out.println("Your grade is : A++");
	}

	else
	{
		System.out.println("Wrong Input");
	}

}
}
