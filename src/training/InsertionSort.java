package training;
import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		int n,i,j,temp=0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int a[]=new int [n];
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		for(i=1;i<n;i++) {
			j=i-1;
			int key=a[i];
			while(j>=0 && key<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}

	}

}
