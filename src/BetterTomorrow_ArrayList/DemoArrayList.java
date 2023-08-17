//array list will have duplicates

package BetterTomorrow_ArrayList;
import java.util.*;
public class DemoArrayList {

	public static void main(String[] args) {
		
		List<Integer> demo = new ArrayList<>();
		int a[] = {1,2,3,4,5};
		for(int i=0; i<a.length;i++) {
			demo.add(a[i]);
//			System.out.print(demo);                    //op:[1,2,3,4,5]
//			System.out.println(demo.size());   
		}
		
//		for(int i=0; i< demo.size(); i++) {
//			System.out.print(demo.get(i)+" ");        //op:1 2 3 4 5  --> normal for loop
//		}  
		
		for(Integer x : demo) {
			System.out.print(x+ " ");  //or:1 2 3 4 5   --> using enhanced for loop
		}
		
		
		Iterator itr = demo.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
