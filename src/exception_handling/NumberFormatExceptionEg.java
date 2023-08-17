package exception_handling;
import java.util.*;
public class NumberFormatExceptionEg {
	public static void main(String[] args) {
		try {
			String s="abc";  
			int i=Integer.parseInt(s);
			System.out.println(i);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
	}
}
