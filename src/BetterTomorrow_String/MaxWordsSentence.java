package BetterTomorrow_String;
import java.util.*;
public class MaxWordsSentence {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String s[] = str.split(",");

		int max = 0;
		 for(int i=0; i<s.length; i++) {
			 String a[] = s[i].split(" ");
			 if(a.length > max) {
				 max = a.length;
			 }
		 }
		 System.out.println(max);

	}

}
