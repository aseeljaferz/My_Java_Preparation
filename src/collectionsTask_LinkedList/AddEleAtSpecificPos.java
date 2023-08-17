package collectionsTask_LinkedList;
import java.util.*;
public class AddEleAtSpecificPos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new LinkedList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println(list);
		System.out.print("Color you want to add: ");
		String color = in.next();
		System.out.print("whic index you want to add: ");
		int idx = in.nextInt()-1;
		list.add(idx, color);
		System.out.println("After addin the element: ");
		System.out.println(list);
	}

}
