package javaacademy;
import java.util.*;
public class While_amstrongno {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int temp=n;
		int new_tmp = n;
		int rem, res = 0;
		int cnt=0;
		
		while(new_tmp!=0) {
			new_tmp /= 10;
			cnt++;
		}
		
		while(temp!=0) {
			
			rem = temp%10;
			res += Math.pow(rem, cnt);
			temp /= 10;
			
		}
		
		if(res == n) {
			System.out.println("It is an armstrong number");
		}
		else {
			System.out.println("It is not an armstrong number");
		}
		
	}
}
