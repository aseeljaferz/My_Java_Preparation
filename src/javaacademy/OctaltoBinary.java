package javaacademy;
import java.util.*;
public class OctaltoBinary {

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
		
		String concat = "";
		int binary = 0;
		while ( sum!=0 ) {
			binary = sum%2;
			concat = binary + concat;
			sum = sum/2;
		}
		
		System.out.print(concat);
		
	}

}
