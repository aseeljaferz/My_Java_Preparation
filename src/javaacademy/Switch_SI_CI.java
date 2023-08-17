package javaacademy;
import java.util.*;
public class Switch_SI_CI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Choose bw S and C");
		char calc = in.next().charAt(0);
		
		switch(calc) {
		
		case 's':
			System.out.println("Principal Amount :");
			double p = in.nextDouble();
			System.out.println("Rate of Interest :");
			int r = in.nextInt();
			System.out.println("Time Duration :");
			int t = in.nextInt();
			double si = (p*(t*r))/100;
			System.out.println("Simple Interest : "+si);
			break;
			
		case 'c':
			System.out.println("Principal Amount :");
			p = in.nextDouble();
			System.out.println("Rate of Interest :");
			r = in.nextInt();
			System.out.println("Time Duration :");
			t = in.nextInt();
			double ci = p*((1+(r/100))*t-1);
			System.out.println("Simple Interest : "+ci);
			break;
			
		}
		
	
	}

}
