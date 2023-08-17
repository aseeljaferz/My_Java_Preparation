package BetterTomorrow_Stack;
import java.util.*;
public class AreBracketsBalanced {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str = in.next();
		
		Stack<Character> s = new Stack<>();
		int flag=1;
		for(int i=0; i<str.length(); i++) {
			char x = str.charAt(i);
			if(x == '(' || x == '[' || x == '{') {
				s.add(x);
			}
			
			char check;
			if(x == ')') {
				check = s.pop();
				if(check == '{' || check == '[') {
					System.out.println("false");
					flag=0;
					break;
				}
			}else if(x == ']'){
				check = s.pop();
				if(check == '(' || check == '{') {
					System.out.println("false");
					flag=0;
					break;
				}
				
			}else if(x == '}') {
				check = s.pop();
				if(check == '(' || check == '[') {
					System.out.println("false");
					flag=0;
					break;
				}
			}
			
		}
		
		if(flag==1) {
			System.out.print(s.isEmpty());
		}

	}

}
