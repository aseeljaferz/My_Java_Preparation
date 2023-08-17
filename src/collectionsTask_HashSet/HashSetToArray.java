package collectionsTask_HashSet;
import java.util.*;
public class HashSetToArray {
	public static void main(String[] args) {
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new LinkedList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println("Hash Set: "+list);
		String[] color = new String[list.size()];
		list.toArray(color);
		for(String e : color) {
			System.out.println(e);
		}
	}
}
