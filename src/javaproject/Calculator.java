package javaproject;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		
		double a, b ,add, sub, mul, div, mod;
		String operator;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter value for A:");
		a = in.nextDouble();
		
		System.out.println("Enter value for B:");
		b = in.nextDouble();
		
		System.out.println("What operation do you want to perform:");
		operator = in.next();
		char ch = operator.charAt(0);
		
		if ( ch == '+' )
		{
			add = a+b;
			System.out.println("Addition : "+add);	
		}
		else if( ch == '-' )
		{
			sub = a-b;
			System.out.println("Subtraction : "+sub);
		}
		else if( ch == '*' )
		{
			mul = a*b;
			System.out.println("Miltiplication : "+mul);
		}
		else if( ch == '/' )
		{
			div = a/b;
			System.out.println("Division : "+div);
		}
		else if( ch == '%' )
		{
			mod = a%b;
			System.out.println("Modulus : "+mod);
		}
	}

}
