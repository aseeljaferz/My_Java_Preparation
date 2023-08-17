package javaacademy;
import java.util.*;
public class BinarytoHexadecimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);   
		int binary = in.nextInt();
		int rem=0, temp;
		int decimal=0;
		int i=0;
		while( binary!=0 ) {
			temp = binary%10;
			decimal += temp*(Math.pow(2, i));
			i++;
			binary/=10;
		}
		int n= decimal;
		String concat = "";
		int hexa=0;
		while( n!=0 ) {
			hexa = n%16;
			if(hexa>9) {
				concat = (char)(55+hexa) + concat;
			}
			else {
				concat = hexa + concat;
			}
			n = n/16;
		}
		System.out.print(concat);
	}

}
