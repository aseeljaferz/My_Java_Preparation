package abstract_method;

abstract class Rbi {
	public Rbi() {
		System.out.println("rbi created");
	}

	public abstract void roi();

	public void display() {
		System.out.println("Head of bank");

	}

}

class Pnb extends Rbi {

	public void roi() {
		System.out.println("9% intrest");
	}
}

class SBI extends Rbi {
	public void roi() {
		System.out.println("10% intrest");
	}
}

public class TestAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rbi t = new SBI();
		t.roi();
		Rbi t1 = new Pnb();
		t1.roi();

//		Rbi t;
//		t = new SBI();
//		t.roi();
//		t = new Pnb();
//		t.roi();
//		t.display();

	}

}

