package BetterTomorrow_String;
import java.util.*;
public class Anaggram {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		
		char s1[] = str1.toCharArray();
		char s2[] = str2.toCharArray();
		
		int n1 = str1.length();
		int n2 = str2.length();
		
		if(n1!=n2) {
			System.out.println("Not an Anagram");
			return;
		}
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		int count =0;
		for(int i=0; i<n1; i++) {
			
			if(s1[i] != s2[i]) {
				System.out.println("Not an Anagram");
				return;
			}
		}
		System.out.println("It is an Anagram");

	}

}
