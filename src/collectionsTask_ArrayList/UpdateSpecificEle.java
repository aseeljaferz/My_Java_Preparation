package collectionsTask_ArrayList;
import java.util.*;
public class UpdateSpecificEle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ele[] = {"Red", "Green", "Orange", "White", "Black"};
		List<String> list = new ArrayList<>();
		for(int i=0;i<ele.length;i++) {
			list.add(ele[i]);
		}
		System.out.println(list);
		System.out.print("Enter the element to update: ");
		String str = in.next();
		if(list.contains(str)) {
			System.out.print("Enter the updated value: ");
            String update = in.next();
            int index = list.indexOf(str);
            System.out.println("After updation :");
            list.set(index, update);
            System.out.println(list);
		}
	}
}
