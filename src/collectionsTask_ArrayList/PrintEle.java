package collectionsTask_ArrayList;
import java.util.*;
public class PrintEle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<String> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			String color = in.next();
			list.add(color);
		}
		int i=1;
		for(String clr : list) {
			System.out.println(i+". "+clr);
			i++;
		}
	}
}
