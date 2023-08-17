package javaacademy;
import java.util.*;
public class While_even_pres_prev {
	public static void main(System[] args) {
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int present = 1;
		int i=1;
		while(present<=n) {
//			if(i%2!=0) {
//				System.out.println("Current value ="+i);
//				i--;
//			}
//			if(present%2!=0) {
//				System.out.println("prev value ="+present);
//				present++;
//			}
			System.out.println("prev value ="+present);
			present++;
		}
		
	}
}
