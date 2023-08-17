package collectionsTask_HashSet;
import java.util.*;
public class EmptyanHashSet {
	public static void main(String[] args) {
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new LinkedList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println("Original Set: "+list);
		list.removeAll(list);
		System.out.println("After removing all the element: "+list);
	}
}
