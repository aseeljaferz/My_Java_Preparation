package collectionsTask_ArrayList;
import java.util.*;
public class CheckIsEmpty {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new ArrayList<>();
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
