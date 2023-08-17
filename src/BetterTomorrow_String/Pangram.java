package BetterTomorrow_String;
import java.util.*;
public class Pangram {

	public static void main(String[] args) {
		
		Set<Character> s = new HashSet<>();
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		char c[] = str.toCharArray();
		
		for(char ch : c) {
			
			if(ch >= 'a' && ch<= 'z') {
				s.add(ch);
			}
			
			if(ch >= 'A' && ch<= 'Z') {
				ch = Character.toLowerCase(ch);
				s.add(ch);
			}
			
		}
		System.out.println(s);
		
		
		if(s.size()== 26) {
			System.out.print("The string is pangram");
		}
		else {
			System.out.print("The string is not pangram");
		}

	}

}
