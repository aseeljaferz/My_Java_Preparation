package javaproject;
import java.util.*;
public class ThreeSidesFormTriangle {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner in = new Scanner ( System.in );
		
		System.out.println( "Enter the length of side A:" );
		a = in.nextInt();
		
		System.out.println( "Enter the length of side B:" );
		b = in.nextInt();
		
		System.out.println( "Enter the length of side c:" );
		c = in.nextInt();
		
		if ( (a+b)>c && (b+c)>a && (a+c)>b )
		{
			System.out.println("All the sides form a triangle");
		}
		else
		{
			System.out.println("All the sides doesn't form a triangle");
		}

	}

}
