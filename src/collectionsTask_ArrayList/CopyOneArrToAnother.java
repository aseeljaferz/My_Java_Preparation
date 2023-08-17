package collectionsTask_ArrayList;
import java.util.*;
public class CopyOneArrToAnother {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String l1[] = {"1","2","3","4"};
		String l2[] = {"A", "B", "C", "D", };
		List<String> list1 = new ArrayList<>();
		for(int i=0;i<l1.length;i++) {
			list1.add(l1[i]);
		}
		List<String> list2 = new ArrayList<>();
		for(int i=0;i<l1.length;i++) {
			list2.add(l2[i]);
		}
		System.out.println(list1);
		System.out.println(list2);
		System.out.println("Copy List to List2,");
		Collections.copy(list1, list2);
		System.out.println("After copy:");
		System.out.println(list1);
		System.out.println(list2);
	}
}
