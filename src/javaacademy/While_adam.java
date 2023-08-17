package javaacademy;
import java.util.*;
public class While_adam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		double n_pow =  Math.pow(n, 2);
		
		int temp = n;
		int rem, res = 0, rev = 0;
		
		while(temp!=0) {
			
			rem = temp % 10;
			rev = rev*10+rem;
			temp /= 10;
		}
//		System.out.println("After reversing of "+n);
//		System.out.println(rev);

		double rev_pow = Math.pow(rev, 2);
		
//		System.out.println("Power of "+n+" is "+n_pow);
//		System.out.println("Power of "+rev+" is "+rev_pow);
		
		int rev_temp = (int) rev_pow;
		int new_rev=0, new_rem, new_res=0;
		
		while(rev_temp!=0) {
			
			new_rem = rev_temp % 10;
			new_rev = new_rev*10+new_rem;
			rev_temp /= 10;
		}
//		System.out.println("Reversing "+rev_pow+" = "+(double)new_rev);
		
		if(n_pow == new_rev) {
			System.out.println(n+" is a Adam Number");
		}
		else {
			System.out.println(n+" is not a Adam Number");
		}
		
	}

}
