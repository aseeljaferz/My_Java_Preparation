package BetterTomorrow_tasks;

import java.util.*;

public class Intersection {

	public static void main(String[] args) {
		
		int a1[] = {7,1,5,2,3,2,6}; 
		int a2[] = {8,6,20,7,3};
		
		int m = a1.length;
		int n = a2.length;

//		Arrays.sort(a1);
//		Arrays.sort(a2);
//		
//		int i=0, j=0;
//		
//		while( i < m  && j < n) {
//			if(a1[i] < a2[j]) {
//				i++;
//			}
//			else if(a2[j]<a1[i]) {
//				j++;
//			}
//			else {
//				System.out.print(a2[j]+" ");
//				j++;
//				i++;
//			}
//		}
		
		
		
		//or
		
		
		
		Set<Integer> s1 = new HashSet<>();
		for(int i=0; i<m; i++) {
			s1.add(a1[i]);
		}
		
		Set<Integer> s2 = new HashSet<>();
		for(int i=0; i< n; i++) {
			s2.add(a2[i]);
		}
		
		s1.retainAll(s2);               //intersection
		System.out.println(s1+" ");
		
		s1.addAll(s2);               //union
		System.out.print(s1+" ");

	}

}
