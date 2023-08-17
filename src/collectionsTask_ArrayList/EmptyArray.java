package collectionsTask_ArrayList;
import java.util.*;
public class EmptyArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new ArrayList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println(list);
		list.removeAll(list);
		System.out.println("After removing all the elements: "+list);
	}
}
