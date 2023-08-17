package stacksANDqueues;
import java.util.*;
public class Samplestack {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(10);
		stack.push(45);
		stack.push(23);
		stack.push(67);
		System.out.println(stack.pop()+" "+stack.size());
		System.out.println(stack.peek()+" "+stack.isEmpty());
		System.out.println(stack);
		

	}

}
