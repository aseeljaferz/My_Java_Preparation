package collectionsTask_LinkedList;
import java.util.*;
public class AddFirstAndLast {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		LinkedList<String> list = new LinkedList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println(list);
		list.addFirst("Purple");
		list.addLast("Violet");
		System.out.println("After add element to first and last position: ");
		System.out.println(list);
	}
}
