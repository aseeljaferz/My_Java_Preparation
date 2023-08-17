package collectionsTask_ArrayList;
import java.util.*;
public class RemoveThirdEle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new ArrayList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println(list);
		list.remove(2);
		System.out.println("Afetr removing third ele :");
		System.out.println(list);
	}
}
