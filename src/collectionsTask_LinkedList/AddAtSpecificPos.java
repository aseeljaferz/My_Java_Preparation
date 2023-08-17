package collectionsTask_LinkedList;
import java.util.*;
public class AddAtSpecificPos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele1[] = {"Red", "Green", "Orange", "White", "Black"};
		String ele2[] = {"violet", "purple"};
		List<String> list = new LinkedList<>();
		for(int i=0;i<ele1.length;i++) {
			list.add(ele1[i]);
		}
		List<String> list1 = new LinkedList<>();
		for(int i=0;i<ele2.length;i++) {
			list1.add(ele2[i]);
		}
		System.out.println(list);
		System.out.println(list1);
		System.out.print("What idx you want to add all the ele: ");
		int idx = in.nextInt();
		list.addAll(idx,list1);
		System.out.println("After add ing all the ele: ");
		System.out.println(list);
	}
}
