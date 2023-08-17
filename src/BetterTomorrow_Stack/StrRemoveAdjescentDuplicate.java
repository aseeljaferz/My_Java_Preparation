//azxxzy -> ay

package BetterTomorrow_Stack;
import java.util.*;
public class StrRemoveAdjescentDuplicate {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		Stack<Character> s = new Stack<> ();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(!s.isEmpty() && s.peek() == c) {
				s.pop();
			}
			else {
				s.push(c);
			}
		}
		
		StringBuilder sb1 = new StringBuilder();
		while(!s.isEmpty()) {
			sb1.append(s.pop());
		}
		System.out.print(sb1.reverse().toString());
		
		
		// or completely using string builder

		
//		StringBuilder sb2 = new StringBuilder();
//		for(char c : str.toCharArray()) {
//			int size = sb2.length();
//			
//			if(size > 0 && sb2.charAt(size-1)==c) {
//				sb2.deleteCharAt(size-1);
//			}
//			else {
//				sb2.append(c);
//			}
//		}
//		System.out.print(sb2.toString());

		
	}

}


//  string to string Buffer or Builder
//  we have to use constructor
//  string str = "good";
//  StringBuilder sb = new StringBuilder(str); //obj