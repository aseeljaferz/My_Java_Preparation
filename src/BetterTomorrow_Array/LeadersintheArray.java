//Rightmost is always leader and an ele is a leader if it is greater than all the elements to its right side

package BetterTomorrow_Array;
import java.util.*;
public class LeadersintheArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<a.length;i++) {
			a[i] = in.nextInt();
		}
		
		int max_right = a[n-1];
		
		System.out.print(max_right + " ");
		
		for(int i=n-2; i>=0; i--) {
			if(max_right < a[i]) {
				max_right = a[i];
				System.out.print(max_right + " ");
			}
		}

	}

}

//24568
//8
