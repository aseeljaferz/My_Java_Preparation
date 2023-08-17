package BetterTomorrow_tasks;
import java.util.*;
public class MergetwoSortedArray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		List<Integer> a3 = new ArrayList<>();
		
		System.out.println("Array 1 size : ");
		int n1 = in.nextInt();
		System.out.println("Array 2 size : ");
		int n2 = in.nextInt();
		
		int a1[] = new int[n1];
		System.out.println("Enter value for Array 1 : ");
		for(int i=0;i<a1.length;i++) {
			a1[i] = in.nextInt();
		}
		
		int a2[] = new int[n2];
		System.out.println("Enter value for Array 2 : ");
		for(int i=0;i<a2.length;i++) {
			a2[i] = in.nextInt();
		}
		
		for(int i=0; i<a1.length; i++) {
			a3.add(a1[i]);
		}
		for(int i=0; i<a2.length; i++) {
			a3.add(a2[i]);
		}
		System.out.println("Merged array");
		
		Collections.sort(a3);
		
		System.out.println(a3);
		
	}

}
