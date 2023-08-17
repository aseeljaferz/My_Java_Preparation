package javaproject;
import java.util.*;
public class SimpleCompoundInterest {

	public static void main(String[] args) {
		double p, n, r, si, ci;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Principle Amount:");
		p = in.nextDouble();
		
		System.out.println("Enter no of year:");
		n = in.nextDouble();
		
		System.out.println("Enter Rate:");
		r = in.nextDouble();
		
		si = (p*n*r)/100;
		ci = p*(Math.pow((1+r/100),n))-p;
		
		System.out.println("Simple interest: "+si);
		System.out.println("Compound interest: "+ci);
		
	}

}
