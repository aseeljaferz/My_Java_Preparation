package training;
import java.util.*;
public class StringAllAsBeforeBs {

	public static void main(String[] args) {
		String ch;
		Scanner in = new Scanner(System.in);
		ch = in.next();
		int i,j,flag=0;
		int n = ch.length();
		for(i=0;i<n;i++) {
			if(ch.charAt(i)=='B'&&ch.charAt(i+1)=='A') {
				flag=1;
				System.out.println("False");
				break;
			}
		}
		if(flag==0) {
			System.out.println("True");
		}
	}

}
