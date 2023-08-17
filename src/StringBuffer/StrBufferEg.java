package StringBuffer;
import java.util.*;
public class StrBufferEg {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		StringBuffer sb = new StringBuffer("java is a programming language");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.substring(6));
		System.out.println(sb.substring(10, 22));
		System.out.println(sb.replace(0, 4, "c"));
		System.out.println("last index : "+sb.lastIndexOf("is",4));
		
		System.out.println();
		StringBuffer sb1 = new StringBuffer("test");
		System.out.println(sb1.capacity());
		System.out.println(sb1.insert(2,123));
		System.out.println(sb1.delete(2,5));
		System.out.println(sb1.charAt(3));
		

	}

}
