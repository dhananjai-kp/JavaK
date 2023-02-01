package Array;

public class ArrayCopy {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int b[] = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j] + " ");
		}

	}

}
