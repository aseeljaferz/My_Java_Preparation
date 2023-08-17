package collectionsTask_HashSet;
import java.util.*;
public class IfContainRetain {

	public static void main(String[] args) {
		String ele1[] = {"Red", "Green", "Orange", "White", "Black"};
		String ele2[] = {"Green", "Black"};
		List<String> list = new LinkedList<>();
		for(int i=0;i<ele1.length;i++) {
			list.add(ele1[i]);
		}
		List<String> list1 = new LinkedList<>();
		for(int i=0;i<ele2.length;i++) {
			list1.add(ele2[i]);
		}
		Set<String> color = new HashSet<>();
		for(String e : list) {
			if(list1.contains(e)) {
				color.add(e);
			}
		}
		System.out.println(color);
	}

}
