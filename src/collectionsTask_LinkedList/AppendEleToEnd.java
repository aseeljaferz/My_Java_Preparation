package collectionsTask_LinkedList;
import java.util.*;
public class AppendEleToEnd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<String> list = new LinkedList<>();
		while(true) {
			String inp = in.nextLine();
			if(inp.isEmpty()) {
				break;
			}
			list.add(inp);
		}
		System.out.println(list);
	}
}
