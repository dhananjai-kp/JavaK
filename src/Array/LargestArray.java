package Array;

public class LargestArray {
public static void main(String[] args) {
	
	int a[] = {10,2,3,4,5};
	int max = a[0];
	for (int i =0;i<a.length;i++) {
		if ( a[i]> max) {
			max = a[i];
		}
	}
	System.out.println(max);
}
}
