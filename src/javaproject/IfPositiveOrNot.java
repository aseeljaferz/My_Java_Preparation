package javaproject;
import java.util.*;
public class IfPositiveOrNot {

	public static void main(String[] args) {
		
		int a;
		Scanner in = new Scanner( System.in );
		
		System.out.println( "Enter a value:" );
		a = in.nextInt();
		
		if ( a>=1 )
		{
			System.out.println( a+" is a positive integer" );
		}
		
		else if( a<=-1 )
		{
			System.out.println( a+" is a negative integer" );
		}
		else
		{
			System.out.println( a+" is neither positive nor negative integer" );
		}
		
	}

}
