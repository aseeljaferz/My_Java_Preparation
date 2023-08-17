package copying_value_without_constructor;

class ArrSumPrg{
	int a[];
	int sum=0;
	public ArrSumPrg(int a[]) {
		this.a=a;
	}
	public ArrSumPrg() {
		
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
		ArrSumPrg obj1 = new ArrSumPrg(a);
		obj1.addArray();
		ArrSumPrg obj2 = new ArrSumPrg();
		obj2.a=obj1.a;
		obj2.addArray();
	}
}
