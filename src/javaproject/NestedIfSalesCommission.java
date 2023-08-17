package javaproject;
import java.util.*;
public class NestedIfSalesCommission {

	public static void main(String[] args) {
		double sales, percent, commi;
		Scanner in = new Scanner(System.in);
		System.out.println("Sales:");
		sales = in.nextDouble();
		if (sales>=0) {
			if (sales<10000){
				percent = 0;
				commi = (percent/100)*sales;
				System.out.println("Commission Percent is  : "+percent);
				System.out.println("Commission : "+commi);
			}
			if(sales>=10000) {
				if( sales<20000 ) {
				percent = 5;
				commi = (percent/100)*sales;
				System.out.println("Commission Percent is  : "+percent);
				System.out.println("Commission : "+commi);
				}
				if(sales>=20000) {
					if( sales<50000 ) {
					percent = 10;
					commi = (percent/100)*sales;
					System.out.println("Commission Percent is  : "+percent);
					System.out.println("Commission : "+commi);
					}
					if(sales>=100000) {
						percent = 15;
						commi = ((percent/100)*sales)+500;
						System.out.println("Commission Percent is  : "+percent);
						System.out.println("Commission : "+commi);
					}
				}
			}
			
		}
		
	}

}
