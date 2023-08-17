package javaproject;
import java.util.*;
public class FormulaCircle {

	public static void main(String[] args) {
		
		double pi=3.14, r, area, peri;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Radius:");
		r = in.nextDouble();
		
		area = pi*(Math.pow(r,2));
		peri = 2*(pi*r);
		
		System.out.println("Area of Circle: "+area);
		System.out.println("Perimeter of Circle: "+peri);

	}

}
