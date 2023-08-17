package BetterTomorrow_String;
import java.util.*;
public class ReverseWord {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String str = in.nextLine();	
		String s[] = str.split("[.]");
		String rev = "";
		
		for(int i=s.length-1; i>=0; i--) {
			rev += s[i]+".";
		}
		System.out.println(rev.substring(0, rev.length()-1));
		
		//or using string builder
		
//		StringBuilder sb = new StringBuilder();
//		String arr[] = str.split
		
		//without .
		
//		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();	
//		String s[] = str.split(" ");
//		String rev = "";
//		
//		for(int i=s.length-1; i>=0; i--) {
//			rev += s[i]+" ";
//		}
//		System.out.println(rev.substring(0, rev.length()-1));
		
	}

}
