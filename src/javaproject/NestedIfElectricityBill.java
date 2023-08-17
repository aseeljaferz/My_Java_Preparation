package javaproject;
import java.util.*;
public class NestedIfElectricityBill {

	public static void main(String[] args) {
		
		double unit,charge,bill;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Units:");
		unit = in.nextInt();
		
		if(unit>=0) {
			if(unit<=199) {
				charge = 1.20;
				bill = unit*charge;
				if(bill>=100) {
					System.out.printf("Total Bill= "+bill);
				}
				else {
					System.out.println("Bill below 100");
				}
			}
			else if(unit>=200 && unit<400) {
				charge = 1.50;
				bill = (200*1.20)+(unit-200)+charge;
				System.out.printf("Charge= ",charge);
				if(bill > 400) {
					bill = 15*bill/100;
					System.out.printf("Total Bill= ",bill);
				}
			}
			else if(unit>=400 && unit<600) {
				charge = 1.80;
				bill = (200*1.20)+(200*1.50)+(unit-400)*charge;
				System.out.printf("Charge= ",charge);
				if(bill > 400) {
					bill = 15*bill/100;
					System.out.printf("Total Bill= ",bill);
				}
			}
			else if(unit>=600 ) {
				charge = 1.80;
				bill = (200*1.20)+(200*1.50)+(200*1.80)+(unit-600)*charge;
				if(bill > 400) {
					bill = 15*bill/100;
					System.out.printf("Total Bill= ",bill);
				}
			}
			
		}

	}

}
