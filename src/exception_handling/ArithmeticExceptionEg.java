package exception_handling;
import java.util.*;
public class ArithmeticExceptionEg {
	public static void main(String[] args) {
		try {
			int a=0/50;
			System.out.println(a+"is the ans");
			int b=50/0;
			System.out.println(b+"is the ans");
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("rest of the code...");
	}
}
