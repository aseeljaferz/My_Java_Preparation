package collectionsTask_ArrayList;
import java.util.*;
public class SearchEle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new ArrayList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println(list);
		System.out.print("Enter the ele to be searched :");
		String str = in.next();
		if(!list.contains(str)) {
			System.out.println("Element not found");
		}else {
			System.out.println("Found the element");
		}
	}
}
