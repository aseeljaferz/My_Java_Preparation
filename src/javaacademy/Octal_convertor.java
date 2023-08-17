package javaacademy;
import java.util.*;
public class Octal_convertor {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int val = n;
		int octal = 0;
		String concat = "";
		while( n!=0 ) {
			
			octal = n%8;
			concat = octal + concat;
			n /= 8;
			
		}
		Integer.parseInt(concat);
		System.out.println("Decimal = "+ val);
		System.out.println("Octal = "+ concat);
	}

}
