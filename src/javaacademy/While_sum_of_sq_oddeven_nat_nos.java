package javaacademy;
import java.util.*;
public class While_sum_of_sq_oddeven_nat_nos {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i = 0;
		int even = 0, odd = 0;
		
		while(i<=n) {
			if(i%2==0) {
				even += Math.pow(i,2); 
			}
			i++;
		}
		
		i = 0;
		while(i<=n) {
			if(i%2!=0) {
				odd += Math.pow(i,2); 
			}
			i++;
		}
		
		System.out.println("Sum of square of Even nos = "+even);
		System.out.println("Sum of square of Odd  nos = "+odd);
		
	}

}
