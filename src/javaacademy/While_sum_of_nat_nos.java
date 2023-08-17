package javaacademy;
import java.util.*;
public class While_sum_of_nat_nos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int i=0;
		int sum=0;
		while(i<=n) {
			sum+=i;	
			i++;
		}
		
		i=0;
		int even=0;
		while(i<=n) {
			if(i%2==0) {
				even += i;
			}
			i++;
		}
		
		int j=0;
		int odd=0;
		while(j<=n) {
			if(j%2!=0) {
				odd += j;
			}
			j++;
		}
		System.out.println();
		System.out.print("Sum of n natural nos : "+sum);
		System.out.println();
		System.out.print("sum of n even natural nos : "+even);
		System.out.println();
		System.out.print("Sum of n odd natural nos : "+odd);
		
		
		
	}
}
