package StringFunction;
import java.util.*;
public class GetBytes {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
//		byte[] s = str.getBytes();
//		for(int i=0; i<s.length; i++) {
//			System.out.println(s[i]);
//		}
		char[] s = str.toCharArray();
//		for(int i=0;i<s.length;i++) {
//			System.out.print(s[i]);
//		}
		LinkedHashSet<Character> c = new LinkedHashSet<Character>(); 
		for(int i=0;i<s.length;i++) {
			c.add(s[i]);
		}
		System.err.print(c);

	}

}
