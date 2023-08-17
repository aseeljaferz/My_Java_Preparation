package javaacademy;
import java.util.*;
public class OctaltoDecimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int octal = in.nextInt();
		int temp;
		int sum=0;
		int i=0;
		while( octal!=0 ) {
			
			temp = octal%10;
			sum += temp*(Math.pow(8,i));
			i++;
			octal/=10;
			
		}
		
		
		
		System.out.print(sum);
		
	}

}