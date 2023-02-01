package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListListDemo2 {
public static void main(String[] args) {
	List<Integer> list = new LinkedList<>();

	list.add(21);
	list.add(22);
	list.add(23);

	System.out.println(list);
	list.remove(1);
	System.out.println(list);	}
}
