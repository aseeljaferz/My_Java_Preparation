package exception_handling;
import java.util.*;
public class NestedTryBlock1 {
	public static void main(String[] args) {
		try {
			try {
				System.out.println("Divide by 0");
				int a=50/0;
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int b[]=new int[5];
				b[6]=5;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("other statement");    
		}
		catch(Exception e) {
			System.out.println("Handlic outer catch");
		}
		System.out.println("normal flow...");
	}
}
