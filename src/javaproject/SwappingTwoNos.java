package javaproject;
import java.util.*;
public class SwappingTwoNos {

	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = in.nextInt();
		System.out.println("Enter B:");
		b = in.nextInt();
		
		System.out.println("Befor Swap:");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swap:");
		System.out.println("A = "+a);
		System.out.println("B = "+b);

	}

}
