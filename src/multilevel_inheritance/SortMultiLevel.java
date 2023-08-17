package multilevel_inheritance;
import java.util.*;

class QuickSort{
	protected int a[],n;
	public QuickSort(int a[]) {
		this.a=a;
	}
}
class SubClass1 extends QuickSort{
	public SubClass1(int a[]) {
		super(a);
		this.n=a.length;
	}
}
class SubClass2 extends SubClass1{
	public SubClass2(int a[]) {
		super(a);
	}
	public void subSort() {
		quicksort(a, 0, n-1);
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
	public void quicksort(int a[], int low, int high) {
		if(low<high) {
			int pidx = partition(a, low, high);
			quicksort(a, low, pidx-1);
			quicksort(a, pidx+1, high);
		}
	}
	public int partition(int a[], int low, int high) {
		int pivot = a[high];
		int i=low-1;
		for(int j=low;j<high;j++) {
			if(a[j]<pivot) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		i++;
		int temp = a[i];
		a[i]=a[high];
		a[high]=temp;
		return i;
	}
}

public class SortMultiLevel {
	public static void main(String[] args) {
		int a[] = {4,7,2,3,9,0,6};
		SubClass2 obj = new SubClass2(a);
		obj.subSort();
	}
}
