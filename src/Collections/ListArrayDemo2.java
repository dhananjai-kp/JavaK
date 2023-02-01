package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListArrayDemo2 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
	
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i)+" ");
		}
		System.out.println("########");

		for (Integer int1:list1) {
			System.out.println(int1);
		}
		System.out.println("########");
	
		Iterator<Integer> int2 = list1.iterator();
		while (int2.hasNext()) {
			if (int2.next()==30	) {
				System.out.println(int2.next());

			}
			
		}
		
		
		
	}
}
