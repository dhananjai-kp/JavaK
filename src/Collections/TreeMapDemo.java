package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> numbers = new TreeMap<String, Integer>();
		
		numbers.put("Ane", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		numbers.put("Four", 4);
		numbers.put("Two", 25);
		System.out.println(numbers);
		
		
		for (Map.Entry<String, Integer > e: numbers.entrySet()) {
		//	System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		for (String key : numbers.keySet()) {
			System.out.println(key);
		}
			
		for (Integer value : numbers.values()) {
			System.out.println(value);
		}
		System.out.println(numbers.isEmpty());

		
	}
}
