package collections;
import java.util.*;
public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();  
		set.add(2);  
		set.add(8);  
		set.add(5);  
		set.add(5);   
		Iterator<Integer> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}
}
