package collectionsTask_ArrayList;
import java.util.*;
public class ReplaceSecondElement {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green"};
		List<String> list = new ArrayList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println(list);
		System.out.print("Enter the element you want to relace with: ");
		String color = in.next();
		list.set(1, color);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
