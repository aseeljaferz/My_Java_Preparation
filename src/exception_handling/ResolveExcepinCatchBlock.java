package exception_handling;
import java.util.*;
public class ResolveExcepinCatchBlock {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c;
		try {
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println(b/a);
		}
	}
}
