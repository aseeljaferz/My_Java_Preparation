package BetterTomorrow_String;
import java.util.*;
public class StringsRotatedotNot {

	public static boolean disp(String str1, String str2) {
		return (str1.length() == str2.length() && (str1+str1).indexOf(str2) != -1);
//			System.out.println("The String is rotated");
//		}
//		else {
//			System.out.println("The String is not rotated");
//		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		System.out.println(disp(str1,str2));
		
		
	}

}
