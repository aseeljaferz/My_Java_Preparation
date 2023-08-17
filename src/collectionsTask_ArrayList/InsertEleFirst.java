package collectionsTask_ArrayList;
import java.util.*;
public class InsertEleFirst {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new ArrayList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println("Before insert : ");
		System.out.println(list);
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			String color = in.next();
			list.add(0, color);
		}
		System.out.println("After insert : ");
		System.out.println(list);
	}
}

