package collectionsTask_LinkedList;
import java.util.*;
public class IterateReverseOrder {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new LinkedList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
	}
}
