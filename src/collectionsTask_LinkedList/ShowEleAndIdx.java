package collectionsTask_LinkedList;
import java.util.*;
public class ShowEleAndIdx {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new LinkedList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		int i=0;
		for(String color : list) {
			System.out.println("Element at index "+i+": "+color);
			i++;
		}
	}
}
