package BetterTomorrow_Stack;
import java.util.*;
public class StackReverse {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Stack<String> s = new Stack<>();
		String str = in.nextLine();
		String [] sa = str.split(" ");
		for(int i=0; i<sa.length; i++) {
			s.push(sa[i]);
		}
		
		while(!s.empty()) {
			System.out.print(s.peek() + " ");
			s.pop();
		}
		in.close();

	}

}
