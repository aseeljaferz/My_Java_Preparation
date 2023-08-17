package javaacademy;
import java.util.*;
class While_pres_prev_evens {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int present = 1;
		int prev=-1;
		System.out.println("present  value = "+present);
		System.out.println("previous value = "+prev);
		while(present<n) {
			present++;
			if(present%2==0) {
				present++;
			}
			if(present%2!=0) {
				if(present<=n) {
					System.out.println("present  value = "+present);
				}
			}
			int i=present;
			if(present<n) {
				i--;
				if(i%2==0) {
					i--;
					System.out.println("previous value = "+i);
				}
				
			}
		}
		
	}
}
