package collectionsTask_HashSet;
import java.util.*;
public class CloneEle {
	public static void main(String[] args) {
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		Set<String> list = new HashSet<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println(list);
		Set<String> list1 = new HashSet<>();
		System.out.println("List1: "+list1);
		Set<String> list2 = new HashSet<>();
		for(String color : list) {
			list2.add(color);
		}
		System.out.println("List2: "+list2);
	}
}
