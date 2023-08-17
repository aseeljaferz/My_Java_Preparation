package collectionsTask_ArrayList;
import java.util.*;
public class ExtractAPortion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new ArrayList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.print("Original list: ");
		System.out.println(list);
		System.out.print("until what index you want: ");
		int colorIDX = in.nextInt();
		List<String> newStr = list.subList(0, colorIDX);
		System.out.println("List of first "+colorIDX+" elements : "+newStr);
	}
}
