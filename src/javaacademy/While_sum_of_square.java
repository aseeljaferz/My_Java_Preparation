package javaacademy;
import java.util.*;
import java.math.*;
public class While_sum_of_square {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i=0;
		int ans=0;
		
		while(i<=n) {
			ans += Math.pow(i,2);
			i++;
		}
		System.out.println("sum of square of n nat nos : "+ans);

	}

}
