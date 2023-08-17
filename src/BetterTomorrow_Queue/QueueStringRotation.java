package BetterTomorrow_Queue;
import java.util.*;
public class QueueStringRotation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		
		Queue<Character> q1 = new LinkedList<>();
		for(int i=0; i<s1.length(); i++) {
			q1.add(s1.charAt(i));
		}
		
		Queue<Character> q2 = new LinkedList<>();
		for(int i=0; i<s2.length(); i++) {
			q2.add(s2.charAt(i));
		}
		
		int k = s2.length();
		int flag=0;
		while(k-- > 0) {
			char ch = q2.peek();
			q2.remove();
			q2.add(ch);
			if(q2.equals(q1)) {
				flag = 1;
				break;
			}
		}
		if(flag==1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
