//find the pairs which equals the sum 

package BetterTomorrow_Array;
import java.util.*;
public class SumFindNumofPairs {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = in.nextInt();
		int a[] = new int[n];
		int count =0;
		
		for(int i=0; i<a.length;i++) {
			a[i] = in.nextInt();
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if((a[i]+a[j]) == sum) {
					System.out.println("("+a[i]+","+a[j]+")");
					count++;
				}
			}
		}
		
		System.out.println(count);

	}

}
