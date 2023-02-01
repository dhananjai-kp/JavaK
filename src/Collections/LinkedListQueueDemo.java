package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {
public static void main(String[] args) {
	Queue<Integer> queue = new LinkedList<>();

	queue.offer(21);
	queue.offer(22);
	queue.offer(23);

	System.out.println(queue);
	queue.poll();
	System.out.println(queue);
	
	System.out.println(queue.peek());
}
}
