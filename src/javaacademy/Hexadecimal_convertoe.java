package javaacademy;
import java.util.*;
public class Hexadecimal_convertoe {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int val = n;
		int hexa = 0;
		String concat = "";
		
		while ( n!=0 ) {
			hexa = n%16;
			
			if( hexa > 9 ) {
				concat = (char)(55+hexa) + concat;
			}
			else {
				concat = hexa + concat;
			}
			
			n = n/16;
			
		}
		System.out.println("Decimal = "+ val);
		System.out.println("Hexa Decimal = "+ concat);
		
	}

}
