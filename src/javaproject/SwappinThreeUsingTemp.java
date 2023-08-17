package javaproject;
import java.util.*;
public class SwappinThreeUsingTemp {

	public static void main(String[] args) {
		
		int a, b, c, temp;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = in.nextInt();
		
		System.out.println("Enter B:");
		b = in.nextInt();
		
		System.out.println("Enter C:");
		c = in.nextInt();
		
		System.out.println("Before Swapping:");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("C = "+c);
		
		temp = a;
		a = c;
		c = b;
		b = temp;
		
		System.out.println("After Swapping:");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("C = "+c);

	}

}
