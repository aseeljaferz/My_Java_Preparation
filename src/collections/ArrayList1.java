package collections;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
