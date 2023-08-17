package stacksANDqueues;
import java.util.*;
public class StackBracketLeetcode921 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str=in.next();
		int i,count=0;
		char c[]= str.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for(i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') {
				stack.push(str.charAt(i));
			}
			else {
				if(stack.isEmpty()) {
					count++;
//					System.out.println("Not balanced");
					return;
				}
				if(str.charAt(i)==')') {
					stack.pop();
				}
			}
		}
		System.out.println(count+stack.size());
	}
}
