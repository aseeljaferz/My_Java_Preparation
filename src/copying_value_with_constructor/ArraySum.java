package copying_value_with_constructor;
import java.util.*;

class ArrSum{
	int a[];
	int sum=0;
	public ArrSum(int a[]) {
		this.a=a;
	}
	public ArrSum(ArrSum s) {
		this.a=s.a;
	}
	public void addArray() {
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
}

public class ArraySum {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		ArrSum obj1 = new ArrSum(a);
		obj1.addArray();
		ArrSum obj2 = new ArrSum(obj1);
		obj2.addArray();
	}
}
