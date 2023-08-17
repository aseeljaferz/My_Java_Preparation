package collectionsTask_HashSet;
import java.util.*;
public class CheckEmpty {
	public static void main(String[] args) {
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new LinkedList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println(list);
		System.out.println("Is the array empty: "+list.isEmpty());
		System.out.print("After removing all the element: ");
		list.removeAll(list);
		System.out.println(list);
		System.out.println("Is the array empty: "+list.isEmpty());
	}
}
