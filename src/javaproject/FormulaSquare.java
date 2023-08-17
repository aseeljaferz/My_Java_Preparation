package javaproject;
import java.util.*;
import java.lang.Math;
public class FormulaSquare {
	
	public static void main(String[] args) {
		double a, area, peri;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter A:");
		a = in.nextDouble();
		area = Math.pow(2,a);
		peri = 4*a;
		System.out.println("Area of circle: "+area);
		System.out.println("Perimeter of circle: "+peri);
	}

}
