package collectionsTask_ArrayList;
import java.util.*;
public class SwapTwoEle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new ArrayList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		
		System.out.println("Before Swap : ");
		for(String color : list) {
			System.out.println(color);
		}
		
		System.out.print("First element you want to swap : ");
		String color1 = in.next();
		int idx1 = list.indexOf(color1);
		
		System.out.print("Second element you want to swap : ");
		String color2 = in.next();
		int idx2 = list.indexOf(color2);
		
		Collections.swap(list, idx1, idx2);
		System.out.println("After Swap : ");
		for(String color : list) {
			System.out.println(color);
		}
		
	}
}
