package Collections;
import java.util.Stack;
public class StackDemo {
public static void main(String[] args) {
	Stack<String> animals = new Stack<>();
	animals.add("Lion");
	animals.add("Camel");
	animals.push("Horse");
	
	System.out.println("Stack : "+animals);
	System.out.println(animals.peek());
	animals.pop();
	System.out.println("After poppping once "+animals);

}
}
