package collectionsTask_HashSet;
import java.util.*;
public class NoOfEleinSet {
	public static void main(String[] args) {
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new LinkedList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println("Size of the Gash Set: "+list.size());
	}
}
