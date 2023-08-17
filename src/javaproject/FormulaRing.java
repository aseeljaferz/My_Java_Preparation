package javaproject;
import java.util.*;
public class FormulaRing {

	public static void main(String[] args) {
		
		double pi=3.14, r, R, area;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Radius:");
		r = in.nextDouble();
		System.out.println("Enter R:");
		R = in.nextDouble();
		
		area = pi*((R*R)-(r*r));
		
		System.out.println("Area of Circle: "+area);


	}

}
