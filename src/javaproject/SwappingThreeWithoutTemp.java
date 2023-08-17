package javaproject;
import java.util.*;
public class SwappingThreeWithoutTemp {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = in.nextInt();
		
		System.out.println("Enter B:");
		b = in.nextInt();
		
		System.out.println("Enter C:");
		c = in.nextInt();
		
		System.out.println("Before swapping:");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("C = "+c);
		
		a = a+b+c;
		b = a-(b+c);
		c = a-(b+c);
		a = a-(b+c);
		
		System.out.println("after swapping:");
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("C = "+c);

	}

}
