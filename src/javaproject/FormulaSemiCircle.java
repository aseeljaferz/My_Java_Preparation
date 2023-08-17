package javaproject;
import java.util.*;
public class FormulaSemiCircle {

	public static void main(String[] args) {
		
		double pi=3.14, r, area, peri;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Radius:");
		r = in.nextDouble();
		
		area =(0.5)*(pi*(r*r));
		peri = (pi*r)+(2*r);
		
		System.out.println("Area of SemiCircle: "+area);
		System.out.println("Perimeter of SemiCircle: "+peri);

	}

}
