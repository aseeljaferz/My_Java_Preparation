//no duplicates will be allowed

package BetterTomorrow_HashSet;
import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		
		int a[]= {1,1,2,4,3,5,5};
		Set<Integer> demo = new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			demo.add(a[i]);
		}
		
		for(Integer x : demo) {  
			System.out.print(x +" ");     //only supports enhanced for loop
		}

	}

}
