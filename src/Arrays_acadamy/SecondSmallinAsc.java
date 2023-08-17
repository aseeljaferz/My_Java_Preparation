package Arrays_acadamy;

import java.util.*;

public class SecondSmallinAsc {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n;j++) {
				if(a[i]>a[j]) {
					a[i] = (a[i]+a[j])-(a[j]=a[i]);
				}
			}
		}
		
		System.out.print("Array in Ascending order = ");
		
		for(int i=0; i<n; i++) {
			System.out.print(a[i]);
		}
        System.out.println();
		System.out.print("Second smallest = " + a[1]);

	}

}
