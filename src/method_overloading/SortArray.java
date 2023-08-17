package method_overloading;
import java.util.*;

class ArraySort{
	public void  sortArr(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					a[i] = (a[i]+a[j])-(a[j]=a[i]);   
				}
			}
		}
		System.out.println("Ascending order : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public void sortArr(double b[]) {
		for(int i=0;i<b.length-1;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]<b[j]) {
					b[i] = (b[i]+b[j])-(b[j]=b[i]);
				}
			}
		}
		System.out.println("Descending order : ");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
}

public class SortArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a[] = {54,65,96,79,50,31,23};
		double b[] = {54.0,65.0,96.0,79.0,50.0,31.0,23.0};
		ArraySort obj = new ArraySort();
		obj.sortArr(a);
		System.out.println();
		obj.sortArr(b);

	}

}
