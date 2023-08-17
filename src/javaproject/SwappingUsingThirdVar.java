package javaproject;
import java.util.*;
public class SwappingUsingThirdVar {
	
	public static void main(String[] args) {
		
		int a ,b, temp;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = in.nextInt();
		
		System.out.println("Enter B:");
		b = in.nextInt();
		
		System.out.println("Befor Swap:");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Befor Swap:");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		
	}
}
