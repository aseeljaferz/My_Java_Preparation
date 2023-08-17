package javaacademy;
import java.util.*;
public class While_onefact_plus_tilln {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int i = 1;
		double even_onefact = 0;
		double odd_onefact = 0;
		
		while(i<=n) {
			if(i%2==0) {
				int start = 1;
				int fact=1;
				while(start<=i) {
					fact = fact*start;
					start++;
				}
				even_onefact += (1/(double)fact);
			}
			else {
				int start = 1;
				int fact=1;
				while(start<=i) {
					fact = fact*start;
					start++;
				}
				odd_onefact += (1/(double)fact);
			}
			i++;
		}
		System.out.println("Even onefact = "+even_onefact);
		System.out.println("Odd onefact = "+odd_onefact);
	}

}
