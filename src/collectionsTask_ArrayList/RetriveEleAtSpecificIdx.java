package collectionsTask_ArrayList;
import java.util.*;
public class RetriveEleAtSpecificIdx {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new ArrayList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println(list);
		int pos1 = in.nextInt();
		int pos2 = in.nextInt();
		System.out.println("Element from "+pos1+" : "+list.get(pos1-1));
		System.out.println("Element from "+pos2+" : "+list.get(pos2-1));
	}
}
