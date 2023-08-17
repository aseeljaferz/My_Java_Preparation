package single_inheritance;
import java.util.Scanner;
class SortArr{
	protected int a[];
	public SortArr(int a[]) {
		this.a=a;
	}
}

class SortSub extends SortArr{
	public SortSub(int a[]) {
		super(a);
	}
	public void sortSub() {
		int n=a.length;
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
public class SortSingleInheritance {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		SortSub obj = new SortSub(a);
		obj.sortSub();
	}

}
