package LoopsPractice;

public class ForDemo2 {
	static void fordemomethod2() {
		int x;
		int y;

		for (x = 0; x <= 10; x++) {
			for (y = 10; y >= 0; y--) {
				System.out.println("X = " + x + "    Y = " + y);
				break;
			}
		}
	}

	public static void main(String[] args) {
		fordemomethod2();
	}
}
