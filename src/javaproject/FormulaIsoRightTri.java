package javaproject;
import java.util.*;
public class FormulaIsoRightTri {

	public static void main(String[] args) {
		
		double a, d, area, peri;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = in.nextDouble();
		
		System.out.println("Enter Depth:");
		d = in.nextDouble();
		
		area = (0.5)*(a*a);
		peri = (2*a)+d;
		
		System.out.println("Area of the iso right tri: "+area);
		System.out.println("Perimeter of the iso right tri: "+peri);
		
	}

}
