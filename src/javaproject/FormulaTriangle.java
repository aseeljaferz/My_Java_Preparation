package javaproject;
import java.util.*;
public class FormulaTriangle {

	public static void main(String[] args) {
		
		double a, b, c, br, h, s, x, area, peri;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = in.nextDouble();
		
		System.out.println("Enter B:");
		b = in.nextDouble();
		
		System.out.println("Enter C:");
		c = in.nextDouble();
		
		System.out.println("Enter Breadth:");
		br = in.nextDouble();
		
		System.out.println("Enter Height:");
		h = in.nextDouble();
		
		System.out.println("Enter S:");
		s = in.nextDouble();
		
		area =Math.sqrt( s*((s-a)*(s-b)*(s-c)));
		
		
		peri = a*b*c;
		
		System.out.println("Area of Triangle: "+ area);
		
		System.out.println("Perimeter of Triangle: "+ peri);
	}
	
}
