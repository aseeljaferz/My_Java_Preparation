package constructor_overloading;

import java.util.Scanner;

class Add {
	int a,b,c,d;
	public Add(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public Add(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void result() {
		System.out.println(d=a+b+c);
	}
}

public class Addition {
	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();

		Add obj1 = new Add(a, b);
		obj1.result();
		Add obj2 = new Add(a, b, c);
		obj2.result();
	}
}
