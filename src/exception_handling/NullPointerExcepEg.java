package exception_handling;
import java.util.*;
public class NullPointerExcepEg {
	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}
