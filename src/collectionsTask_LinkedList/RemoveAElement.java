package collectionsTask_LinkedList;
import java.util.*;
public class RemoveAElement {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new LinkedList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println(list);
		System.out.print("What color you want to remove: ");
		String color = in.next();
		int idx = list.indexOf(color);
		list.remove(idx);
		System.out.println(list);
	}
}
