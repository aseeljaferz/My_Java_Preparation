package javaproject;
import java.util.*;
public class AgeValidorNot {

	public static void main(String[] args) {
		
		int age;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		age = in.nextInt();
		
		if ( age>=18 )
		{
			System.out.println("Eligible");
		}
		if ( age<18 )
		{
			System.out.println("Not Eligible");
		}
		
	}

}
