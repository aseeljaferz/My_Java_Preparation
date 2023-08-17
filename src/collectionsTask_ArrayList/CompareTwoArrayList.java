package collectionsTask_ArrayList;
import java.util.*;
public class CompareTwoArrayList {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele1[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list1 = new ArrayList<>();
		for(int i=0;i<ele1.length;i++) {
			list1.add(ele1[i]);
		}
		String ele2[] = {"Red", "Green", "Orange","Black"};
		List<String> list2 = new ArrayList<>();
		for(int i=0;i<ele2.length;i++) {
			list2.add(ele2[i]);
		}
		System.out.println(list1);
		System.out.println(list2);	
		ArrayList<String> list3 = new ArrayList<>();
		for(String e : list1) {
			list3.add(list2.contains(e)?"Yes" : "No");
		}
		System.out.println(list3);
	}

}
