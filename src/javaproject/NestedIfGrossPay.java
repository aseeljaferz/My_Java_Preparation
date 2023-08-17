package javaproject;
import java.util.*;
public class NestedIfGrossPay {

	public static void main(String[] args) {
		
		double basic,hra,da,gross;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Basic Salary:");
		basic = in.nextDouble();
		
		if(basic>0) {
			if(basic<=10000) {
				hra = 20*basic/100;
				da = 80*basic/100;
				gross = hra + basic + da; 
				System.out.println("HRA1= "+hra);
				System.out.println("DA1= "+da);
				System.out.println("Gross Pay= "+gross);
			}
			else if(basic>10000){
				if(basic<=20000) {
					hra = 25*basic/100;
					da = 90*basic/100;
					gross = hra + basic + da; 
					System.out.println("HRA2= "+hra);
					System.out.println("DA2= "+da);
					System.out.println("Gross Pay= "+gross);
				}
				else if(basic>20000){
					hra = 30*basic/100;
					da = 95*basic/100;
					gross = hra + basic + da; 
					System.out.println("HRA3= "+hra);
					System.out.println("DA3= "+da);
					System.out.println("Gross Pay= "+gross);
				}
			}
		}
		
	}

}
