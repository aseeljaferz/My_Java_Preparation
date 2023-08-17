package javaacademy;
import java.util.*;
public class Binary_to_Decimal {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int binary = in.nextInt();
		int temp;
		int i=0;
		int sum=0;
		int rem=0;
		while( binary != 0 ) {
			temp = binary%10;
			sum = sum +(temp*(int)Math.pow(2,i));
			i++;
			
			binary /= 10;
			
		}
		System.out.print(sum);

	}

}
