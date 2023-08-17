package BetterTomorrow_Array;
import java.util.*;
public class ZigZag {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = in.nextInt();
		}
		
		for(int i=0; i<n-1; i++) {
			int temp;
			if(i%2 == 0) {
				if(a[i] > a[i+1]) {
					temp = a[i+1];
					a[i+1] = a[i];
					a[i] = temp;
				}
			}
			else {
				if(a[i] < a[i+1]) {
					temp = a[i+1];
					a[i+1] = a[i];
					a[i] = temp;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		
	}

}
