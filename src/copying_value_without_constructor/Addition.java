package copying_value_without_constructor;

import java.util.*;


class TestAdd{
	int a,b,d;
	public TestAdd(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public TestAdd() {
		
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
		TestAdd obj2 = new TestAdd();
		obj2.a=obj1.a;
		obj2.b=obj1.b;
		obj2.add();
	}
}
