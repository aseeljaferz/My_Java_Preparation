package javaproject;
import java.util.*;
public class TestOperation {

	public static void main(String[] args) {
		int a, b, sub, mul, div, mod;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter A:");
		a = in.nextInt();
		System.out.println("Enter B:");
		b = in.nextInt();
		sub = a-b;
		mul = a*b;
		div = a/b;
		mod = a%b;
		System.out.println("subtraction: "+sub+" Multiplication: "+mul+" Division: "+div+" Modulus: "+mod);
	}

}
