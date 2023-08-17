package single_inheritance;
import java.util.*;
class Add{
	protected int a, b,d;
	public Add(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void addPrg1() {
		int c = a+b;
		System.out.println(c);
	}
}
class Sub extends Add{
	public Sub(int a, int b,int d) {
		super(a,b);
		this.d=d;
	}
	public void addPrg2() {
		int c = a+b+d;
		System.out.println(c);
	}
}
public class Addition {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		Sub obj = new Sub(a,b,67);
		obj.addPrg1();
		obj.addPrg2();
	}

}
