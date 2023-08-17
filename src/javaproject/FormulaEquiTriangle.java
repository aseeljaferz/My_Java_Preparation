package javaproject;
import java.util.*;
public class FormulaEquiTriangle {

	public static void main(String[] args) {
		
		double a, h, x, area, peri;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter A:");
		a = in.nextDouble();
		
		System.out.println("Enter Height:");
		h = in.nextDouble();
		
		area = (Math.sqrt(3)/4)*(Math.sqrt(a));
		peri = 3*a;
		
		System.out.println("Area of the Equi Trianglr: "+area);
		System.out.println("Perimeter of the Equi Trianglr: "+peri);
		
	}

}
