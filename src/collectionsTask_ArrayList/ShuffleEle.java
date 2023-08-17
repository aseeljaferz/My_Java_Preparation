package collectionsTask_ArrayList;
import java.util.*;
public class ShuffleEle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new ArrayList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println("Before Suffle");
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println("After Suffle");
		System.out.println(list);
	}
}
