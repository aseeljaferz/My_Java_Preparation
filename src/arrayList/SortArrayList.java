package arrayList;
import java.util.*;
public class SortArrayList {
	public static void main(String[] args) {
	  List<Integer> list=new ArrayList<Integer>();  
	  list.add(21);  
	  list.add(11);  
	  list.add(51);  
	  list.add(1);  
	  Collections.sort(list);  
	  for(Integer number:list) {
	    System.out.println(number);
	  }
	}
}
