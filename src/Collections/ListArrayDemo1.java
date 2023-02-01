package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListArrayDemo1 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
	
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(11);
		list2.add(12);
		list2.add(13);
		list1.addAll(list2);

		list1.add(5, 200);
		
		list1.remove(0);
		
		list1.set(0, 100000);
		System.out.println(list1);
		System.out.println(list1.get(5));
		System.out.println(list1.contains(200));
	
	}
}
