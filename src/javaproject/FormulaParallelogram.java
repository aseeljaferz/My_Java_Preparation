package javaproject;
import java.util.*;
public class FormulaParallelogram {

	public static void main(String[] args) {
		
		double a, b, h, area, peri;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = in.nextDouble();
		
		System.out.println("Enter B:");
		b = in.nextDouble();
		
		System.out.println("Enter Height:");
		h = in.nextDouble();
		
		area = a*h;
		peri = 2*(a+b);
		
		System.out.println("Area of parallelogram: "+area);
		System.out.println("Perimeter of parallelogram: "+peri);

	}

}
