package javaacademy;
import java.util.*;
public class While_factorial {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum=0;
		int i = 1;
		
		while(i <= n) {
			int start = 1;
			int fact = 1;
			while(start <= i) {
				fact = fact*start;
				start++;
			}
			sum += fact;
			i++;
		}
		
		System.out.println("sum of factorial of "+n+" = "+sum);

	}

}
