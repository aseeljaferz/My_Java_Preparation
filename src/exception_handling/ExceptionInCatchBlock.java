package exception_handling;
import java.util.*;
public class ExceptionInCatchBlock {
	public static void main(String[] args) {
		try {
			int a=50/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			int b=10/0;
		}
	}
}
