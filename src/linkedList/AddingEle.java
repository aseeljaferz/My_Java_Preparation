package linkedList;
import java.util.*;
public class AddingEle {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();  
        System.out.println("Initial list of elements: "+ll);  
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        System.out.println(ll);  
        System.out.println();
        
        ll.add(1, "Gaurav");  
        System.out.println(ll);  
        LinkedList<String> ll2=new LinkedList<String>();  
        ll2.add("Sonoo");  
        ll2.add("Hanumat");  
        System.out.println();
     
        ll.addAll(ll2);  
        System.out.println(ll);  
        LinkedList<String> ll3=new LinkedList<String>();  
        ll3.add("John");  
        ll3.add("Rahul");  
        System.out.println();
 
        ll.addAll(1, ll3);  
        System.out.println(ll);  
       
        ll.addFirst("Lokesh");  
        System.out.println(ll);  
       
        ll.addLast("Harsh");  
        System.out.println(ll);  
	}
}
