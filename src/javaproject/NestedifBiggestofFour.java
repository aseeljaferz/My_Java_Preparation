package javaproject;
import java.util.*;
public class NestedifBiggestofFour {

	public static void main(String[] args) {
		
		int a,b,c,d;
		Scanner in = new Scanner(System.in);
		System.out.println("A:");
		a = in.nextInt();
		System.out.println("B:");
		b = in.nextInt();
		System.out.println("C:");
		c = in.nextInt();
		System.out.println("D:");
		d = in.nextInt();
		if (a>b) {
			if (a>c) {
				if (a>d) {
					System.out.println(a+" is biggest");
				}
				else {
					System.out.println(d+" is biggest");
				}
			}
		}
		else if (b>c) {
			if (b>d) {
				System.out.println(b+" is biggest");
			}
			else {
				System.out.println(d+" is biggest");
			}
		}
		else if (c>d) {
			System.out.println(c+" is biggest");
		}
		else {
			System.out.println(d+" is biggest");
		}
	}

}
