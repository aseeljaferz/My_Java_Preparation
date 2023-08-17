package javaproject;
import java.util.*;
public class FormulaRectangle {

	public static void main(String[] args) {
		double a,b,c,area,peri;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter A:");
		a = in.nextDouble();
		System.out.println("Enter B:");
		b = in.nextDouble();
		area = a*b;
		c = a+b;
		peri = 2*c;
		System.out.println("Area of Rectangle: "+area);
		System.out.println("Perimeter of Rectangle: "+peri);
	}
	
}
