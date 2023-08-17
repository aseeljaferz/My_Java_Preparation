package BetterTomorrow_String;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		int left=0;
		int right = str.length()-1;
		int cnt=0;
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				cnt++;
				break;
			}
			left++;
			right--;
		}
		if(cnt==0){
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
