package abstract_method;
abstract class Bank{
	abstract int getROI();
}
class TMB extends Bank{
	int getROI() {
		return 7;
	}
}
class AXIS extends Bank{
	int getROI() {
		return 20;
	}
}
public class BankInterest {
	public static void main(String[] args) {
		Bank b;
		b=new TMB();
		System.out.println("ROI in TMB is "+b.getROI()+"%");
		b=new AXIS();
		System.out.println("ROI in AXIS is "+b.getROI()+"%");
	}
}
