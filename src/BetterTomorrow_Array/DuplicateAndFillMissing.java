//given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing elements.

package BetterTomorrow_Array;
import java.util.*;
public class DuplicateAndFillMissing {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<a.length-1;i++) {
			a[i] = in.nextInt();
		}
		
		int count = (n*(n+1))/2;
		
		for(int i=0;i<a.length;i++) {
			count = count - a[i];
		}
		
		System.out.println("The missing element is : "+count);
		
		
		
	}

}
