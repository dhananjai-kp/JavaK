package Array;

public class FirstMissingPositive {

	public static void fmpMethod(int[] num) {
		int a = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					a = num[i];
					num[i] = num[j];
					num[j] = a;
				}
			}
		}
		if () {}
		if () {}
		if () {}
		
	public static void main(String args[]) {
		int b[] = {3,4,-1,1};
		fmpMethod(b);
	} 
	
}
