package javaproject;
import java.util.*;
public class StudentMarkList {

	public static void main(String[] args) {
		
		double english, tamil, maths, physics, chemistry, tot, avg;
		String name, std, dept;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		name = in.next();
		
		System.out.println("Enter your Department:");
		 dept = in.next();
		
		System.out.println("Enter your Class and Section:");
		std = in.next();
		
		System.out.println("Enter English Mark:");
		english = in.nextInt();
		
		System.out.println("Enter Tamil Mark:");
		tamil = in.nextInt();
		
		System.out.println("Enter Maths Mark:");
		maths = in.nextInt();
		
		System.out.println("Enter Physics Mark:");
		physics = in.nextInt();
		
		System.out.println("Enter Chemistry Mark:");
		chemistry = in.nextInt();
		
		tot = english + tamil + maths + physics + chemistry;
		avg = ( english + tamil + maths + physics + chemistry )/5;
		
		System.out.println("------------------Student Mark list--------------------");
		System.out.println("Name : "+name);
		System.out.println("Department : "+dept);
		System.out.println("Class and Section : "+std);
		System.out.println(" ");
		System.out.println("English : "+english);
		System.out.println("Tamil : "+tamil);
		System.out.println("Maths : "+maths);
		System.out.println("Physics : "+physics);
		System.out.println("Chemistry : "+chemistry);
		System.out.println("Total = "+tot);
		System.out.println("Average = "+avg);
		
		
		
	}

}
