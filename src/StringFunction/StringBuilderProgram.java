package StringFunction;
import java.util.*;
public class StringBuilderProgram {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		char[] c = {'a','b','c','d','e','f'};  
		
		StringBuilder sb1 = new StringBuilder("two is greater than one ?");
		System.out.println("builderObj : "+sb1.replace(0, 3, "ten"));
		sb1.append(true);
		System.out.println("after append : "+sb1.capacity());
		sb1.append(c,1,4);
		System.out.println("after append char : "+sb1);

	}

}
