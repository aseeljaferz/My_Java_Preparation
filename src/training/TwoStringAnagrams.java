package training;
import java.util.*;
public class TwoStringAnagrams {

	public static void main(String[] args) {
		String ch1,ch2;
		int i;
		Scanner in = new Scanner(System.in);
		ch1 = in.next();
		ch2 = in.next();
		int f1[]=new int[26];
		int f2[]=new int[26];
		for(i=0;i<ch1.length();i++) {
			f1[ch1.charAt(i)-97]+=1;
			f2[ch2.charAt(i)-97]+=1;
		}
		for(i=0;i<26;i++) {
			if(f1[i]!=f2[i]) {
				System.out.println("not anagram");
			}
		}
		System.out.println("anagram");
	}

}
