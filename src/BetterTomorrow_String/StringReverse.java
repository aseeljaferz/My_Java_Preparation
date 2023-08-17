package BetterTomorrow_String;
import java.util.*;
public class StringReverse {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		String rev = "";
		
		for(int i=0; i<str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		System.out.print(rev);
		

	}

}
