package javaproject;
import java.util.*;
public class BiggestofFour {

	public static void main(String[] args) {
		
		int a, b, c, d;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter value for A:");
		a = in.nextInt();
		
		System.out.println("Enter value for B:");
		b = in.nextInt();
		
		System.out.println("Enter value for C:");
		c = in.nextInt();
		
		System.out.println("Enter value for D:");
		d = in.nextInt();
		
		if ( a>b && a>c && a>d )
		{
			System.out.println( a+" is the biggest number" );
		}
		else if ( b>c && b>d )
		{
			System.out.println( b+" is the biggest number" );
		}
		else if ( c>d )
		{
			System.out.println( c+" is the biggest number" );
		}
		else
		{
			System.out.println( d+" is the biggest number" );
		}
		
	}

}
