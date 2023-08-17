package abstract_method;
import java.util.*;
abstract class BillCalculator{
	BillCalculator(){
		System.out.println("Electricity Calculator");
	}
	abstract void calc(int units);
}
class TamilNadu extends BillCalculator{
	void calc(int units) {
		double amt=0;
		if(units <= 100) {
			amt = units*4.80;
		}
		else if(units>=101 && units<=200){
			amt = 100*4.80+(units-100)*5.80;
		}
		else if(units>200) {
			amt = 100*4.80+200+5.80+(units-200)*6.50;
		}
		 System.out.println("The electricity bill for " +units+ " is : ₹" + amt);   
	}
}
class Kerala extends BillCalculator{
	void calc(int units) {
		double amt=0;
		if(units <= 300) {
			amt = units*6.50;
		}
		else if(units>=300 && units<=500){
			amt = 300*6.50+(units-300)*7.60;
		}
		else if(units>500) {
			amt = 300*6.50+500*7.60+(units-500)*8.70;
		}
		 System.out.println("The electricity bill for " +units+ " is : ₹" + amt);   
	}
}
public class ElectricityBill {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int units = in.nextInt();
		BillCalculator bill;
		bill = new TamilNadu();
		bill.calc(units);
		bill = new Kerala();
		bill.calc(units);
	}
}
