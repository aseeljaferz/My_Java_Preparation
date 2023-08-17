package javaproject;
import java.util.*;
public class NestedIfTaxPurchasing {

	public static void main(String[] args) {
		
		double amt,taxpercent,tax;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Amount:");
		amt = in.nextDouble();
		
		if(amt>=0) {
			if(amt<10000) {
				taxpercent = 0;
				tax = taxpercent*amt/100;
				System.out.println("Tax percentage= = "+taxpercent+"%");
				System.out.println("Tax for purchasing= "+tax);
			}
			else if(amt>=10000) {
				if(amt<20000) {
					taxpercent = 10;
					tax = taxpercent*amt/100;
					System.out.println("Tax percentage= = "+taxpercent+"%");
					System.out.println("Tax for purchasing= "+tax);
				}
				else if(amt>=20000) {
					taxpercent = 20;
					tax = taxpercent*amt/100;
					System.out.println("Tax percentage= = "+taxpercent+"%");
					System.out.println("Tax for purchasing= "+tax);
				}
			}
		}

	}

}
