package constructor_overloading;

import java.util.*;

class AddArray {
	int a[];
	double b[];

	public AddArray(int a[]) {
		this.a = a;
	}

	public AddArray(double b[]) {
		this.b = b;
	}

	int sum1 = 0;
	double sum2 = 0.0;

	public void sumArray() {
		if (a != null) {
			for (int i = 0; i < a.length; i++) {
				sum1 += a[i];
			}
			System.out.println(sum1);
		}
		if (b != null) {
			for (int i = 0; i < b.length; i++) {
				sum2 += b[i];
			}
			System.out.println(sum2);
		}
	}
}

public class ArrySum {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		AddArray obj1 = new AddArray(a);
		obj1.sumArray();
		double b[] = { 2.0, 4.0, 6.0, 8.0, 10.0 };
		AddArray obj2 = new AddArray(b);
		obj2.sumArray();

	}

}
