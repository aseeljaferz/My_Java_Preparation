package javaproject;
import java.util.*;
public class RemainderWithoutModulo {

	public static void main(String[] args) {
		
		int a, b, c, d, rem;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = in.nextInt();
		
		System.out.println("Enter Devisor:");
		d = in.nextInt();
		
		b = a/d;
		c= d*b;
		rem = a-c;
		
		
		System.out.println("Remainder = "+rem);

	}

}
