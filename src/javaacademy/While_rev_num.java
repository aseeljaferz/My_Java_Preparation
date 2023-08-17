package javaacademy;
import java.util.*;
public class While_rev_num {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt();
		int rev=0;
		System.out.println("Value ="+n);
		while(n!=0) {
			int val = n%10;
			rev = rev*10+val;
			n /= 10;
		}
		
		System.out.println("");
		System.out.println("Value after reversed ="+rev);

	}

}
