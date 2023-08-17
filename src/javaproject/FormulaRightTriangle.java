package javaproject;
import java.util.*;
public class FormulaRightTriangle {
	
	public static void main(String[] args) {
		
		double br, h, d, area, peri;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Breadth:");
		br = in.nextDouble();
		
		System.out.println("Enter Height:");
		h = in.nextDouble();
		
		System.out.println("Enter Depth:");
		d = in.nextDouble();
		
		area = (0.5)*br*h;
		peri = br+h+d;
		
		System.out.println("Area of the Right Triangle: "+area);
		System.out.println("Perimeter of the Right Triangle: "+peri);
		
	}

}
