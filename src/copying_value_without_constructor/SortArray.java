package copying_value_without_constructor;

class SortArr{
	int a[];
	public SortArr(int a[]) {
		this.a=a;
	}
	public SortArr() {
	}
	public void arraysort() {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					a[i]=(a[i]+a[j])-(a[j]=a[i]);
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
}

public class SortArray {
	public static void main(String[] args) {
		int a[]= {5,5,6,9,8,7,2,3,45,4,5,6};
		SortArr obj1 = new SortArr(a);
		obj1.arraysort();
		System.out.println();
		SortArr obj2 = new SortArr();
		obj2.a=obj1.a;
		obj2.arraysort();
	}
}
