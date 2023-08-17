package collectionsTask_LinkedList;
import java.util.*;
public class IterateThroughEle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new LinkedList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println("Which idx to stat iterate from: ");
		int idx = in.nextInt();
		for(int i=idx-1;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
