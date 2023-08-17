package javaproject;
import java.util.*;
public class IfStatement {

	public static void main(String[] args) {
		
		int a, b;
		Scanner in = new Scanner( System.in );
		
		System.out.println( "Enter A:" );
		a = in.nextInt();
		
		System.out.println( "Enter B:" );
		b = in.nextInt();
		
		if ( a > b )
		{
			System.out.println( a+" is biggest" );
		}
		else
		{
			System.out.println( b+" is Greatest" );
		}

	}

}
