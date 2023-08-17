package javaproject;
import java.util.*;
public class FormulaTrapezium {

	public static void main(String[] args) {
		
		double bottom, top, left, right, h, area, peri;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Bottom:");
		bottom = in.nextDouble();
		
		System.out.println("Enter Top:");
		top = in.nextDouble();
		
		System.out.println("Enter Left:");
		left = in.nextDouble();
		
		System.out.println("Enter Right:");
		right = in.nextDouble();
		
		System.out.println("Enter Height:");
		h = in.nextDouble();
		
		area = (0.5)*(h*(bottom+top));
		peri = top+bottom+left+right;
		
		System.out.println("Area of the iso Trapezium: "+area);
		System.out.println("Perimeter of the Trapezium: "+peri);

	}

}
