package javaproject;
import java.util.*;
public class IfEvenOdd {

	public static void main(String[] args) {
		
		int a;
		Scanner in = new Scanner( System.in );
		
		System.out.println( "Enter a Value:" );
		a = in.nextInt();
		
		if ( a%2==0 )
		{
			System.out.println( a+" is an even number" );
		}
		else
		{
			System.out.println( a+" is an odd number" );
		}
	}

}
