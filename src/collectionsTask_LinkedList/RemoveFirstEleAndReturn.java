package collectionsTask_LinkedList;
import java.util.*;
public class RemoveFirstEleAndReturn {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		LinkedList<String> list = new LinkedList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println(list);
		System.out.println("Removed ele: "+list.pop());
		System.out.println("List after pop: "+list);
	}
}
