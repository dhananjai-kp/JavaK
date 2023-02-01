// right sided triangle pattern
package pattern;

public class pattern1 {

	public static void main(String[] args) {
		int i, j, row = 7;
 
		for (i = 0; i < row; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


