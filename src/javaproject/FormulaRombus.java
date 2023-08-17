package javaproject;
import java.util.*;
public class FormulaRombus {

	public static void main(String[] args) {
		
		double a, d1, d2, area, peri;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = in.nextDouble();
		
		System.out.println("Enter Depth 1:");
		d1 = in.nextDouble();
		
		System.out.println("Enter Depth 2:");
		d2 = in.nextDouble();
		
		area = (0.5)*(d1*d2);
		peri = 4*a;
		
		System.out.println("Area of the Rombus: "+area);
		System.out.println("Perimeter of the Rombus: "+peri);

	}

}
