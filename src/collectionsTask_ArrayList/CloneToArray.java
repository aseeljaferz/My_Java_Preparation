package collectionsTask_ArrayList;
import java.util.*;
public class CloneToArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new ArrayList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println(list);
		List<String> list1 = new ArrayList<>(list);
		System.out.println("List1: "+list1);
		List<String> list2 = new ArrayList<>();
		for(String color : list) {
			list2.add(color);
		}
		System.out.println("List2: "+list2);
	}
}
