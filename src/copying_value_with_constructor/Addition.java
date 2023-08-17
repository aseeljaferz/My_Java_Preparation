package copying_value_with_constructor;
import java.util.*;

class TestAdd{
	int a,b,d;
	public TestAdd(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public TestAdd(TestAdd s) {
		this.a=s.a;
		this.b=s.b;
	}
	public void add() {
		System.out.println(d=a+b);
	}
}

public class Addition {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		TestAdd obj1 = new TestAdd(a,b);
		obj1.add();
		TestAdd obj2 = new TestAdd(obj1);
		obj2.add();
	}
}



