package exception_handling;
import java.util.*;
public class NestedTryBlock2 {
	public static void main(String[] args) {
		try {
			try {
				try {
					int a[]=new int[5];
					a[6]=10;
				}
				catch(ArithmeticException e) {
					System.out.println(e);
					System.out.println("inner try block 2");
				}
			}
			catch(ArithmeticException e) {
				System.out.println(e);
				System.out.println("inner try block 1");
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("outer(main) try block 2");
		}
		catch (Exception e) {  
            System.out.print("Exception");  
            System.out.println(" handled in main try-block");  
        }  
	}
}
