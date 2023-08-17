package javaproject;
import java.util.*;
public class BiggestofThreeNos {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner in = new Scanner (System.in);
		
		System.out.println( "Enter A:" );
		a = in.nextInt();
		
		System.out.println( "Enter B:" );
		b = in.nextInt();
		
		System.out.println( "Enter C:" );
		c = in.nextInt();

		if ( (a>b) && (a>c) )
		{
			System.out.println( a+" is biggest " );
		}
		else if ( b>c )
		{
			System.out.println( b+" is biggest" );
		}
		else
		{
			System.out.println( c+" is biggest" );
		}
		
	}

}
