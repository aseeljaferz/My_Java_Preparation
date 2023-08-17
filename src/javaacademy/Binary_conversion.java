package javaacademy;
import java.util.*;
public class Binary_conversion {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int val = n;
		int bin = 0;
		String concat = "";
		while(n!=0) {
			bin = n%2;
			concat = bin + concat;
			n = n/2;
		}
		Integer.parseInt(concat);
		System.out.println("Decimal = "+ val);
		System.out.println("Binary = "+ concat);
	}
}
