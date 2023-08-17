package BetterTomorrow_tasks;
import java.util.*;
public class Union {

	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<>();
		
		int a1[] = {7,1,5,2,3,2,6}; 
		int a2[] = {8,6,20,7,3};
//		
//		int m = a1.length;
//		int n = a2.length;
//		
//		Arrays.sort(a1);
//		Arrays.sort(a2);
//		
//		while( i< m  )
		
		//or
		
		for(int i=0;i<a1.length;i++) {
			s.add(a1[i]);
		}
		
		for(int i=0;i<a2.length;i++) {
			s.add(a2[i]);
		}
		
		System.out.println(s);
		
		for(Integer x : s) {
			System.out.print(x+" ");
		}
		

	}

	

}
