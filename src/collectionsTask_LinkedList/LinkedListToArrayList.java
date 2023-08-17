package collectionsTask_LinkedList;
import java.util.*;
public class LinkedListToArrayList {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		LinkedList<String> list = new LinkedList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println("LinkedList: "+list);
		ArrayList<String> color=new ArrayList<>();
		for(String clr : list) {
			color.add(clr);
		}
		System.out.println("ArrayList"+color);
		
		//-------------------------(or)-------------------------------------------------
		
//		ArrayList<String> color=new ArrayList<>(list);
//		System.out.println("ArrayList"+color);
	}
}
