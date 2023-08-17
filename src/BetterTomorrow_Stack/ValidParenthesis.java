package BetterTomorrow_Stack;
import java.util.*;
public class ValidParenthesis {
	
	public static boolean isValidSeq(char s_peek, char c) {
		return ((s_peek == '(' && c == ')') || (s_peek == '{' && c == '}') || (s_peek == '[' && c == ']'));
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		Stack<Character> s = new Stack<>();
		 for(char c : str.toCharArray()) {
			 if(s.isEmpty()) {
				 s.push(c);
			 }
			 else {
				 if(isValidSeq(s.peek(),c)) {
					 s.pop();
				 }
				 else {
					 s.push(c);
				 }
			 }
		 }
		 
		 System.out.println(s.isEmpty());

	}

}
