package Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetdemo1 {
	public static void main(String[] args) {
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(32);
		set1.add(2);
		set1.add(54);
		set1.add(21);
		set1.add(65);
		set1.add(2);

		System.out.println(set1);
		set1.remove(54);
		System.out.println(set1);
		System.out.println(set1.contains(2));
		System.out.println(set1.isEmpty());
		System.out.println(set1.size());
		set1.clear();
		System.out.println(set1);
	}
}
