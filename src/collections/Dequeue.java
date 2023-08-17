package collections;
import java.util.*;
public class Dequeue {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		for (String str : deque) {  
			System.out.println(str);  
		}  
		System.out.println();
		deque.removeLast();
		for(String str : deque) {
			System.out.println(str);
		}
		System.out.println();
		deque.removeFirst();
		for(String str : deque) {
			System.out.println(str);
		}
	}
}
