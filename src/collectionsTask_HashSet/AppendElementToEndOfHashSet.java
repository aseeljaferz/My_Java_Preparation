package collectionsTask_HashSet;
import java.util.*;
public class AppendElementToEndOfHashSet {
	public static void main(String[] args) {
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		Set<String> list = new HashSet<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println(list);
	}
}
