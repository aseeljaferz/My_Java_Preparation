package interface_method;
interface Bank{
	float ROI();
}
class SBI implements Bank{
	public float ROI(){
		return 12.5f;
	}
}
class TMB implements Bank{
	public float ROI(){
		return 18.5f;
	}
}
public class BankPrg {
	public static void main(String[] args) {
		Bank b;
		b=new SBI();
		System.out.println("ROI of SBI bank is = "+b.ROI()+"%");
		b=new TMB();
		System.out.println("ROI of TMB bank is = "+b.ROI()+"%");
	}
}
