package javaacademy;
import java.util.*;
public class While_factorial_oddeven {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i = 1;
		int even_sum=0;
		int odd_sum=0;
		
		while(i<=n) {
			if(i%2==0) {
				int start = 1;
				int even_fact = 1;
				while(start <= i) {
					even_fact *= start;
					start++;
				}
				even_sum += even_fact;
			}
			else {
				int start = 1;
				int odd_fact = 1;
				while(start <= i) {
					odd_fact *= start;
					start++;
				}
				odd_sum += odd_fact;
			}
			i++;
		}
		
		System.out.println("Even sum factorial = "+even_sum);
		System.out.println("Odd sum factorial  = "+odd_sum);

	}

}
